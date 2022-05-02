package stringVetoresMatrizes;
public class Substring{
  public static void main(String[]args){
    //Um pedaço de uma string é chamado de substring
    String nome = "Isadora";
    System.out.println("Nome: "+nome);
    //Vai retornar os caracteres da posicao 2 até 5-1
    System.out.println("Substring(2,5): "+nome.substring(2,5));
    //Vai retornar os caracteres da posicao 0 até 7-1
    System.out.println("Substring(0,7): "+nome.substring(0,7));
    //Vai retornar os caracteres da posicao 0 até o final da string
    System.out.println("Substring(0): "+nome.substring(0));
    //Vai retornar o caracter da posicao 6
    System.out.println("Substring(6): "+nome.substring(6));
    //Vai retornar os caracteres da posicao 7, no caso, null
    System.out.println("Substring(nome.length()): "+nome.substring(nome.length()));
    //Vai retornar os caracteres da posicao 0 até nome.length - 1
    System.out.println("Substring(0,nome.length()): "+nome.substring(0,nome.length()));
  }
}
