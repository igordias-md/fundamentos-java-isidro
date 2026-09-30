import java.util.Scanner;

public class NovoExercicioFor{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        System.out.println("Digite um valor");
        numero = teclado.nextInt();
        for(int contador = 1 ; contador <= 10 ; contador++){
            resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
        } teclado.close();
    }
}