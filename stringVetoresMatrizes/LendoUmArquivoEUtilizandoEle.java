package stringVetoresMatrizes;
/*Leia o arquivo criado no exercício anterior, calcule e escreva a média dos 10 números*/
import java.io.BufferedReader;/*Converte o txt num arquivo legivel,
é usada para ler o texto de um fluxo de entrada baseado em caracteres de forma eficiente.
E pode ser usada para ler dados linha por linha pelo método readLine ()*/

import java.io.FileReader;//Lê o arquivo txt
import java.io.IOException;//Classe que cuida dos erros ao ler ou gravar arquivos
public class LendoUmArquivoEUtilizandoEle{
  public static void main(String[]args){

    try{//começo do arquivo
      FileReader arquivo = new FileReader("Arquivo.txt");//Lendo o arquivo (pq ja existe)
      BufferedReader leArquivo = new BufferedReader(arquivo);//Convertendo o arquivo para um formato legivel

      String linha;//Auxiliar que vai imprimir os numeros guardados
      int resultado=0;//Auxiliar de resultado
      while((linha = leArquivo.readLine()) !=null){//Null(vazio) significa que chegou ao fim da linha
        System.out.println(linha);
        resultado += Integer.parseInt(linha);//Convertendo a string em int e somando-a em resultado
      }
      arquivo.close();//Indica que o arquivo n sera mais usado
      System.out.println("A soma de todos os valores eh "+resultado);
      System.out.println("A media eh "+resultado/10);
    }
  catch(IOException e){//Aviso padrao de erro(ex.: leitura de um arquivo inexistente no disco), deve-se sempre contê-lo
    System.err.printf("Erro na abertura do arquivo");
    e.getMessage();
  }
  }
}
