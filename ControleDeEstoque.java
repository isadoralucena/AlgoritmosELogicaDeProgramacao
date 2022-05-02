import java.util.Scanner;

public class ControleDeEstoque{
  public static void main(String[] args)throws java.lang.Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos itens ha no seu estoque no momento?");
    int itens = sc.nextInt();
    if(itens>150){
      System.out.println("Entao, seu estoque esta suficiente");
    }else if(itens<150 && itens>50){
      System.out.println("Entao, seu estoque esta em alerta");
    }else{
      System.out.println("Entao, seu estoque esta abaixo do ideal");
    }
    sc.close();
  }
}
