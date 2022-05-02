public class WhileEDoWhile{
  public static void main(String[]args){
    //Os laços de repetição são for, while e do while
    //While e do while tem quase o mesma funcionalidade
    //do while vai executar os comandos antes de fazer a validação
    //e o while valida antes de executar a primeira vez

    int x=0;
    System.out.println("While");
    while(x<0){
      System.out.println("Numero "+x);
      x++;
    }

    System.out.println("Do while");
    x=0;
    do{
      System.out.println("Numero "+x);
      x++;
    }while(x<0);
  }
}
