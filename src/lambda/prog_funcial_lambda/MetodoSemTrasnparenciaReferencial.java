package lambda.prog_funcial_lambda;

import java.util.Arrays;

public class MetodoSemTrasnparenciaReferencial {
    public static int globalValue = 3;

    public static void main(String[] args) {
        int[] vect = new int[] {3, 4, 5};

        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));

    }

    // METODO SEM TRASNPARENCIA REFERENCIAL
    /*
    Porque depende de outros resultados para funcionar
    e não somente dela
    depende do valor da variavel "globalValue" nessa classe
     */
    public static void changeOddValues(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }

}
