import java.util.Scanner;

public class Tabuada{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, resultado, contador;
        System.out.println("Digite um valor:");
        numero = teclado.nextInt();

        contador = 1;
        while (contador <= 10) {
            resultado = numero * contador;
            System.out.println("O resultado da tabuada de 1 a 10 do valor digitado é:");
            System.out.println(numero + " x " + contador +  " = " + resultado);
            contador = contador + 1; 
        }
    teclado.close();
    }
}