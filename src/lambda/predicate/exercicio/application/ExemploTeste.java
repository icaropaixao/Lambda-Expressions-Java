package lambda.predicate.exercicio.application;


import lambda.funcao_anonima.introducao.entities.Product;
import lambda.predicate.exercicio.util.PredicateProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Problema exemplo
 /*
 Fazer um programa que,a partir de uma lista de produtos, remova da
lista somente aqueles cujo preço mínimo seja 100

  */
public class ExemploTeste {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> pred = p -> p.getPrice() >= 100; // testa os itens que são maiores que 100

        list.removeIf(pred);

        for (Product p : list){
            System.out.println(p);
        }


        }

    }

