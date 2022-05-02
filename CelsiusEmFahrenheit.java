import java.util.Scanner;
public class CelsiusEmFahrenheit{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    //Escreva um programa que leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit
    System.out.println("Para converter celsius em fahrenheit digite uma temperatura: ");
    int celsius = sc.nextInt();
    float fahrenheit = (float)(9*celsius+160)/5;
    System.out.println(+celsius+" em fahrenheit eh "+fahrenheit);
    sc.close();
  }
}
