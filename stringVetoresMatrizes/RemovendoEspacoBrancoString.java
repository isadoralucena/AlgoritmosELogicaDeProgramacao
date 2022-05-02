package stringVetoresMatrizes;
/*Remover o espaço em branco em uma string
significa remover os espaços em branco no início e no fim de uma string.
Ex.: se você tiver a string "    Olá, mundo!    "
e quiser que seja exibido "Olá, mundo!" sem os espaços em branco no início e no fim,
você pode removê-los

Usa-se o método trim() da classe String em um objeto String
para remover os espaços em branco.
O método trim() não mudará os conteúdos da string original
porque as strings em Java são imutáveis,
o que significa que o estado de uma string não pode ser modificado depois dela ser criada.
Em vez disso, o método trim() retornará uma nova string com os espaços em branco removidos.
Note que o método trim() lançará uma exceção se a string for nula.*/
public class RemovendoEspacoBrancoString{
  public static void main(String[]args){
    String str1 = "        Hello, word! ! !    ";
    String str1Trim = str1.trim();
    System.out.println("A string '"+str1+"' com o metodo trim fica: '"+str1Trim+"'");
  }
}
