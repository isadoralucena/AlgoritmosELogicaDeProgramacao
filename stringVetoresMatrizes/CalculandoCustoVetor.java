package stringVetoresMatrizes;
/*Faça um programa que leia o nome, o custo
e o preço de 50 produtos.
Ao final deverá relacionar os produtos que:
a) Tem lucro menor do que 10%
b) Tem lucro entre 10% e 30%
c) Tem lucro maior que 30%*/
import java.util.Scanner;
public class CalculandoCustoVetor{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = 2;
    String nomeProduto[] = new String[n];
    double custo[] = new double[n];
    double preco[] = new double[n];

    for(int i=0;i<n;i++){
      System.out.print("Nome do produto: ");
      nomeProduto[i] = sc.next();
      System.out.print("Custo do produto: ");
      custo[i] = sc.nextDouble();
      System.out.print("Preco do produto: ");
      preco[i] = sc.nextDouble();
    }


    for(int i=0;i<n;i++){
      double lucro = (preco[i] / custo[i]) * 100;
      if(lucro < 10){
        System.out.println("O lucro do produto '"+nomeProduto[i]+"' eh menor 10%");
      }else if(lucro >= 10 && lucro <= 30){
        System.out.println("O lucro do produto '"+nomeProduto[i]+"' esta entre 10% e 30%");
      }else{
        System.out.println("O lucro do produto '"+nomeProduto[i]+"' eh maior que 30%");
      }
    }
    sc.close();
  }
}
