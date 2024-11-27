package lambda.predicate.exercicio.util;

import lambda.funcao_anonima.introducao.entities.Product;

import java.util.function.Predicate;

public class PredicateProduct implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }


}
