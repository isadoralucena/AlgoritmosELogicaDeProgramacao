import java.util.Scanner;
public class ParOuImpar{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero para saber se ele eh par ou impar: ");
    int numero = sc.nextInt();
    if(numero%2 == 0){
      System.out.println(numero+" eh par");
    }else{
      System.out.println(numero+" eh impar");
    }
    sc.close();
  }
}
