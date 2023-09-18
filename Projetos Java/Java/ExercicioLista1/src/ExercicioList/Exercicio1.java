package ExercicioList;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Map<String, Double> mesTemperatura = new HashMap<>();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Informe o mes e a temperatura registrada: ");
            String mes = sc.next();
            double temperatura = sc.nextDouble();
            mesTemperatura.put(mes, temperatura);
        }

        double somaTemperaturas = 0;
        for (Double temperatura : mesTemperatura.values()) {
            somaTemperaturas += temperatura;
        }

        double mediaTemperatura = somaTemperaturas / 6;

        System.out.println("\nTemperatura media do semestre: " + mediaTemperatura + "\n");

        System.out.println("Meses com temperaturas acima da media: \n--------------------------------");
        for (Map.Entry<String, Double> temperaturasAcima : mesTemperatura.entrySet()) {
            if (temperaturasAcima.getValue() > mediaTemperatura)
                System.out.println(temperaturasAcima.getKey() + " - Temperatura: " + temperaturasAcima.getValue());
        }*/

        List<Integer> temperatura = new ArrayList<>();

        System.out.println("Informe as temperaturas dos meses de Janeiro a Junho: ");
        for (int i = 0; i <= 5; i++) {
            temperatura.add(sc.nextInt());
        }

        int media = temperatura.stream().mapToInt(Integer::intValue).sum() / 6;

        System.out.println("\nMedia semestral de temperatura: " + media + "\n");

        System.out.println("Meses com temperaturas acima da media: \n--------------------------------");
        for (int i = 0; i < temperatura.size(); i++) {
            if (temperatura.get(i) > media) {
                switch (i) {
                    case 0 -> System.out.println("1 - Janeiro, temperatura: " + temperatura.get(i));
                    case 1 -> System.out.println("2 - Fevereiro, temperatura: " + temperatura.get(i));
                    case 2 -> System.out.println("3 - Março, temperatura: " + temperatura.get(i));
                    case 3 -> System.out.println("4 - Abril, temperatura: " + temperatura.get(i));
                    case 4 -> System.out.println("5 - Maio, temperatura: " + temperatura.get(i));
                    case 5 -> System.out.println("6 - Junho, temperatura: " + temperatura.get(i));
                }
            }

        }
    }
}
