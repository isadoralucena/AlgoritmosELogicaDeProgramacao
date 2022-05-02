/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10
O usuário deve informar de qual número ele deseja ver a tabuada
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5: 5 X 1 = 5, 5 X 2 = 10...5 X 10 = 50*/
import java.util.Scanner;
public class Tabuada{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero inteiro entre 1 a 10");
    int numero = sc.nextInt();
    while(numero<1 || numero>10){
      System.out.println("--------------------------------");
      System.out.println("|Ele precisa estar entre 1 e 10|");
      System.out.println("--------------------------------");
      System.out.println("Digite um numero valido");
      numero = sc.nextInt();
    }

    for(int i = 0; i<=10;i++){
      System.out.println(+numero+" x "+i+ " = "+(numero*i));
    }
    sc.close();
  }
}
