package stringVetoresMatrizes;
/*Desenvolva um programa que permita a leitura de um vetor de 30 números inteiros,
e gere um segundo vetor com os mesmos dados,
só que de maneira invertida, ou seja,
o primeiro elemento ficará na última posição,
o segundo na penúltima posição, e assim por diante.*/
import java.util.Scanner;
public class VetoresInvertidos{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = 30;
    int vetorNumeros[] = new int[n];

    for(int i=0;i<n;i++){
      System.out.print("Informe um valor inteiro para o vetorNumeros["+i+"] = ");
      vetorNumeros[i] = sc.nextInt();
    }

    //int numerosInvertidos[] = vetorNumeros;//Igualar arrays assim faz com que o que aconteca com um aconteca com o outro
    int numerosInvertidos[] = new int[n];
    for(int i=0;i<n;i++){
      numerosInvertidos[i]=vetorNumeros[i];
    }

    int ultimaPosicaoVetorNumeros = numerosInvertidos.length -1;
    System.out.println("-------------------------------------------------");

    //i<n/2 pq a inversao vai acontecer de 2 em 2(primeiro com ultimo, segundo com penultimo...)
    for(int i=0;i<n/2;i++){
      int temporaria = numerosInvertidos[i];

      //A posicao i vai atribuir a ultima posicao - i (inversao)
      numerosInvertidos[i] = numerosInvertidos[ultimaPosicaoVetorNumeros - i];

      //A ultima posicao - i vai atribuir a primeira (inversao)
      numerosInvertidos[ultimaPosicaoVetorNumeros - i] = temporaria;
    }

    //Exibicao
    for(int i=0;i<n;i++){
      System.out.println("vetorNumeros["+i+"] = "+vetorNumeros[i]);
      System.out.println("numerosInvertidos["+i+"] = "+numerosInvertidos[i]);
      System.out.println("-------------------------------------------------");
    }
    sc.close();
  }
}
