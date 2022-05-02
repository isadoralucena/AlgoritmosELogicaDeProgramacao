import java.util.Scanner;
public class IfElse{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual a sua media? Digite ela para saber se foi aprovado ou nao");
    int media = sc.nextInt();

    System.out.println("\nIf else");

    if (media >= 6){
      System.out.print("O aluno esta ");
      System.out.println("aprovado");
    }else{
      System.out.print("O aluno esta ");
      System.out.println("reprovado");
    }

    System.out.println("\nIf else com ? e :");

    //Outro modo
    System.out.println(media >= 6 ? "Aprovado" : "Reprovado");
    sc.close();
  }
}
