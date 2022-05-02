/*Escrever um algoritmo que leia o nome de um aluno e
as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua media aritmetica*/
import java.util.Scanner;
public class IsadoraQuestaoDois{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome de um aluno: ");
    String nome = sc.nextLine();

    System.out.println("Digite as notas de "+nome+", que ele obteve nas tres provas do semestre: ");
    float notaUm= sc.nextFloat();
    float notaDois= sc.nextFloat();
    float notaTres= sc.nextFloat();

    float media = (notaUm+notaDois+notaTres)/3;
    System.out.println("A media de "+nome+" eh: "+media);
    sc.close();
  }
}
