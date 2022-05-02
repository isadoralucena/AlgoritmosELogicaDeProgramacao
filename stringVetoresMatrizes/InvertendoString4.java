package stringVetoresMatrizes;
/*Inverter uma string significa trocar a ordem dos seus caracteres
Ex.: o inverso da string "Olá!" é "!álO".
E há muitas maneiras de inverter uma string em Java. Uma delas é:

Convertendo a string em um array de caracteres e
depois invertendo o primeiro e o último, o segundo e o penúltimo, etc.
Primeiro converta a string para um array de caracteres usando o método toCharArray().
Pegue o índice do último caractere no array, que é igual ao comprimento menos um.
Depois itere pelo array, trocando o caractere no índice i e
o caractere indexOfLastChar - i em cada iteração.
Depois, converta o array de caracteres novamente em uma string*/

public class InvertendoString4{
  public static void main(String[]args){
    String str1 = "Hello!";
    //O método to.toCharArray() transforma uma string em um array de char
    char [] arrayChar = str1.toCharArray();
    //A variavel indexOfLastChar representa o índice do último char da string str1
    int indexOfLastChar = arrayChar.length -1;
    //Como a inversao vai acontecer de 2 em 2, isso vai justificar arrayChar.length/2
    for(int i=0; i < arrayChar.length/2;i++){
      char temp = arrayChar[i];
      arrayChar[i] = arrayChar[indexOfLastChar - i];//A posicao i vai atribuir a ultima posicao - i
      arrayChar[indexOfLastChar - i] = temp;////A ultima posicao - i vai atribuir a primeira
    }
    String str1Invertida = new String(arrayChar);//Convertendo o array em string
    System.out.println("A inversao de '"+str1+"' eh '"+str1Invertida+"'");
  }
}
