/*Faça um algoritmo que solicita ao usuário a idade de um nadador
e exibe uma mensagem com a idade e a categoria desse nadador*/
import java.util.Scanner;
public class IsadoraQuestaoDez{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a idade de um nadador: ");
    int idade = sc.nextInt();

    if(idade>=0 && idade<5){
      System.out.println("Categorias so a partir dos 5 anos");
      System.out.println("Categoria: nenhuma");
    }else if(idade>=5 && idade<=7){
      System.out.println("Categoria: Infantil A");
    }else if(idade>=8 && idade<=10){
      System.out.println("Categoria: Infantil B");
    }else if(idade>=11 && idade<=13){
      System.out.println("Categoria: Juvenil A");
    }else if(idade>=14 && idade<=17){
      System.out.println("Categoria: Juvenil B");
    }else if(idade>=18){
      System.out.println("Categoria: Adulto");
    }else{
      System.out.println("Nao existe idade negativa");
      System.out.println("Categoria: nenhuma");
    }

    System.out.println("===================================");
    System.out.println("| Idade            | Categoria    |");
    System.out.println("| 5 a 7            | Infantil A   |");
    System.out.println("| 8 a 10           | Infantil B   |");
    System.out.println("| 11 a 13          | Juvenil A    |");
    System.out.println("| 14 a 17          | Juvenil B    |");
    System.out.println("| a partir dos 18  | Adulto       |");
    System.out.println("===================================");
    sc.close();
  }
}
