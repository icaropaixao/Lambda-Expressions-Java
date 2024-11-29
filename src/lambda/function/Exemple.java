package lambda.function;

import java.util.function.Function;

public class Exemple {
    public static void main(String[] args) {
        // Define uma Function que transforma uma String em seu comprimento
        Function<String, Integer> stringLength = s -> s.length();
        
        String palavra = "Programação";
        Integer comprimento = stringLength.apply(palavra);

        System.out.println("A palavra \"" + palavra + "\" tem " + comprimento + " caracteres.");
    }
}
