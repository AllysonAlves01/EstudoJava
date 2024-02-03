public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        SelecaoDeCandidatos selecao = new SelecaoDeCandidatos();
        ContatoComCandidato contato = new ContatoComCandidato();

        selecao.selecaoCandidatos();

        String[] candidatos = { "Felipe", "Marica", "Julia", "Paulo", "Augusto" };
        for (String candidato : candidatos) {
            contato.entrandoEmContato(candidato);
        }
    }
}
