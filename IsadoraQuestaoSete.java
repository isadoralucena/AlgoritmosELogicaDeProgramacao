/*Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
Sabe-se que o preço de custo recebera um acrescimo de acordo com um percentual informado pelo usuario.*/
import java.util.Scanner;
public class IsadoraQuestaoSete{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o preco de custo de um produto: R$");
    double precoDeCusto = sc.nextDouble();

      while(precoDeCusto<0){
        System.out.print("Nao existe preco negativo, digite um valido: R$");
        precoDeCusto = sc.nextDouble();
      }

    System.out.println("Considere o exemplo abaixo:");
    System.out.println("\n20% em decimal fica 0,20");
    System.out.println("Entao utilizando esses 0,20 o valor de venda seria = "+precoDeCusto*(0.20+1.0));
    System.out.println("\nAgora informe a porcentagem em decimal de quanto sera o acrescimo sobre R$"+precoDeCusto);
    double percentual = sc.nextDouble();
    double precoDeVenda = precoDeCusto*(1.0+percentual);

    if(percentual==0){
      System.out.println("Assim nao obtera lucro");
      System.out.println("Digite a porcentagem em decimal de novo:");
      percentual = sc.nextDouble();
    }else if(percentual<0){
      System.out.println("Assim nao obtera lucro, sera um desconto sobre o valor do produto");
      System.out.println("Digite a porcentagem em decimal de novo:");
      percentual = sc.nextDouble();
    }else{
      System.out.println("Preco de venda = R$"+precoDeVenda);
      System.exit(0);
    }

    if(percentual==0){
      System.out.println("Assim nao obtera lucro");
      System.out.println("Preco de venda = R$"+precoDeVenda);
    }else{
      System.out.println("Assim nao obtera lucro, sera um desconto sobre o valor do produto");
      System.out.println("Preco de venda = R$"+precoDeVenda);
    }
    sc.close();
  }
}
