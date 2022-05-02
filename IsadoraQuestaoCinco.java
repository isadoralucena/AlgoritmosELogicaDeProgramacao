/*Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento apos um mes.
Considere fixo o juro da poupança em 0,70% a.m.(ao mes)*/
import java.util.Scanner;
public class IsadoraQuestaoCinco{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Quanto voce depositou nesse mes? R$");
    float deposito = sc.nextFloat();

    final float JURO_DA_POUPANCA = 0.70f;
    float rendimento = deposito * JURO_DA_POUPANCA;
    float totalNaConta = deposito + rendimento;
    System.out.println("----------------------------------------------");
    System.out.println("Deposito: R$"+deposito);
    System.out.println("Rendimento ao mes: R$"+rendimento);
    System.out.println("Total na poupanca: R$"+totalNaConta);
    System.out.println("----------------------------------------------");
    sc.close();
  }
}
