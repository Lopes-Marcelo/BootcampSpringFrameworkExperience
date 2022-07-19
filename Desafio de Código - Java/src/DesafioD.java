import java.util.*;
 
public class DesafioD{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int[] idade = new int[N];
        for (int i = 0; i < N; i++){
            idade[i] = teclado.nextInt();
        }
        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++){
            if (idade[i] < 18){
                System.out.println(idade[i]);
            }
        }
        teclado.close();
    }

}

/*
Desafio:
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.

Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos. Faça um programa para ler um número N, a idade de N pessoas. Depois disso, coloque a idade mínima permitida  para se entrar no local, conforme exemplo. 
    
Entrada: 4 18 22 15 50  
Saída: 4 15
*/