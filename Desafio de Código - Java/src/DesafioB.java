import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DesafioB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int casos = teclado.nextInt();
        int cont = 0;
        while (cont < casos){
 
            double a = teclado.nextDouble();
            double b = teclado.nextDouble();
            double c = teclado.nextDouble();

            double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
            BigDecimal mediaf = new BigDecimal(media).setScale(1, RoundingMode.HALF_EVEN);
            System.out.println(mediaf.doubleValue());
            cont++;
        }
        teclado.close();
    }
}

/* 
Desafio:
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada:
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída:
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
*/
