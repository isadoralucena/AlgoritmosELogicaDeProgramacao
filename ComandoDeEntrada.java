//Em java o pacote padrão é java.lang, ele faz as necessidades básicas
//e o pacote de classes java.util disponibilza a classe scanner, que implementa operações de entrada de dados pelo teclado
import java.util.Scanner;
public class ComandoDeEntrada{
  public static void main(String[]args){
    //Instanciando e criando um objeto scanner usando o dispositivo padrão de entrada(System.in)
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um numero para a tabuada:");
    int numero = sc.nextInt();//Entrada de dados (lendo um valor inteiro)

    for(int i=0;i<=numero;i++){
      double valorTotal=i*numero;
      System.out.println(+numero+" x "+i+" = "+valorTotal);
    }
    sc.close();
  }
}
