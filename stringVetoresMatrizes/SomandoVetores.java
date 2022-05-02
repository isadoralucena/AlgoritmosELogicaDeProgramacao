package stringVetoresMatrizes;
/*Faça um algoritmo que construa três vetores inteiros A, B e C de dimensão 6.
O terceiro vetor deverá conter a soma dos outros dois vetores.
Em seguida mostrar todos os vetores.*/
import java.util.Scanner;
public class SomandoVetores{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n =6;
    int vetorA[] = new int[n];
    int vetorB[] = new int[n];
    int vetorC[] = new int[n];

    //Inicializando os vetores
    for(int i=0; i<vetorA.length;i++){
      System.out.print("Informe um numero inteiro para o vetorA["+i+"] = ");
      vetorA[i]= sc.nextInt();
    }

    System.out.println("---------------------------------------");

    for(int i=0; i<vetorB.length;i++){
      System.out.print("Informe um numero inteiro para o vetorB["+i+"] = ");
      vetorB[i]= sc.nextInt();
    }

    for(int i=0; i<vetorC.length;i++){
      vetorC[i]= vetorA[i] + vetorB[i];
    }

    //Output
    System.out.println("---------------------------------------");
    for(int i=0; i<vetorA.length;i++){
      System.out.println("vetorA["+i+"] = "+vetorA[i]);
    }
    System.out.println("---------------------------------------");

    for(int i=0; i<vetorB.length;i++){
      System.out.println("vetorB["+i+"] = "+vetorB[i]);
    }

    System.out.println("---------------------------------------");

    for(int i=0; i<vetorC.length;i++){
      System.out.println("vetorC["+i+"] = "+vetorC[i]);
    }
    sc.close();
  }
}
