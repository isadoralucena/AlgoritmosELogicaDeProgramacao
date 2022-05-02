package stringVetoresMatrizes;
/*Inverter uma string significa trocar a ordem dos seus caracteres
Ex.: o inverso da string "Olá!" é "!álO".
E há muitas maneiras de inverter uma string em Java. Uma delas é:

Usar o método reverse da classe StringBuffer,
criar um objeto StringBuffer que pegue como parâmetro a string a ser invertida,
usar o método reverse() da classe StringBuffer
e depois pegar a sua nova string invertida usando o método toString()*/
public class InvertendoString1{
  public static void main(String[]args){
    String str = "Hello!";
    //A classe StringBuffer é uma classe do pacote java.lang(o pacote padrão Java, que faz as necessidade básicas)
    StringBuffer buffer = new StringBuffer(str);
    String strInvertida = buffer.reverse().toString();//.toString() retorna uma String que representa o objeto que está chamando o método
    System.out.println("A reversao de '"+str+"' eh '"+strInvertida+"'");

  }
}
