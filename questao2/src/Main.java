import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra:\n");

        Scanner palavraDigitada = new Scanner(System.in);
        String palavra = palavraDigitada.nextLine();
        String palavraLowerCase = palavra.toLowerCase();
        char procuraPor = 'a';
        int contador = 0;

        for (int i = 0; i < palavraLowerCase.length(); i++){
            if (palavraLowerCase.charAt(i) == procuraPor){
                contador++;
            }
        }
        System.out.println(palavraLowerCase);
        System.out.println("A frequência do caracter '" + procuraPor + "' da palavra: " + palavraLowerCase + " é: " + contador);
    }
}
