import java.util.Scanner;

public class URI1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha;

       do{
        senha = teclado.nextInt();
        if (senha != 2002) {
            System.out.println("Senha Invalida");        
        } else{
            System.out.println("Acesso Permitido");
        }
    } while(senha != 2002);
        teclado.close();
    }    
}
