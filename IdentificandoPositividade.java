/*Faça um algoritmo que recebe um valor inteiro e verifica se o valor é positivo ou negativo
Seu algoritmo deve mostrar uma mensagem informando o número e se ele é positivo ou negativo.*/
import java.util.Scanner;
public class IdentificandoPositividade{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Para verificar a positividade de um numero, digite um valor qualquer que seja inteiro: ");
    int numero = sc.nextInt();
    if(numero<0){
      System.out.println(+numero+" eh negativo");
    }else if(numero==0){
      System.out.println(+numero+" nao eh nem negativo nem positivo");
    }else{
      System.out.println(+numero+" eh positivo");
    }
    sc.close();
  }
}
