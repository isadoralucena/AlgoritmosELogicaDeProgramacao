package stringVetoresMatrizes;
/*Faça um algoritmo que leia um vetor com 10 valores inteiros,
encontre o maior e o menor valor do vetor
e realize a soma de todos os valores*/
import java.util.Scanner;
public class LendoVetores{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[10];//Declarando o vetores

    //Inicializando os vetores
    for(int i=0; i<vetor.length;i++){
      System.out.print("Informe um numero inteiro para o vetor["+i+"] = ");
      vetor[i]= sc.nextInt();
    }

    //Encontrando o maior e menor valor no vetor e realizando a soma de seus valores
    int menor = vetor[0];
    int maior = vetor[0];
    int soma = 0;

    for(int i=0; i<vetor.length;i++){
      soma += vetor[i];
      if(vetor[i]<menor){
        menor = vetor[i];
      }
      if(vetor[i]>maior){
        maior = vetor[i];
      }
    }

    //Output
    for(int i=0; i< vetor.length;i++){
      if(vetor[i]==menor){
        System.out.println("vetor ["+i+"] = "+vetor[i]+" <-- menor valor");
      }else if(vetor[i]==maior){
        System.out.println("vetor ["+i+"] = "+vetor[i]+" <-- maior valor");
      }else{
        System.out.println("vetor ["+i+"] = "+vetor[i]);
      }
    }
    System.out.println("Soma = "+soma);
    sc.close();
  }
}
