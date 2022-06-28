import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz= new int[16][16];
        int valor;
        Scanner leitor = new Scanner(System.in);
        
        
        for(int contador = 0; contador < 4; contador++){
            for(int contador_2 = 0; contador_2 < 4; contador_2++){
                System.out.println("Digite um número");
                valor = leitor.nextInt();
                matriz[contador][contador_2] = valor;
            }
        }
        leitor.close();

        for(int n = 0; n < 4; n++){
            for(int m = 0; m < 4; m++){
                System.out.print(matriz[n][m] + " ");
            }
            System.out.println();
        }

        for(int mostrar = 0; mostrar < 4; mostrar++){
            for(int mostrar_2 = 0; mostrar_2 < 4; mostrar_2++){

                //Primeira linha
                if(mostrar == 0 && mostrar_2 == 0){
                    System.out.println("Não é possível imprimir o valor a esquerda");
                    System.out.println("Não é possível imprimir o valor acima");
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }
                if (mostrar == 0 && mostrar_2 > 0) {
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Não é possível imprimir o valor acima"); 
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                    
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }
                if (mostrar == 0 && mostrar_2 == 3) {
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Não é possível imprimir o valor acima"); 
                    System.out.println("Não é possível imprimir o valor a direita");                                  
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }

                //Segunda Linha
                if(mostrar == 1 && mostrar_2 == 0){
                    System.out.println("Não é possível imprimir o valor a esquerda");
                    System.out.println("Acima: " + matriz[mostrar -1][mostrar_2]); 
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                  
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }if(mostrar == 1 && mostrar_2 > 0){
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]);
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                    
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }
                if(mostrar == 1 && mostrar_2 == 3){
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]); 
                    System.out.println("Não é possível imprimir o valor a direita");                                  
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }

                //Terceira Linha              
                if(mostrar == 2 && mostrar_2 == 0){
                    System.out.println("Não é possível imprimir o valor a esquerda");
                    System.out.println("Acima: " + matriz[mostrar -1][mostrar_2]); 
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                  
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }if(mostrar == 2 && mostrar_2 > 0){
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]);
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                    
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }
                if(mostrar == 2 && mostrar_2 == 3){
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]); 
                    System.out.println("Não é possível imprimir o valor a direita");                                  
                    System.out.println("Abaixo: " + matriz[mostrar + 1][mostrar_2]);
                }

                //Quarta Linha               
                if(mostrar == 3 && mostrar_2 == 0){
                    System.out.println("Não é possível imprimir o valor a esquerda");
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]); 
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                  
                    System.out.println("Não é possível imprimir o valor abaixo");
                }if(mostrar == 3 && mostrar_2 > 0){
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]);
                    System.out.println("Direita: " + matriz[mostrar][mostrar_2 + 1]);                                    
                    System.out.println("Não é possível imprimir o valor abaixo");
                }
                if(mostrar == 3 && mostrar_2 == 3){
                    System.out.println("Esquerda: " + matriz[mostrar][mostrar_2 - 1]);
                    System.out.println("Acima: " + matriz[mostrar - 1][mostrar_2]); 
                    System.out.println("Não é possível imprimir o valor a direita");                                  
                    System.out.println("Não é possível imprimir o valor abaixo");
                }
            }
        } 
    }
}
