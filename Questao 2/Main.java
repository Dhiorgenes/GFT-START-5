import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    cheques c = new cheques();
    Promissoria p = new Promissoria();
    titulos_do_governo t = new titulos_do_governo();

    String tipo;
    Double valor;
    int prazo;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe qual o tipo de recebível: ");
    tipo = leitor.nextLine();

    System.out.println("Informe o valor do recebível: ");
    valor = leitor.nextDouble();

    System.out.println("Informe o prazo: ");
    prazo = leitor.nextInt();

    //Cheque
    if(prazo == 30 && tipo == "Cheque"){
        valor -= valor * 0.05; 
        c.calcularValorRecebivel(valor);
    }
    if(prazo == 60 && tipo == "Cheque"){
        valor -= valor * 0.075; 
        c.calcularValorRecebivel(valor);
    }
    if(prazo == 90 && tipo == "Cheque"){
        valor -= valor * 0.10;
        c.calcularValorRecebivel(valor);
    }
    if(prazo > 90 && tipo == "Cheque"){
        int tempo = prazo / 30;
        valor -=  valor * (0.03 + tempo * 0.03);
        c.calcularValorRecebivel(valor);
    }

    //Promissoria
    if(prazo == 30 && tipo == "Promissória"){
        valor -= valor * 0.04; 
        p.calcularValorRecebivel(valor);
    }
    if(prazo == 60 && tipo == "Promissória"){
        valor -= valor * 0.065; 
        p.calcularValorRecebivel(valor);
    }
    if(prazo == 90 && tipo == "Promissória"){
        valor -= valor * 0.85;
        p.calcularValorRecebivel(valor);
    }
    if(prazo > 90 && tipo == "Promissória"){
        int tempo = prazo / 30;
        valor -=  valor * (0.03 + tempo * 0.02);
        p.calcularValorRecebivel(valor);
    }

    //Titulos do governo
    if(prazo == 30 && tipo == "Título do Governo"){
        valor -= valor * 0.03; 
        t.calcularValorRecebivel(valor);
    }
    if(prazo == 60 && tipo == "Título do Governo"){
        valor -= valor * 0.055; 
        t.calcularValorRecebivel(valor);
    }
    if(prazo == 90 && tipo == "Título do Governo"){
        valor -= valor * 0.10;
        t.calcularValorRecebivel(valor);
    }
    if(prazo > 90 && tipo == "Título do Governo"){
        int tempo = prazo / 30;
        valor -=  valor * (0.65 + tempo * 0.01);
        t.calcularValorRecebivel(valor);
    }
    
}
}
