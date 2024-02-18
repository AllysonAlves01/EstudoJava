package EstudoJava.DesafioCelular;

public class AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {
   private String mensagensSms;
   private  int telefone;
   private  double fotos;
   private  int calendario;
   private  String agenda;
   private String email;

   public void ligar(){
    System.out.println("Ligação iniciada.");
   }
   private void atender(){
    System.out.println("Ligação atendida");
   }
   private void recusar(){
    System.out.println("Ligação recusada");
   }
   private void iniciarCorreioVoz(){
    System.out.println("Correio de voz iniciado");
   }
   private void aumentarVolume(){
    System.out.println(" Aumentado volume");
   }
   private void diminuirVolume(){
    System.out.println(" diminuido volume");
   }

@Override
public void exibirPagina() {
   System.out.println("ExibindoPagina");
}

@Override
public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
}

@Override
public void atualizarPagina() {
  System.out.println("AtulizandoPagina");
}

@Override
public void tocar() {
   System.out.println("Tocando Música");
}

@Override
public void pausar() {
   System.out.println("Música pausada");
}

@Override
public void selecionarMusica() {
   System.out.println("SelecionandoMusica");
}


}
