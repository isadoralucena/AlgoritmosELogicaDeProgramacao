package stringVetoresMatrizes;
/*O método .compareTo() compara se duas strings são lexicograficamente iguais.
A comparação é baseada no valor Unicode de cada caractere nas strings.
No caso, é retornado um valor int:
0 se a string for igual à outra string.
<0 se a string for lexicograficamente menor que a outra string
> 0 se a string for lexicograficamente maior que a outra string (mais caracteres)

Importante:
Use compareToIgnoreCase() para comparar duas strings lexicograficamente,
ignorando as diferenças entre maiúsculas e minúsculas.
E use o método equals() para comparar duas strings sem considerar os valores Unicode*/
public class CompareTo{
  public static void main(String[]args){
    String str1 = "ola";
    String str2 = "ola";
    String str3 = "ola ";
    String str4 = "ola1234";
    String str5 = "ol ";

    int result = str1.compareTo(str2);
    System.out.println(result);//0

    result = str1.compareTo(str3);
    System.out.println(result);//-1

    result = str3.compareTo(str2);
    System.out.println(result);//+1

    result = str4.compareTo(str2);
    System.out.println(result);//+4

    result = str2.compareTo(str5);
    System.out.println(result);//return 65(unicode de a)
  }
}
