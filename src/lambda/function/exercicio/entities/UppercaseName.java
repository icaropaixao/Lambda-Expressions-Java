package lambda.function.exercicio.entities;

import lambda.funcao_anonima.introducao.entities.Product;

import java.util.function.Function;
                                       // tipo de entrada | Retunr
public class UppercaseName implements Function<Product,String> {

    // method
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
