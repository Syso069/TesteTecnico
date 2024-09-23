import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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