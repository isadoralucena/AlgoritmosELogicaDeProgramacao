package stringVetoresMatrizes;
/*Strings são sequências de caracteres

Ex.: "Olá!" é uma string
porque é composta pelos caracteres 'O','l','á' e '!'.
Em Java, as strings são objetos (caracteristicas das classes),
o que significa que há uma classe String com atributos(suas caracteristicas) e métodos(comportamento).
Podemos usar os métodos da classe String para manipulá-las*/
public class CriandoString{
  public static void main(String[]args){

    String str1 = new String("String criada com um construtor");//Não há a necessidade de declarar uma string com new
    String str2 = " String criada sem um construtor";//Para o compilador, qualquer texto entre aspas duplas é uma String

    /*Ao usar o operador new é forçado a criação de uma nova String,
    anulando o recurso de otimização da linguagem que evita que o mesmo texto exista mais de uma vez na memória.

    Caso a str1 esteja dentro de um loop for repetido por mil vezes, mil objetos serão criados,
    mas se a str2 estiver dentro de um loop for repetido por mil vezes,
    apenas um objeto será criado na primeira repetição e reutilizado em todas as demais*/

    System.out.println(str1);
    System.out.println(str2);

    str1 += str2;
    System.out.println("A soma das duas strings eh: "+str1);

    String str3 = "bola";
    char str3LetraInicial = str3.charAt(0);//charAt() é um metodo que retorna o caractere de acordo com seu index
    System.out.println("A letra inicial de '"+str3+"' eh "+str3LetraInicial);

  }
}
