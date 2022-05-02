package stringVetoresMatrizes;
/*Elabore um programa que leia duas matrizes inteira, A e B, 3x3, de reais.
Calcule a multiplicação (armazene em uma matriz C) e a soma (armazene em uma matriz D) entre elas,
em seguida, efetue a impressão de todas as matrizes.*/
import java.util.Scanner;
public class SomaMultiplicacaoEntreMatrizes{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=3;
    int matrizA[][] = new int[n][n];
    int matrizB[][] = new int[n][n];
    int soma[][] = new int[n][n];
    int multiplicacao[][] = new int[n][n];

    //Inicializando as matrizes
    for(int i=0;i<matrizA.length;i++){
      for(int j=0;j<matrizB[i].length;j++){
        System.out.print("Informe um valor inteiro para a matrizA["+i+"]["+j+"] = ");
        matrizA[i][j] = sc.nextInt();
        System.out.print("Agora informe um valor inteiro para a matrizB["+i+"]["+j+"] = ");
        matrizB[i][j] = sc.nextInt();
      }
      System.out.println("--------------------------------------------------------------");
    }

    //Somando e multiplicando
    for(int i=0;i<matrizA.length;i++){
      for(int j=0;j<matrizB[i].length;j++){
        soma[i][j] = matrizA[i][j] + matrizB[i][j];
        System.out.println("A soma da matrizA["+i+"]["+j+"] + matrizB["+i+"]["+j+"] = "+soma[i][j]);
        multiplicacao[i][j] = matrizA[i][j] * matrizB[i][j];
        System.out.println("A multiplicacao da matrizA["+i+"]["+j+"] * matrizB["+i+"]["+j+"] = "+multiplicacao[i][j]);
      }
      System.out.println("***********************************************************************");
    }
    sc.close();
  }
}
