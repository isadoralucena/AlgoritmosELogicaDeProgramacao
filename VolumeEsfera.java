/*Faça um algoritmo que solicita ao usuário o raio de uma esfera e calcula o seu volume v = (4 · π · r³)/3*/
import java.util.Scanner;
public class VolumeEsfera{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Para calcular o raio de uma esfera informe o seu raio: ");
    float raio = sc.nextFloat();
    if(raio==0){
      System.out.println("Nao existe comprimento com valor 0, entao o seu volume consequentemente eh 0");
      System.exit(0);
    }else if(raio<0){
      System.out.println("Nao existe comprimento negativo, entao o seu volume consequentemente eh 0");
      System.exit(0);
    }
    float pi = 3.14f;
    float volume = (float)(4 * pi * Math.pow(raio,3))/3;
    System.out.println("O volume da esfera de raio "+raio+" eh "+volume);
    sc.close();
  }
}
