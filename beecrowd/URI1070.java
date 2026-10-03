import java.util.Scanner;

public class URI1070 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicio = teclado.nextInt();

        if (inicio % 2 == 0) { // o numero inicial é par?
            inicio++;          // se for, torne-o impar
        }

        // agora vou contar até 6 e imprimir meu inicio somando 2 a cada passo
        for(int cont=1 ; cont <= 6 ; cont++){
            System.out.println(inicio);
            inicio += 2;
        }
        teclado.close();
    }
}
