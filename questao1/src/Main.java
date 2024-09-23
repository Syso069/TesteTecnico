import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores
//        anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informando um número,
//        ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

        System.out.println("Digite um número:\n");

        Scanner numeroDigitado = new Scanner(System.in);
        int valorDigitado = numeroDigitado.nextInt();
        int numeroAtual = 0;
        int proximoNumero = 1;
        boolean encontrei = false;

        while (numeroAtual <= valorDigitado){

            if (valorDigitado == numeroAtual) {
                encontrei = true;
                break;
            }
            int soma = numeroAtual + proximoNumero;
            System.out.println("Sequência: " + numeroAtual + " + " + proximoNumero + " = " + soma);
            numeroAtual = proximoNumero;
            proximoNumero = soma;
        }

        if (encontrei){
            System.out.println("\nO número: " + valorDigitado + " pretence a sequência de Fibonacci!");
        } else {
            System.out.println("\nO número: " + valorDigitado + " NÃO pretence a sequência de Fibonacci!");
        }

    }
}