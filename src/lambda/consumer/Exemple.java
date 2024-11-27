package lambda.consumer;

import java.util.function.Consumer;

public class Exemple {
    public static void main(String[] args) {


        // Consumer que imprime o nome passado
        Consumer<String> printName = name -> System.out.println("Olá, " + name);

        // Usando o Consumer
        printName.accept("Ícaro");  // Saída: Olá, Ícaro
        printName.accept("Maria");  // Saída: Olá, Maria
    }
}
