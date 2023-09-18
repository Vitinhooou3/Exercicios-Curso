package ExercicioSet.ExercicioSet2;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import ExercicioSet.ExercicioSet2.Models.LinguagemFavorita;

public class ExercicioSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> favOrdemDeInsercao = new LinkedHashSet<>();

        favOrdemDeInsercao.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
        favOrdemDeInsercao.add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
        favOrdemDeInsercao.add(new LinguagemFavorita("Dart", 2011, "AndroidStudio"));

        System.out.println("Lista em ordem de inserção: ");
        for (LinguagemFavorita linguagem : favOrdemDeInsercao) {
            System.out.println(linguagem);
        }

        Set<LinguagemFavorita> favOrdemNatural = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getNome));
        favOrdemNatural.addAll(favOrdemDeInsercao);
        System.out.println("------------------\nLista em ordem natural (nome): ");
        for (LinguagemFavorita linguagem : favOrdemNatural) {
            System.out.println(linguagem);
        }

        Set<LinguagemFavorita> favOrdemIDE = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getIDE));
        favOrdemIDE.addAll(favOrdemDeInsercao);
        System.out.println("------------------\nLista em ordem IDE: ");
        for (LinguagemFavorita linguagem : favOrdemIDE) {
            System.out.println(linguagem);
        }

        Set<LinguagemFavorita> favOrdemAnoENome = new TreeSet<>(Comparator.comparingInt(LinguagemFavorita::getAnoDeCriacao).thenComparing(LinguagemFavorita::getNome));
        favOrdemAnoENome.addAll(favOrdemDeInsercao);
        System.out.println("------------------\nLista em ordem de ano e nome: ");
        for (LinguagemFavorita liguagem : favOrdemAnoENome) {
            System.out.println(liguagem);
        }

        Set<LinguagemFavorita> favOrdemNomeAnoIDE = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getNome).thenComparingInt(LinguagemFavorita::getAnoDeCriacao).thenComparing(LinguagemFavorita::getIDE));
        favOrdemNomeAnoIDE.addAll(favOrdemDeInsercao);
        System.out.println("------------------\nLista em ordem de nome, ano e ide: ");
        for (LinguagemFavorita linguagem : favOrdemNomeAnoIDE) {
            System.out.println(linguagem);
        }
    }
}
