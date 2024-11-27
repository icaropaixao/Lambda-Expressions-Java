package lambda.consumer.exercicio.util;

import lambda.funcao_anonima.introducao.entities.Product;
import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.10); // aumentando o preço em 10%
    }
}
