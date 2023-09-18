package ExercicioMap.ExercicioMap1;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<String, Integer> estadosPopulacoes = new LinkedHashMap<>();

        estadosPopulacoes.put("PE", 9616621);
        estadosPopulacoes.put("AL", 3351543);
        estadosPopulacoes.put("CE", 9187103);
        estadosPopulacoes.put("RN", 3534265);

        System.out.println("Estados e população em ordem de inserção: ");
        for (Map.Entry<String, Integer> estadoPopulacao : estadosPopulacoes.entrySet()) {
            System.out.println(estadoPopulacao.getKey() + " - " + estadoPopulacao.getValue());
        }

        estadosPopulacoes.put("RN", 3534165);
        System.out.println("--------------\nSubstituido população de RN para " + estadosPopulacoes.get("RN"));

        System.out.println("--------------\nVerifica se há o Estado PB, se não houver adicina");
        if (!estadosPopulacoes.containsKey("PB"))
            estadosPopulacoes.put("PB", 4039277);

        System.out.println(estadosPopulacoes.keySet());

        System.out.println("--------------\nPopulação de PE: " + estadosPopulacoes.get("PE"));

        System.out.println("--------------\nEstados e populações ordenados alfabeticamente: ");
        Map<String, Integer> estadosPopulacoesOrdenadas = new TreeMap<>(estadosPopulacoes);
        for (Map.Entry<String, Integer> estadoPopulacao : estadosPopulacoesOrdenadas.entrySet()) {
            System.out.println(estadoPopulacao.getKey() + " - " + estadoPopulacao.getValue());
        }

        int maiorPopulacao = 0;
        String estadoMaioPopulacao = "";
        for (Map.Entry<String, Integer> estadoPopulacao : estadosPopulacoes.entrySet()) {
            if (estadoPopulacao.getValue() > maiorPopulacao) {
                maiorPopulacao = estadoPopulacao.getValue();
                estadoMaioPopulacao = estadoPopulacao.getKey();
            }
        }
        System.out.println("--------------\nO Estado de maior população é: " + estadoMaioPopulacao + " - " + maiorPopulacao);

        int somatoriaPopulacoes = 0;
        for(Map.Entry<String, Integer> estadoPopulacao : estadosPopulacoes.entrySet()) {
            somatoriaPopulacoes += estadoPopulacao.getValue();
        }
        System.out.println("---------------\nA somatoria das populações é " + somatoriaPopulacoes + " e a media é " + somatoriaPopulacoes / 4);

        System.out.println("---------------\nRemovendo todos os estados com população maior que 4000000");
        List<String> estadosRemover = new ArrayList<>();
        for (Map.Entry<String, Integer> estadoPopulacao : estadosPopulacoes.entrySet()) {
            if (estadoPopulacao.getValue() > 4000000)
                estadosRemover.add(estadoPopulacao.getKey());
        }
        for (String estado : estadosRemover) {
            estadosPopulacoes.remove(estado);
        }
        System.out.println("Estados que sobraram: ");
        for (Map.Entry<String, Integer> estadoPopulacao : estadosPopulacoes.entrySet()) {
            System.out.println(estadoPopulacao.getKey() + " - " + estadoPopulacao.getValue());
        }

        System.out.println("--------------\nLimpando a lista");
        estadosPopulacoes.clear();
        System.out.println("Lista está vazia: " + estadosPopulacoes.isEmpty());

    }
}
