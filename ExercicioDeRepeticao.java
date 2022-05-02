/*Faça um algoritmo que leia um número inteiro n
Escrever a soma e o produto de todos os números de 1 até n*/
import java.util.Scanner;
public class ExercicioDeRepeticao{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe um numero inteiro qualquer: ");
    int numero = sc.nextInt();
    int soma = 0;
    int produto = 1;//Nao pode ser inicializado com 0 pq a multiplicação sempre seria 0
    if(numero>=1){
      for(int i=1; i<=numero; i++){//soma
        System.out.print(i);
        if(i!=numero){
          System.out.print(" + ");
        }
        soma += i;
      }
      System.out.println(" = "+soma);

      for(int i=1; i<=numero; i++){//multiplicação
        System.out.print(i);
          if(i!=numero){
            System.out.print(" x ");
          }
          produto *=i;
      }
      System.out.println(" = "+produto);

    }else{
      for(int i=1; i>=numero; i--){//soma
        if(i>0){
          System.out.print(i);
        }else if(i<0){
          System.out.print("("+i+")");
        }else{
          System.out.print(i);
        }
        if(i!=numero){
          System.out.print(" + ");
        }
        soma += i;
      }
      System.out.println(" = "+soma);

      for(int i=1; i>=numero; i--){//multiplicação
        if(i>0){
          System.out.print(i);
        }else if(i<0){
          System.out.print("("+i+")");
        }else{
          System.out.print(i);
        }
        if(i!=numero){
          System.out.print(" x ");
        }
        produto *= i;
      }
      System.out.println(" = "+produto);
    }
    sc.close();
  }
}
