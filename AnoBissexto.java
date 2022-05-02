import java.util.Scanner;
public class AnoBissexto{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite algum ano para saber se ele eh bissexto ou nao: ");
      int ano = sc.nextInt();
      if(ano%4==0 && ano%100!=0){//Um ano será bissexto quando ele for divisível por 400 e não por 100
        System.out.println("Ele eh bissexto");
      }else if(ano%400==0 && ano%100==0){//Ou se ele for divisível por 400 e 100
        System.out.println("Ele eh bissexto");
      }else{
        System.out.println("Ele nao eh bissexto");
      }
      sc.close();
  }
}
