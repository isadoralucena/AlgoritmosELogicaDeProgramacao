package stringVetoresMatrizes;
/*Um anagrama é uma palavra que é feita a partir da transposição das letras de outra palavra/ frase.
Por exemplo, 'Iracema' é um anagrama para 'America'.
Escreva um programa que decida se uma string é um anagrama de outra string,
ignorando os espaços em branco.
O programa deve considerar maiúsculas e minúsculas como sendo caracteres iguais, ou seja, 'a' = 'A'.*/
import java.util.Scanner;
import java.util.Arrays;
public class IdentificandoAnagramaString{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite duas palavras/frases para saber se elas sao anagramas: ");
    String palavra1 = sc.nextLine();
    String palavra2 = sc.nextLine();

    while(palavra1.length() <1 || palavra2.length()<1){
      System.out.print("Digite duas palavras/frases para saber se elas sao anagramas: ");
      palavra1 = sc.nextLine();
      palavra2 = sc.nextLine();
    }
    sc.close();
    
    String palavra1SemEspaco = palavra1.toLowerCase().replace(" ","");
    String palavra2SemEspaco = palavra2.toLowerCase().replace(" ","");

    //O método .toCharArray() transforma uma string em um array de char
    char [] palavra1Array = palavra1SemEspaco.toCharArray();
    char [] palavra2Array = palavra2SemEspaco.toCharArray();

    //O método .sort() organiza/classifica um Array (String, int ou qualquer tipo) em ordem crescente
    Arrays.sort(palavra1Array);
    Arrays.sort(palavra2Array);

    if(Arrays.equals(palavra1Array, palavra2Array)){
      System.out.println("'"+palavra1SemEspaco+"' eh anagrama de '"+palavra2SemEspaco+"'");
    }else{
      System.out.println("'"+palavra1SemEspaco+"' nao eh anagrama de '"+palavra2SemEspaco+"'");
    }
  }
}
