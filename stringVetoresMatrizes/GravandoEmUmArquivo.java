package stringVetoresMatrizes;
/*Faça um algoritmo que escreva 10 números aleatórios
e grave em um arquivo de texto.*/
import java.io.FileWriter;//Serve para escrever diretamente num arquivo
import java.io.IOException;//Classe que cuida dos erros ao ler ou gravar arquivos
import java.io.PrintWriter;//Classe que permite gravar arquivos
import java.util.Random;//Classe que gera um numero aleatorio
public class GravandoEmUmArquivo{
  public static void main(String[]args) throws IOException{
    //Instanciando random
    Random rand = new Random();

    //Construtor que recebe o objeto do tipo arquivo
    FileWriter arquivo = new FileWriter("arquivo.txt");//Se arquivo ja existir, ele vai utilizar ele, se não, é criado um

    /*Construtor que recebe também como argumento se o conteúdo será acrescentado
    ao invés de ser substituído (append)*/
    //FileWriter fw = new FileWriter(arquivo, true );

    PrintWriter gravaArquivo = new PrintWriter(arquivo);//PrintWriter permite gravar num arquivo

    for (int i = 0;i<=10 ;i++ ) {
      gravaArquivo.println(rand.nextInt(10));//Random vai gerar 10 numeros aleatorios entre 0 e 10
    }
    arquivo.close();//Sempre é necessario fechar um arquivo
  }
}
