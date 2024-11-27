package lambda.predicate;

import java.util.function.Predicate;

public class Exemple {
    public static void main(String[] args) {

        // Predicate que testa se um número é maior que 10
        Predicate<Integer> isGreaterThanTen = numeroQualquer -> numeroQualquer > 100;

        // Testando o Predicate
        System.out.println(isGreaterThanTen.test(15)); // true
        System.out.println(isGreaterThanTen.test(8));  // false
    }
}
