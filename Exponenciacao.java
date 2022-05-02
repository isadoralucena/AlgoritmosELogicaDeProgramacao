/*Faça um algoritmo que solicita ao usuário um valor para base e um para o expoente e retorne o resultado (base elevada ao expoente)
Escreva uma mensagem para mostrar o resultado na tela*/
import java.util.Scanner;
public class Exponenciacao{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Para calcular uma potenciacao, digite uma base inteira: ");
    int base = sc.nextInt();

    System.out.print("E digite um expoente inteiro: ");
    int expoente = sc.nextInt();

    int resultado = (int)Math.pow(base,expoente);
    System.out.println("O resultado de "+base+" elevado a "+expoente+" eh " +resultado);
    sc.close();
  }
}
