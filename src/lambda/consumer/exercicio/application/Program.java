package lambda.consumer.exercicio.application;

import lambda.consumer.exercicio.util.PriceUpdate;
import lambda.funcao_anonima.introducao.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

// Problema exemplo
/*
    Fazer um programa que,apartir de uma lista de produtos,aumente o
    preço dos produtos em 10%.
 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));


        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

        list.forEach(cons); // aumentando 10%

        list.forEach(System.out::println);

    }
}
