/*Faça um algoritmo que leia dois números inteiros,
calcular e mostrar um elevado ao outro, se o primeiro for maior ou igual ao segundo
Caso contrário (segundo número maior do que o primeiro), calcular e mostrar o produto dos números*/
import java.util.Scanner;
public class ExercicioMatematico{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois numeros inteiros: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    if(num1>=num2){
      System.out.println(num1+" elevado a "+num2+" eh "+Math.pow(num1,num2));
    }else{
      System.out.println("O produto de "+num1+" x "+num2+" = "+(num1*num2));
    }
    sc.close();
  }
}
