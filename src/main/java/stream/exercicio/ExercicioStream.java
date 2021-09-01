package stream.exercicio;

import comparators.Estudante;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStream {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("João", 12));
        estudantes.add(new Estudante("Maria", 11));
        estudantes.add(new Estudante("Joana", 13));
        estudantes.add(new Estudante("Julia", 11));
        estudantes.add(new Estudante("Marcos", 18));
        estudantes.add(new Estudante("Bruna", 19));

        System.out.println(estudantes.stream().map(Estudante::toString).collect(Collectors.toList()));

        System.out.println(estudantes.stream().count());

        System.out.println(estudantes.stream().filter((estudante) -> estudante.getIdade() >= 18).collect(Collectors.toList()));

        estudantes.stream().forEach(System.out::println);

        System.out.println(estudantes.stream().filter((estudante) -> estudante.getNome().toLowerCase().contains("b")).collect(Collectors.toList()));

        System.out.println("Existe ao menos 1 estudante com a letra d? " + estudantes.stream().anyMatch(estudante -> estudante.getNome().toLowerCase().contains("d")));

        System.out.println("estudante mais velho: " + estudantes.stream().max(Comparator.comparingInt(Estudante::getIdade)));

        System.out.println("estudante mais novo: " + estudantes.stream().min(Comparator.comparingInt(Estudante::getIdade)));
    }
}
