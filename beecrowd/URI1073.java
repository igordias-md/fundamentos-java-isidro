import java.util.Scanner;

public class URI1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int limite = teclado.nextInt();

        for(int cont=2; cont<=limite; cont+=2){
            System.out.println(cont+"^2 = "+ (cont * cont));
        }
        teclado.close();
    }

}