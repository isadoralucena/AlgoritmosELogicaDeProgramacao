//Definição da classe
//Java é case sensitive
public class HelloWord{

  //public static significam modificadores de acesso do método
  //void significa o tipo de retorno do método(no caso, vazio, nada)
  //main é o nome do método(ele sempre tem que está presente no programa)
  //string[]args é o argumento padrão do método main
  public static void main(String[]args){

    //A instrunção System.out.println() é o objeto de saída padrão(output)
    //print não considera uma nova linha
    //println considera uma nova linha
    System.out.println("Hello word");
    //O propósito de \n é pular linha
    //O de \t é gerar uma tabulação
    System.out.println("maca \nverde");
    System.out.println("uva \troxa");
  }//Fim do método main
}
/*Java é uma linguagem orientada a objetos(POO),
um modelo de programação que foi criado para aproximar o mundo real do mundo virtual,
onde diversas classes possuem características que definem um objeto na vida real

Os objetos são características definidas pelas classes, algo que pode ser manipulado.
Neles é permitido instanciar objetos da classe para inicializar os atributos e invocar os métodos.

Tudo em uma classe é tratado como objeto, mas embora você trate tudo como um objeto,
o identificador que você manipula é, na verdade, uma "referência" para um objeto

Cada classe determina o comportamento do objeto definido por métodos,
e seus estados possíveis(características) definidos por atributos/variáveis

Método é equivalente a uma funçaõ/ ação.
E não exise em Java o conceito de métodos globais, eles devem ser sempre definidos em uma classe

Função: Parte de um programa ou classe que retorna um valor.
Método: Procedimento ou função pertencente a uma classe.

  parametro- variável que irá receber um valor em uma função (ou método)
  ex.: int a;
  argumento- valor que é passado para a função (ou  método)
  ex.: a=2;

Meio que os objetos são como variáveis. São as instâncias dele que apresentam as características da classe
ex.: uma classe casa e os objetos dessa casa: casa rosa com garagem, casa grande identificador*/
