public class ExerciciosComFor{
  public static void main(String[]args){

    /*While e for conseguem fazer as mesmas coisas tecnicamente.
    Mas por uma questão de semântica normalmente se considera:

    While - quando a repetição acontece até uma condição
    For- quando se conhece o número de repetições*/

    //Escreva um programa em Java que imprima na tela 5 vezes a mensagem "Eu sou programador java"
    for(int i=0; i<5; i++){
      System.out.println("Eu sou programador Java");
    }

    System.out.println("--------------------------------------------");

    //Escreva um programa em Java que imprima na tela os números de 1 a 100
    for(int j=1; j<=10; j++){
      System.out.println(j);
    }

    System.out.println("--------------------------------------------");

    //Escreva um programa em Java que imprima na tela os números de 1 a 100 exceto os múltiplos de 3
    for(int k=1; k<=100; k++){
      if(k%3 != 0){
        System.out.println(k);
      }
    }
  }
}
