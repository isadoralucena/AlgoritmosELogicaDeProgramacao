package stringVetoresMatrizes;
/*Faça um programa que decida se duas strings lidas do teclado são palíndromas mútuas,
ou seja, se uma é igual à outra quando lida de traz para frente.
Exemplo: amor e roma*/
import java.util.Scanner;
public class PalindromoString{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite duas strings para saber se elas sao palindromos: ");
    String palavra1 = sc.nextLine();
    String palavra2 = sc.nextLine();

    while(palavra1.length() <1 || palavra2.length()<1){
      System.out.print("Digite duas strings para saber se elas sao palindromos: ");
      palavra1 = sc.nextLine();
      palavra2 = sc.nextLine();
    }

    String palavra1SemEspaco = palavra1.replace(" ","");
    String palavra2SemEspaco = palavra2.replace(" ","");

    StringBuffer buffer = new StringBuffer(palavra1SemEspaco);
    String palavra1SemEspacoInvertida = buffer.reverse().toString();

    if(palavra1SemEspacoInvertida.equalsIgnoreCase(palavra2SemEspaco)){
      System.out.println("'"+palavra1SemEspacoInvertida+"' eh palindromo de '"+palavra2SemEspaco+"'");
    }else{
      System.out.println("'"+palavra1SemEspacoInvertida+"' nao eh palindromo de '"+palavra2SemEspaco+"'");
    }
    sc.close();
  }
}
