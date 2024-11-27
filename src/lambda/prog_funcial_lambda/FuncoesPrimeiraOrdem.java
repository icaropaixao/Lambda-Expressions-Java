package lambda.prog_funcial_lambda;

import lambda.funcao_anonima.introducao.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class FuncoesPrimeiraOrdem {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());

    }

    // METODO REFERENCIAL
    /*
     Utilizamos aqui
     "method references"
         Operador ::

         Sintaxe:
         Classe::método
     */
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //            Classe           |   Método
        list.sort(FuncoesPrimeiraOrdem::compareProducts);
        list.forEach(System.out::println);
    }

}
