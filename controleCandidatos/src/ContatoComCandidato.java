public class ContatoComCandidato {

    public void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        Atendimeto atendimento = new Atendimeto();
        do {
            atendeu = atendimento.atender(); // verificando se atendeu
            continuarTentando = !atendeu; // se atendeu, então nao deve continuar tentando !atendeu
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3); // verificação de tentativas de ligações

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ",número máximo tentativas"
                    + tentativasRealizadas + "realizada");
        }

    }
}
