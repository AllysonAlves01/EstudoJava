public class ListaDeCandidatosSelecionados {
    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marica", "Julia", "Paulo", "Augusto" };
        System.out.println("Lista dos candidatos aprovados");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
}
