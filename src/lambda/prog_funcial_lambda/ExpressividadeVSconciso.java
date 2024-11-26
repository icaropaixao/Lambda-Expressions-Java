package lambda.prog_funcial_lambda;

import lambda.funcao_anonima.introducao.entities.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExpressividadeVSconciso {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Jeito Verboso
        Integer sum = 0;
        for(Integer x : list) {
            sum+= x;
        }

        // Forma concisa
        Integer sum2 = list.stream().reduce(0, Integer::sum);

    }
}
