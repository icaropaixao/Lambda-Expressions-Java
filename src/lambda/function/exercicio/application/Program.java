package lambda.function.exercicio.application;


import lambda.funcao_anonima.introducao.entities.Product;
import lambda.function.exercicio.entities.UppercaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Problema exemplo
/*
Fazer um programa que, apartir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta

*/
public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
                                                                 // convertendo para lista novamente
        List<String> names = list.stream().map(new UppercaseName()).collect(Collectors.toList());

        names.forEach(System.out::println);





    }


}
