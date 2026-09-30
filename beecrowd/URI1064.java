import java.util.Scanner;

public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor, media=0;
        int numPos = 0;
        for(int cont=1 ; cont <= 6 ; cont++){
            valor = teclado.nextFloat();
            if(valor > 0){
                media = media + valor;
                numPos++;
            }
        }
        System.out.println(numPos + " valores positivos");
        System.out.printf("%.1f\n", (media/numPos));
        teclado.close();
    }
}
