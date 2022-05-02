package stringVetoresMatrizes;
/*O método indexOf() e o lastIndexOf() permitem achar caracteres e substrings especificados em strings

indexOf() localiza a primeira ocorrência de um caractere em uma string.
Se o método localizar o caractere, é retornado o índice do caractere na String, caso contrário retorna -1. Sendo que:
  Ele pode aceitar um inteiro que é conhecido como o número do índice na String.
  Ou aceitar dois argumentos inteiros, o caractere e o índice inicial em que a pesquisa da String deve iniciar

lastIndexOf() localiza a última ocorrência de um caractere em uma string.
O método procura do fim da string em direção ao começo,
se encontrar o caractere, é retornado o seu índice na string,
caso contrário retorna -1. Sendo que:
  Ele pode utilizar um inteiro do caractere.
  Ou aceitar 2 argumentos, um inteiro de caractere e o índice a partir do qual iniciar a pesquisa de trás para frente.*/
public class IndexOfLastIndexOf{
  public static void main(String[]args){
    String letras = "abcadefghijklmcopqrsdeftuvz";
    //indexOf localiza a primeira ocorrencia de um caractere
    System.out.println("Primeiro 'c' esta localizado no index "+letras.indexOf('c'));//index 2
    System.out.println("Primeiro 'a', a partir da posicao 1, esta localizado no index "+letras.indexOf('a', 1));//index 3

    //-1 representa que nao existe
    System.out.println("'$' esta localizado no index "+letras.indexOf('$'));//-1 (nao tem)

    //astIndexOf localiza a ultima ocorrencia de um caractere
    System.out.println("Ultimo 'c' esta localizado no index "+letras.lastIndexOf('c'));//index 14
    System.out.println("Ultimo 'a', a partir da posicao 5, está localizado no index "+letras.lastIndexOf('a', 5));//index 3
    System.out.println("Ultimo '$' esta localizado no index "+letras.lastIndexOf('$'));//-1 (nao tem)

    //indexOf localiza a primeira ocorrencia de uma substring
    System.out.println("\"def\" esta localizado no index " +letras.indexOf("def"));//index 4
    System.out.println("\"def\", a partir da posicao 7, esta localizado no index "+letras.indexOf("def", 7));//index 20
    System.out.println("\"hello\" esta localizado no index "+letras.indexOf("hello"));//-1 (nao tem)
  }
}
