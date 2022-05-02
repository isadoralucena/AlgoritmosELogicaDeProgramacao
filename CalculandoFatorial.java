/*Escreva um algoritmo que leia um valor inicial A e imprima a sequência de valores do cálculo de A! e o seu resultado
Exemplo: 5! = 5 X 4 X 3 X 2 X 1 = 120*/
import java.util.Scanner;
public class CalculandoFatorial{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero inteiro para saber o seu fatorial: ");
    int numero = sc.nextInt();
    int produto = 1;//Nao pode ser inicializado com 0 pq a multiplicação sempre seria 0
    if(numero<0){
      System.out.println(numero+"! = 0");
      System.out.println("Numeros negativos tem fatorial igual a 0");
    }else if(numero==0){
      System.out.println("0! = 1");
      System.out.println("O fatorial de zero sempre eh 0");
    }else{
      System.out.println(numero+"! = ");
      for(int i=1; i<=numero;i++){//Calculando o fatorial
        System.out.print(i);
        if(i!=numero){
          System.out.print(" x ");
        }
        produto *= i;
      }
      System.out.print(" = "+produto);
    }
    sc.close();
  }
}
