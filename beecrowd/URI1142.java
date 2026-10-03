import java.util.Scanner;

public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas = teclado.nextInt();
        int num=1;

        for(int cont=1 ; cont <= linhas ; cont ++){
            System.out.println(num + " " + (num+1) + " " + (num+2) + " PUM");
            num+=4;
        }
        teclado.close();
    }
}