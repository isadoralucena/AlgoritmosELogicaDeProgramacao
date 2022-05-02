package stringVetoresMatrizes;
/*Faça um programa que preencha uma matriz 5 x 5 de inteiros e escreva:
  a) A soma de cada uma das 5 colunas
  b) A soma de cada uma das 5 linhas*/
import java.util.Scanner;
public class SomandoColunasSomandoLinhasMatriz{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = 2;
    int matriz[][] = new int[n][n];

    int somaColunas=0;
    int somaLinhas=0;

    //Inicializando a matriz
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
        System.out.print("Informe um valor inteiro para a matriz["+i+"]["+j+"] = ");
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("----------------------------------------------------");

    //Somando
    for(int i=0;i<matriz.length;i++){//laço das colunas
      somaColunas = 0;
      somaLinhas=0;
      for(int j=0;j<matriz[i].length;j++){//laço das linhas
        System.out.println("Coluna["+i+"]["+j+"] = "+matriz[i][j]);
        somaColunas += matriz[i][j];
        System.out.println("Linha["+j+"]["+i+"] = "+matriz[j][i]);//Isso so da certo pq j e i  sao iguais
        somaLinhas += matriz[j][i];
      }
      System.out.println("Soma das colunas = "+somaColunas);
      System.out.println("Soma das linhas = "+somaLinhas);
      System.out.println();
    }
    sc.close();
  }
}
