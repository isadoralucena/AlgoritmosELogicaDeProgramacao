package stringVetoresMatrizes;
/*Inverter uma string significa trocar a ordem dos seus caracteres
Ex.: o inverso da string "Olá!" é "!álO".
E há muitas maneiras de inverter uma string em Java. Uma delas é:

Escrevendo uma função recursiva para inverter a string
Na função recursiva, o caso/condição base é se a string for nula
ou se o comprimento dela for menor do que ou igual a zero.*/
public class InvertendoString3{
  public static void main(String[]args){
    String str1 = "Hello!";
    String str1Invertida = reverse(str1);//Chamando a função
    System.out.println("O reverso da string '"+str1+"' eh '"+str1Invertida+"'");
  }

  /*Função: Parte de um programa ou classe que retorna um valor.
  Método: Procedimento ou função pertencente a uma classe.

  public = pode ser acessada de qualquer lugar e entidade que possa visualizar a classe a que ela pertence
  private = a única classe que tem acesso a ela é a própria classe que a define*/

  private static String reverse(String str){
    if(str == null || str.length()<=1){//Se a string for null(vazia) ou só com uma letra, return ela mesma
      return str;
    }else{
      // se não, return a string, já revertida, a partir do index 1 + string específica do index 0
      return reverse(str.substring(1)) + str.charAt(0);
    }

  }
}
