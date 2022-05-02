public class ExerciciosComDoWhile{
  public static void main(String[]args){

    //While e do while tem quase o mesma funcionalidade
    //do while vai executar os comandos antes de fazer a validação
    //e o while valida antes de executar a primeira vez

    //Escreva um programa em Java que imprima na tela 5 vezes a mensagem "Eu sou programador java"
    int i=1;
    do{
      System.out.println("Eu sou programador java "+i);
      i++;
    }while(i<5);
    System.out.println("--------------------------------------------");

    //Escreva um programa em Java que imprima na tela os números de 1 a 100
    i=1;
    do{
      System.out.println(i);
      i++;
    }while(i<=10);

    System.out.println("--------------------------------------------");

    //Escreva um programa em Java que imprima na tela os números de 1 a 100 exceto os múltiplos de 3
    i=1;
    do{
      if(i%3 != 0){
        System.out.println(i);
      }
      i++;
    }while(i<=10);
  }
}
