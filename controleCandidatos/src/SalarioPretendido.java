import java.util.concurrent.ThreadLocalRandom;

public class SalarioPretendido {

    public double valorPretendido() { // Método para simular valor pretendido pelo candidato
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}