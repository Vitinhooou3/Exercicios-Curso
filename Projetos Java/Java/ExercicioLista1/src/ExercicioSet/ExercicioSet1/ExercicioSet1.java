package ExercicioSet.ExercicioSet1;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioSet1 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();

        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");

        System.out.println("Quantidade de Cores: " + coresArcoIris.size());
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        Set<String> coresOrdenadas = new TreeSet<>(coresArcoIris);
        System.out.println("\nOrdenado em ordem alfabetica: " + coresOrdenadas);

        Set<String> coresInversas = new LinkedHashSet<>();

        coresInversas.add("Vermelho");
        coresInversas.add("Laranja");
        coresInversas.add("Amarelo");
        coresInversas.add("Verde");
        coresInversas.add("Azul");
        coresInversas.add("Anil");
        coresInversas.add("Violeta");

        List<String> reverse = new ArrayList<>(coresInversas);
        Collections.reverse(reverse);

        System.out.println("\nPor ordem de inserção: " + coresInversas);
        System.out.println("Ordenado inversamente: " + reverse);

        System.out.println("\nCores com a letra V");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("V"))
                System.out.println(cor);
        }


        Iterator<String> coresSemV = coresArcoIris.iterator();
        while (coresSemV.hasNext()) {
            if (!coresSemV.next().startsWith("V"))
                coresSemV.remove();
        }
        System.out.println("\nCores sem a letra V removidas: " + coresArcoIris);

        coresArcoIris.clear();
        System.out.println("\nLista limpa: " + coresArcoIris.isEmpty());
    }
}
