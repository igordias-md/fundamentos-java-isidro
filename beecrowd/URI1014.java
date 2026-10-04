import java.util.Scanner;

public class URI1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int distancia = teclado.nextInt();
        float consumo = teclado.nextFloat();

        float media = distancia/consumo;

        System.out.printf( "%.3f km/l%n", media);
        
        teclado.close();
    }
}
