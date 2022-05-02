package stringVetoresMatrizes;
/*Faça um algoritmo que dado dois vetores de 4 posições,
efetue as respectivas operações ('+','–','*', e '/'),
indicadas por outro vetor de 4 posições fornecido pelo usuário,
armazenando o resultado em um terceiro vetor.
Mostre o resultado das operações*/
import java.util.Scanner;
public class OperacoesMatematicasVetores{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=4;
    int vetor1[] = new int[n];
    int vetor2[] = new int[n];
    int vetorResultado[] = new int[n];
    char vetorOperacoes[] = {'+','-','*','/'};

    //Inicializando os vetores
    for(int i=0;i<vetor1.length;i++){
      System.out.print("Informe um numero inteiro para o vetor1["+i+"] = ");
      vetor1[i]= sc.nextInt();
    }

    System.out.println("-----------------------------------------------");

    for(int i=0;i<vetor2.length;i++){
      System.out.print("Informe um numero inteiro para o vetor2["+i+"] = ");
      vetor2[i]= sc.nextInt();
    }
    sc.close();

    System.out.println("-----------------------------------------------");

    //Efetuando as operações '+','-','*','/'
    for(int i=0; i<vetor1.length;i++){
      System.out.println("Vetor1["+i+"] = "+vetor1[i]);
      System.out.println("Vetor2["+i+"] = "+vetor2[i]);

      for(int j = 0;j<vetorOperacoes.length;j++){
        switch(vetorOperacoes[j]){
          case '+':
            vetorResultado[j] = vetor1[i] +vetor2[i];
            System.out.println(vetor1[i]+" + "+vetor2[i]+" = "+vetorResultado[j]);
            break;
          case '-':
            vetorResultado[j] = vetor1[i] - vetor2[i];
            System.out.println(vetor1[i]+" - "+vetor2[i]+" = "+vetorResultado[j]);
            break;
          case '*':
            vetorResultado[j] = vetor1[i] * vetor2[i];
            System.out.println(vetor1[i]+" * "+vetor2[i]+" = "+vetorResultado[j]);
            break;
          case '/':
            if(vetor2[i]==0){
              System.out.println(vetor1[i]+" / "+vetor2[i]+" = valor inexistente no conjuntos dos numeros reais");

            }else{
              vetorResultado[j] = vetor1[i] / vetor2[i];
              System.out.println(vetor1[i]+" / "+vetor2[i]+" = "+vetorResultado[j]);
            }
            break;
        }
    }
    System.out.println("-----------------------------------------------");
  }
  }
}
