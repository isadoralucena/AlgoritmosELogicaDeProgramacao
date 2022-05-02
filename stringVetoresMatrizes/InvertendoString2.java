package stringVetoresMatrizes;
/*Inverter uma string significa trocar a ordem dos seus caracteres
Ex.: o inverso da string "Olá!" é "!álO".
E há muitas maneiras de inverter uma string em Java. Uma delas é:

Iterando pelos caracteres de uma string invertida,
adicionando os caracteres a um StringBuffer em cada iteração.
Crie um novo objeto StringBuffer inicializado com o comprimento da string que você quer inverter.
Depois use um for para iterar pela string,
começando do último caractere e terminando no primeiro.
Em cada iteração, adicione o caractere do índice atual no StringBuffer.
Pegue a sua string invertida usando o método toString().

*/
public class InvertendoString2{
  public static void main(String[]args){
    String str = "Hello!";
    //A classe StringBuffer é uma classe do pacote java.lang(o pacote padrão Java, que faz as necessidade básicas)
    StringBuffer buffer = new StringBuffer(str.length());
    for(int i = str.length() - 1; i>=0;i--){//O index de uma string comeca de 0, entao o for vai da ultima letra ate a primeira
      /*O método .append() aloca novas strings concatenadas para o mesmo objeto, ou seja,
      cada vez que concatena strings não são criadas cópias dos objetos
      como é realizado pelo método .concat(),
      contribuindo para um melhor desempenho do sistema*/
      buffer.append(str.charAt(i));
    }
    String strInvertida = buffer.toString();//.toString() retorna uma String que representa o objeto que está chamando o método
    System.out.println("A reversao de '"+str+"' eh '"+strInvertida+"'");
  }
}
