/*Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dolar (US$).
O algoritmo devera solicitar o valor da cotacao do dolar e tambem a quantidade de dolares disponiveis com o usuario.*/
import java.util.Scanner;
public class IsadoraQuestaoQuatro{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual a cotacao do dolar (use virgula, nao ponto)");
    double cotacao = sc.nextDouble();

    System.out.println("O que voce quer fazer?");
    System.out.println("Digite '1' sem aspas para converter dolar em real");
    System.out.println("Ou digite '2' sem aspas para converter real em dolar");
    int opcao = sc.nextInt();

    System.out.println("Quanto deseja converter? ");
    double dinheiro = sc.nextDouble();

    switch(opcao){
      case 1:
        double real = dinheiro *cotacao ;
        System.out.println("Voce tem esse valor em real: R$" +real);
        break;
      case 2:
        double dolar = dinheiro/cotacao ;
        System.out.println("Voce tem esse valor em dolar: US$" +dolar);
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
    sc.close();
  }
}
