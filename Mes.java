import java.util.Scanner;
public class Mes{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite algum numero inteiro para saber o seu mes correspondente: ");
    int numero = sc.nextInt();

      while(numero<1 || numero>12){
        System.out.println("Digite um numero de 1 ate 12 para que ele seja valido");
        numero = sc.nextInt();
      }

    switch(numero){
      case 1:
        System.out.println("Ele corresponde a janeiro");
        break;
      case 2:
        System.out.println("Ele corresponde a fevereiro");
        break;
      case 3:
        System.out.println("Ele corresponde a marco");
        break;
      case 4:
        System.out.println("Ele corresponde a abril");
        break;
      case 5:
        System.out.println("Ele corresponde a maio");
        break;
      case 6:
        System.out.println("Ele corresponde a junho");
        break;
      case 7:
        System.out.println("Ele corresponde a julho");
        break;
      case 8:
        System.out.println("Ele corresponde a agosto");
        break;
      case 9:
        System.out.println("Ele corresponde a setembro");
        break;
      case 10:
        System.out.println("Ele corresponde a outubro");
        break;
      case 11:
        System.out.println("Ele corresponde a novembro");
        break;
      case 12:
        System.out.println("Ele corresponde a dezembro");
        break;
    }
    sc.close();
  }
}
