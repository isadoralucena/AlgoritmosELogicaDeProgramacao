/*Escreva um programa que associe uma nota qualitativa a uma nota quantitativa
( 1 = Mau, 2 = Medíocre, 3 = Suficiente, 4 = Bom e 5 = Excelente)
Exiba uma mensagem informando a nota qualitativa e a nota quantitativa*/
import java.util.Scanner;
public class NotaQualitativaQuantitativa{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma nota inteira e positiva para saber sua nota qualitativa");
    System.out.println("ATENCAO! Ela tem que estar entre 1 e 5");
    System.out.print("Digite-a: ");
    int numero = sc.nextInt();

    if(numero<1 || numero>5){
      System.out.println("Nao ha nenhuma nota qualitativa para esse valor quantitativo");
      System.out.print("Por favor, digite uma nota inteira e positiva que esteja entre 1 e 5: ");
      numero = sc.nextInt();
    }
    switch(numero){
      case 1:
        System.out.println("---------");
        System.out.println("|1 = Mau|");
        System.out.println("---------");
        break;
      case 2:
        System.out.println("--------------");
        System.out.println("|2 = Mediocre|");
        System.out.println("--------------");
        break;
      case 3:
        System.out.println("----------------");
        System.out.println("|3 = Suficiente|");
        System.out.println("----------------");
        break;
      case 4:
        System.out.println("---------");
        System.out.println("|4 = Bom|");
        System.out.println("---------");
        break;
      case 5:
        System.out.println("---------------");
        System.out.println("|5 = excelente|");
        System.out.println("---------------");
        break;
      default:
        System.out.println("Nao ha nenhuma nota qualitativa para esse valor quantitativo");
        break;
    }
    sc.close();
  }
}
