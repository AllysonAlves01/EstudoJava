import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        String[] candidatos = { "Felipe", "Marica", "Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
      
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu=atender(); // verificando se atendeu
            continuarTentando = !atendeu; // se atendeu, então nao deve continuar tentando !atendeu
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
            
        } while (continuarTentando&& tentativasRealizadas < 3 ); // verificação de tentativas de ligações

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ",número máximo tentativas" + tentativasRealizadas + "realizada");
        }

    }
    static boolean atender(){
        return new Random().nextInt(3) ==1; // Verificando se o valor entre 1 e 3 for igual a 1 = true(Atendeu)
    }

    static void imprimirSelecionados(){
        String[] candidatos = { "Felipe", "Marica", "Julia", "Paulo", "Augusto"};
        System.out.println("Lista dos candidatos aprovados");
        for(String candidato: candidatos){
           System.out.println("O candidato selecionado foi " + candidato); 
        }
    }   

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marica", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solciitou este valor de salário " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidado " + candidato + " foi selecionado para a vaga");
                candidatosSelecionado++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() { // Método para simular valor pretendido pelo candidato
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {

            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardandoo resultado dos demais candidatos");
        }

    }
    
}
