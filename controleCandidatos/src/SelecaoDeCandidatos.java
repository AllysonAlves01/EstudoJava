public class SelecaoDeCandidatos {
    public void selecaoCandidatos() {
        SalarioPretendido salario = new SalarioPretendido();
        String[] candidatos = { "Felipe", "Marica", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };

        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = salario.valorPretendido();

            System.out.println("O candidato " + candidato + "Solciitou este valor de salário " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidado " + candidato + " foi selecionado para a vaga");
                candidatosSelecionado++;
            }
            candidatoAtual++;
        }
    }
}
