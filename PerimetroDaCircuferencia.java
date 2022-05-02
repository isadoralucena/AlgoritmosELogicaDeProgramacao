import java.util.Scanner;
public class PerimetroDaCircuferencia{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    /*Escreva um programa que calcule o perímetro de uma circunferência,
    sendo pedido ao usuário o tamanho do raio. Perímetro = 2 * pi * raio*/
    System.out.println("Para calcular o perimetro de uma circuferencia digite o tamanho do seu raio: ");
    float raio = sc.nextFloat();
    float pi = 3.14f;
    float perimetro;
    while(raio==0){
        System.out.println("Digite um raio diferente de 0 para que o seu perimetro seja valido");
        raio = sc.nextFloat();
    }
    if(raio<0){
      System.out.println("Como digitou um tamanho negativo e nao existe tamanho negativo, sera considerado seu valor absoluto");
      perimetro = pi * 2 * Math.abs(raio);
      System.out.println("O perimetro da circuferencia do seu raio eh "+perimetro);
      System.exit(0);
    }
    perimetro = pi * 2 * raio;
    System.out.println("O perimetro da circuferencia do seu raio eh "+perimetro);
    sc.close();
    }
}
