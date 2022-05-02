public class ExerciciosComWhile{
  public static void main(String[]args){

    /*While e for conseguem fazer as mesmas coisas tecnicamente.
    Mas por uma questão de semântica normalmente se considera:

    While - quando a repetição acontece até uma condição
    For- quando se conhece o número de repetições*/

    //While e do while tem quase o mesma funcionalidade
    //do while vai executar os comandos antes de fazer a validação
    //e o while valida antes de executar a primeira vez

    //Escreva um programa em Java que imprima na tela 5 vezes a mensagem "Eu sou programador java"
    int i = 1;
    while(i<=5){
      System.out.println("Eu sou programador Java");
      i++;
    }

    System.out.println("--------------------------------------------");

    //Escreva um programa em Java que imprima na tela os números de 1 a 100
    i = 1;
    while(i<=100){
      System.out.println(i);
      i++;
    }

    System.out.println("--------------------------------------------");

    //Escreva um programa em Java que imprima na tela os números de 1 a 100 exceto os múltiplos de 3
    i = 1;
    while(i<=100){
      if(i%3 != 0){
        System.out.println(i);
      }
      i++;
    }

  }
}
