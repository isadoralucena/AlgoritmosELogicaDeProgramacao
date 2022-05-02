package stringVetoresMatrizes;
/*Para repartir uma string por um certo delimitador usa-se um array de substrings.
Ex.: se eu repartir a string "vermelho,azul,verde,amarelo,rosa"
usando a vírgula como delimitador,
eu teria o array ["vermelho", "azul", "verde", "amarelo", "rosa"].

Antes do Java 1.4, a classe StringTokenizer era usada para repartir strings em Java.
Mas agora, o uso dela é desencorajado e o uso do método split() na classe String
ou o uso do pacote java.util.regex é recomendado. Então, assim sendo:*/
import java.util.Arrays;
import java.util.regex.Pattern;
public class SplitParaSepararString{
  public static void main(String[]args){
    String nomes = "Joaquim,Pereira,Silva,Adriano,Ricardo,Rocha";
    /*O método compile da classe Pattern em Java aceita
    um valor de string que representa uma expressão regular
    e retorna um objeto Pattern

    O método split() quebra uma determinada string
    em torno das correspondências da expressão regular fornecida*/
    String [] resultadoNomes = Pattern.compile(",").split(nomes);
    System.out.println("String: "+nomes);
    //O método Array.toString() retorna uma representação de string do conteúdo do array especificado
    System.out.println("Array: "+Arrays.toString(resultadoNomes));

    // Array retornado: ["João", "da", "Silva", "Oliveira"]
    String nome = "Joao da Silva Oliveira";
    String [] resultadoNome = nome.split(" ");
    System.out.println(Arrays.toString(resultadoNome));

    /*Array retornado: ["J", "o", "ã", "o", " ", "d", "a", " ", "S", "i",
    "l", "v", "a", " ", "O", "l" , "i", "v", "e", "i", "r", "a"]*/
    nome = "Joao da Silva Oliveira";
    resultadoNome = nome.split("");
    System.out.println(Arrays.toString(resultadoNome));

    // Array retornado: ["João", "da", "Silva Oliveira"]
    nome = "Joao da Silva Oliveira";
    /*3 representa o segundo parâmetro(inteiro, não negativo e opcional),
    especificando um limite no número de divisões a serem encontradas*/
    resultadoNome = nome.split(" ", 3);
    System.out.println(Arrays.toString(resultadoNome));

    // Array retornado: ["usuario", "gmail.com"]
    nome = "usuario@gmail.com";
    resultadoNome = nome.split("@");
    System.out.println(Arrays.toString(resultadoNome));
  }
}
