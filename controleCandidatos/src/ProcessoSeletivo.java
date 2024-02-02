public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       analisarCandidato(1900.);
       analisarCandidato(2200.);
       analisarCandidato(2000.);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){

            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardandoo resultado dos demais candidatos");
        }
        

    }
}