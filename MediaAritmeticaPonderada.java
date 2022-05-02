/*Escreva um algoritmo que solicita ao usuário as 3 notas de um aluno e uma letra
Se a letra for A a função calcula a média aritmética das notas do aluno
e se for P, a sua média ponderada (pesos: 5, 3 e 2). A média calculada também deve ser exibida em uma mensagem*/
import java.util.Scanner;
public class MediaAritmeticaPonderada{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as 3 notas de um aluno: ");
    int nota1 = sc.nextInt();
    int nota2 = sc.nextInt();
    int nota3 = sc.nextInt();

    if(nota1<0 || nota2<0 || nota3<0){
      System.out.println("Ops, parece que vc digitou alguma nota negativa");
      System.out.println("Digite as 3 notas do aluno novamente: ");
      nota1 = sc.nextInt();
      nota2 = sc.nextInt();
      nota3 = sc.nextInt();
    }
    System.out.println("O que deseja fazer com as 3 notas?");
    System.out.println("Digite 'A' sem aspas para media aritmetica");
    System.out.println("Ou digite 'P' sem aspas para media aritmetica");
    char opcao = sc.next().charAt(0);//charAt() é um metodo que retorna o caractere de acordo com seu index

    switch(opcao){
      case 'A':
      case 'a':
        int mediaA= (nota1 + nota2 + nota3)/3;
        System.out.println("Notas:\tMedia aritmetica:");
        System.out.println(+nota1+"\t"+mediaA);
        System.out.println(nota2);
        System.out.println(nota3);
        break;
      case 'P':
      case 'p':
        int mediaP = (nota1 *5+ nota2*3 + nota3*2)/3;
        System.out.println("Notas:\tMedia aritmetica:");
        System.out.println(+nota1+"\t"+mediaP);
        System.out.println(nota2);
        System.out.println(nota3);
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
    sc.close();
  }

}
