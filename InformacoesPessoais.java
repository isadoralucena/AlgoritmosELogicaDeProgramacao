import java.util.Scanner;
public class InformacoesPessoais{
  public static void main(String[]args){
    //Crie um programa para mostrar uma mensagem de boas vindas personalizada, pedindo o nome completo do usuário
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual seu nome? (Digite-o completo) ");
    String nome = sc.nextLine();

    /*next() ler a entrada apenas até o espaço. Ele não ler duas palavras separadas por um espaço.
    Além disso, next() coloca o cursor na mesma linha após ler a entrada.

    nextLine() lê a entrada incluindo o espaço entre as palavras
    (ou seja, lê até o final da linha \n).
    Assim que a entrada for lida, nextLine()posiciona o cursor na próxima linha.*/

    System.out.println("Digite sua idade, por favor: ");
    int idade = sc.nextInt();

    System.out.println("E por ultimo, digite sua matricula do IFRN: ");
    long matricula = sc.nextLong();

    System.out.print("Bem vinda(o) "+nome+", agora que ja tem sua matricula "+matricula+", se cadastre no SUAP. ");
    System.out.print("Nao se esqueca de colocar todos os seus dados corretamente, como a sua idade. ");
    System.out.print("Nos da administracao ja sabemos que ela eh "+idade+". E todos nos do Campus estamos ansiosos para conhece-lo(la) melhor");
    sc.close();
  }
}
