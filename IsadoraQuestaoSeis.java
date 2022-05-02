/*A Loja Mamão com Açucar esta vendendo seus produtos em 5 (cinco) prestaçoes sem juros.
Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações*/
import java.util.Scanner;
public class IsadoraQuestaoSeis{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("--------------------------------------");
    System.out.println("|Bem vindo(a) a Loja Mamao com Acucar|");
    System.out.println("--------------------------------------");
    System.out.println("Cada compra sua pode ser dividida em 5 prestacoes sem juros\n");
    System.out.print("Digite o valor total de sua compra para saber quanto vai valer a prestacao: R$");
    double compra = sc.nextDouble();
    if(compra<=0){
      System.out.println("Tem certeza?");
      System.out.println("Realmente nao ta precisando de nada?");
      System.out.print("Digite o valor total de sua compra mais uma vez: R$");
      compra = sc.nextDouble();
    }else{
      System.out.println("Nao ta esquecendo nada?");
      System.out.print("Digite o valor total de sua compra mais uma vez: R$");
      compra = sc.nextDouble();
    }

    if(compra<=0){
      System.out.println("\nMuito obrigado e volte sempre!");
      System.out.println("A Loja fica aberta de segunda a sabado\n");
      System.out.println("---------------------------");
      System.out.println("|seg - sex| 09:00 as 17:00|");
      System.out.println("|--------------------------");
      System.out.println("|sab      | 09:00 as 12:00|");
      System.out.println("---------------------------");
    }else{
      double valorDasPrestacoes = compra /5;
      System.out.println("\nValor das prestacoes = 5x de "+valorDasPrestacoes);
      System.out.println("Muito obrigado e volte sempre!");
      System.out.println("A Loja fica aberta de segunda a sabado\n");
      System.out.println("---------------------------");
      System.out.println("|seg - sex| 09:00 as 17:00|");
      System.out.println("|--------------------------");
      System.out.println("|sab      | 09:00 as 12:00|");
      System.out.println("---------------------------");
    }
    sc.close();
  }
}
