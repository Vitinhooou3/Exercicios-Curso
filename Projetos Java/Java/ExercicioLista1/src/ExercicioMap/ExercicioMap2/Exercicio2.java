package ExercicioMap.ExercicioMap2;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> dados = new TreeMap<>();

        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = random.nextInt(6) + 1;

            if (!dados.containsKey(numeroAleatorio)) {
                dados.put(numeroAleatorio, 1);
            }
            else {
                for (Map.Entry<Integer, Integer> dado : dados.entrySet()) {
                    if (dado.getKey() == numeroAleatorio)
                        dados.put(numeroAleatorio, dado.getValue()+1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> dado : dados.entrySet()) {
            System.out.println("Numero: " + dado.getKey() + ", vezes que se repetiu: " + dado.getValue());
        }
    }
}
