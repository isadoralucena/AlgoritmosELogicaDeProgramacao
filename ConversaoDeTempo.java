import java.util.Scanner;
public class ConversaoDeTempo{
  public static void main(String[]args){
    /*Escreva um programa que permita converter um determinado número de segundos,
    fornecidos pelo usuário, em um número equivalente de horas, minutos e segundos*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Para converter segundo em minutos ou horas, digite quanto voce quer converter:");
    int segundo = sc.nextInt();
    if(segundo<0){
      while(segundo<0){
        System.out.println("Nao existe tempo negativo, digite um numero positivo: ");
        segundo = sc.nextInt();
      }
    }
    System.out.println("O que voce quer fazer?");
    System.out.println("Digite '1' sem aspas para converter segundos em minutos");
    System.out.println("Ou digite '2' para converter segundos em horas");
    int opcao = sc.nextInt();

    switch(opcao){
      case 1:
        float minuto = (float)segundo/60;
        System.out.println(+segundo+" em minutos eh: "+minuto);
        break;
      case 2:
        float hora = (float)segundo/3600;
        System.out.println(+segundo+" em horas eh: "+hora);
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
    sc.close();
  }
}
