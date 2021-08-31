package optional;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Valor optional");

        Optional<String> optionalNull = Optional.empty();

        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.isEmpty());

        stringOptional.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        if (stringOptional.isPresent()) {
            String valor = stringOptional.get();

            System.out.println(valor);
        }

        stringOptional.map((valor) -> valor.concat("******")).ifPresent(System.out::println);

        stringOptional.orElseThrow(IllegalArgumentException::new);
    }
}
