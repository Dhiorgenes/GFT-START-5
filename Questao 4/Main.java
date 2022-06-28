import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     int valor;
     
     do{
        System.out.println("Digite um número entre 3 e 999: ");
        valor = leitor.nextInt();
     }while(valor < 3 || valor > 999);

     if(valor % 2 == 0 || valor % 3 == 0){
        System.out.println("O número não é primo.");
     }else{
        System.out.println("O número é primo.");
     }

    }
}
