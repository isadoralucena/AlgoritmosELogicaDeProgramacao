/*Desenvolver um algoritmo que leia um número N maior que 1000 e menor que 1999,
calcule e escreva a média aritmética,
a quantidade de valores positivos,
a quantidade de números que quando divididos por 11 obtemos resto = 5,
a quantidade de valores negativos de 1 a N.*/
import java.util.Scanner;
public class ExercicioComWhile{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero que seja maior que 1000 e menor que 1999: ");
    int n = sc.nextInt();
    while(n<=1000 || n>=1999){
      System.out.println("-------------------------------------------------");
      System.out.println("|Ele precisa ser maior que 1000 e menor que 1999|");
      System.out.println("-------------------------------------------------");
      System.out.println("Digite um numero valido: ");
      n = sc.nextInt();
    }

    int cont=1;
    int soma = 0;
    while(cont<=n){
      cont++;
      soma += cont;
    }
    float mediaArit= (float)soma / n;
    System.out.println("A media aritmetica dos numeros entre 1 e "+n+" eh = "+mediaArit);

    System.out.println("--------------------------------------------------------------------------");
    System.out.println("A quantidade de numeros positivos de 1 ate "+n+ " sera "+n);

    System.out.println("--------------------------------------------------------------------------");
    cont=1;
    int quantidade=0;
    while(cont<=n){
      if(cont%11==5){
        quantidade++;
      }
      cont++;
    }
    System.out.println("A quantidade de numeros de 1 ate "+n+ " que quando divididos por 11 obtem-se resto = 5 eh "+quantidade);
    System.out.println("--------------------------------------------------------------------------");
    System.out.println("A quantidade de numeros negativos de 1 ate "+n+" eh 0");
    System.out.println("Pois "+n+" precisava ser positivo para o programa avancar");
    sc.close();
  }
}
