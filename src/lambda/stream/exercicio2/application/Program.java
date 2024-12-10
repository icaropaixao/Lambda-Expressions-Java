package lambda.stream.exercicio2.application;

import lambda.funcao_anonima.introducao.entities.Product;
import lambda.stream.exercicio2.entities.Funcionarios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Funcionarios> list = new ArrayList<>();




        }catch (IOException erro){
            System.out.println(erro.getMessage());
        }


    }
}

