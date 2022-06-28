import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     Trabalhador t = new Trabalhador();

     System.out.println("Informe quantos trabalhadores dejesa cadastrar: ");
     int valor = leitor.nextInt();
     String nome;
     Double SalarioHora, horasT;
     boolean verificar = false;
     String VerTrabalhador;
    
     
     while(valor < 5)
     {
        System.out.println("Deve ter pelo menos 5 trabalhadores.");
     }

        for(int contador = 1 ; contador <= valor; contador++){
            System.out.println("Informe o nome do trabalhador: ");
            nome = leitor.nextLine();
            t.setNome(nome);

            System.out.println("Informe o valor do Salário/Hora: ");
            SalarioHora = leitor.nextDouble();
            t.setSalarioPorHora(SalarioHora);

            System.out.println("Informe o valor do Salário/Hora: ");
            horasT = leitor.nextDouble();
            t.setHorasTrabalhadas(horasT);
        }

        System.out.println("Deseja Visualizar as informações de algum trabalhador: ");
        verificar = leitor.nextBoolean();
        if(verificar){
            System.out.println("Qual trabalhador deseja ver: ");
            VerTrabalhador = leitor.nextLine();

            t.getNome();
            t.getHorasTrabalhadas();
            t.getSalarioPorHora();
            
        }else{
            System.out.println("Encerrando...");
        }

    }
}
