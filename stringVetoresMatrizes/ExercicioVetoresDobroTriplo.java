package stringVetoresMatrizes;
/*Crie um programa que leia um vetor de 30 números inteiros
e gere um segundo vetor cujas posições pares são o dobro do vetor original e as ímpares o triplo.*/
import java.util.Scanner;
public class ExercicioVetoresDobroTriplo{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //Declarando o vetor
    int vetor[] = new int[30];
    int vetorResultado[] = new int[30];

    //Inicializando o vetor
    for(int i=0;i<vetor.length;i++){
      System.out.print("Informe um valor para o vetor["+i+"] = ");
      vetor[i]= sc.nextInt();
    }
    sc.close();
    for(int i=0;i<vetor.length;i++){
      if(vetor[i] % 2 == 0){
        vetorResultado[i] = vetor[i] * 2;
        System.out.println("vetorResultado["+i+"] = "+vetor[i]+" * 2 = "+vetorResultado[i]);
      }else{
        vetorResultado[i] = vetor[i] * 3;
        System.out.println("vetorResultado["+i+"] = "+vetor[i]+" * 3 = "+vetorResultado[i]);
      }
    }
  }
}
