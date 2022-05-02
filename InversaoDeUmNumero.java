import java.util.Scanner;
public class InversaoDeUmNumero{
  public static void main(String[]args){
    //Escreva um programa que determine o inverso de um número real
    Scanner sc = new Scanner(System.in);
    System.out.println("Quer saber a inversao de um numero ou de uma fracao?");
    System.out.println("Digite '1' sem aspas para numero e '2' para fracao");
    int opcao = sc.nextInt();

    switch(opcao){
      case 1:
        System.out.println("Digite um numero real para saber a sua inversao: ");
        int numero = sc.nextInt();

        if(numero>0){
          System.out.println("1/"+numero);
        }else if(numero == 0){
          System.out.println("Nao existe denominador igual a 0");
          while(numero==0){
              System.out.println("Digite um numero diferente de 0");
              numero = sc.nextInt();
          }
          if(numero<0){
            System.out.println("-1/"+Math.abs(numero));
          }else{
            System.out.println("1/"+numero);
          }
        }else{
            System.out.println("-1/"+Math.abs(numero));
        }
        break;

      case 2:
        System.out.println("Digite o seu numerador: ");
        int numerador = sc.nextInt();
        if(numerador==0){
          System.out.println("Na inversao de uma fracao, o numerador passa a ser denominador, e nao existe denominador igual a 0");
          while(numerador==0){
            System.out.println("Digite um numerador valido, diferente de zero");
            numerador = sc.nextInt();
          }
        }
        System.out.println("Digite o seu denominador: ");
        int denominador = sc.nextInt();
        if(numerador>0 && denominador>0 || numerador>0 && denominador<0){
          System.out.println(+denominador+"/"+numerador);
        }else if(numerador<0 && denominador<0){
          System.out.println(+Math.abs(denominador)+"/"+Math.abs(numerador));
        }else if(numerador<0){
          System.out.println("-"+denominador+"/"+Math.abs(numerador));
        }
        break;

      default:
        System.out.println("Opcao invalida");
        break;
    }
    sc.close();
  }
}
