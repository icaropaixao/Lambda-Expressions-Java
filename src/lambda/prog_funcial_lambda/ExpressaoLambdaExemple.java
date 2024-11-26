package lambda.prog_funcial_lambda;

import lambda.funcao_anonima.introducao.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ExpressaoLambdaExemple {

    //O que são "expressões lambda"?
    /*
    Emprogramação funcional, expressão lambda corresponde a uma
     funçãoanônimadeprimeiraclasse.
     */
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


        list.sort(ExpressaoLambdaExemple::compareProducts);
        list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())); // expressão lambda

        list.forEach(System.out::println);
    }
}
