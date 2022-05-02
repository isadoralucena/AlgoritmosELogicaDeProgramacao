package stringVetoresMatrizes;
/*Faça um programa que leia um vetor de 20 posições inteiras
e o coloque em ordem crescente*/
import java.util.Scanner;
import java.util.Arrays;
public class VetoresOrdemCrescente{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[20];

    for(int i=0;i<vetor.length;i++){
      System.out.print("Informe um valor inteiro pro vetor["+i+"] = ");
      vetor[i]=sc.nextInt();
    }

    //O método .sort() organiza/classifica um Array (String, int ou qualquer tipo) em ordem crescente
    Arrays.sort(vetor);
    System.out.println("Ordem crescente:");
    for(int i=0;i<vetor.length;i++){
      System.out.println("Vetor["+i+"] = "+vetor[i]);
    }
    sc.close();
  }
}
