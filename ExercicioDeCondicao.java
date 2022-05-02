/*Faça um algoritmo que leia um número qualquer,
testar se o mesmo é maior ou igual a 7
Se sim, imprimi-lo somando-o ao número 3
Se não, imprimi-lo subtraindo-o do número 2*/
import java.util.Scanner;
public class ExercicioDeCondicao{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero qualquer: ");
    int numero = sc.nextInt();
    if(numero>=7){
      System.out.println(numero+" + 3 = "+(numero+3));
    }else{
      System.out.println(numero+" - 2 = "+(numero-2));
    }
    sc.close();
  }
}
