import java.util.Random;

public class Atendimeto {
    public boolean atender() {
        return new Random().nextInt(3) == 1; // Verificando se o valor entre 1 e 3 for igual a 1 = true(Atendeu)
    }
}
