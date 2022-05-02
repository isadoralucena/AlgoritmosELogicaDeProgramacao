import java.util.Scanner;
public class ValorMaiorOuMenor{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite algum valor inteiro: ");
    int n1 = sc.nextInt();

    System.out.println("Digite outro valor inteiro: ");
    int n2 = sc.nextInt();

    int numeroMaior=n1;

    if(n1>n2){
      System.out.println("O primeiro valor que vc digitou ("+numeroMaior+ ") eh maior que o segundo ("+n2+")");
    }else if(n2>n1){
      numeroMaior=n2;
      System.out.println("O segundo valor que vc digitou ("+numeroMaior+") eh maior que o primeiro ("+n1+")");
    }else{
      System.out.println("O primeiro valor que vc digitou ("+n1+ ") eh igual o segundo ("+n2+"), nao ha nenhum valor maior do que o outro");
    }
    sc.close();
  }
}
