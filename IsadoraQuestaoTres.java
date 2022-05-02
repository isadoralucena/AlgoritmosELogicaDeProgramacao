/*Ler dois valores para as variaveis A e B,
e efetuar as trocas dos valores de forma que a variavel A passe a possuir o valor da variavel B
e a variavel B passe a possuir o valor da variavel A. Apresentar os valores trocados.*/
import java.util.Scanner;
public class IsadoraQuestaoTres{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um valor para a variavel a: ");
    int a = sc.nextInt();
    System.out.print("Digite um valor para a variavel b: ");
    int b = sc.nextInt();
    a = b;
    b = a;
    System.out.println("Variavel a = "+a);
    System.out.println("Variavel b = "+b);
    sc.close();
  }
}
