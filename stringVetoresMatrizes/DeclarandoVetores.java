package stringVetoresMatrizes;
/*Vetores são estruturas de dados que armazenam
usualmente uma quantidade fixa de dados de um certo tipo.
O número de posições de um vetor corresponde ao tamanho que ele tem;
a[i], corresponde ao i-ésimo elemento do vetor a, sendo que ((i >= 0) && (i < a.length)).
Java como as linguagens C e C++ são linguagens com vetores zero-based.
Na declaração de vetores deverão ser fornecidas três informações:
  1) o nome do vetor;
  2) o número de posições do vetor(seu tamanho);
  3) o tipo de dado que será armazenado no vetor*/
public class DeclarandoVetores{
  public static void main(String[]args){
    int vetor[] = new int[10];//declaração combinada
    /*A mesma coisa que:
    int vetor[];// declaração do vetor
    vetor = new int[10];// alocação de espaço para vetor*/

    //Java permite a inicialização de vetores no momento da declaração
    String nome[] = {"Juca Bala", "Maria da Silva", "Marcos Paqueta"};

    for(int i =0;i<nome.length;i++){
      System.out.println("nome["+i+"] = "+nome[i]);
    }
    System.out.println("--------------------------------------------------------");
    //Ou tambem:
    vetor[0] = 1090;
    vetor[1] = 243;
    vetor[2] = 312;
    vetor[3] = 4432;
    vetor[4] = 57;
    vetor[5] = 64;
    vetor[6] = 76;
    vetor[7] = 89;
    vetor[8] = 999;
    vetor[9] = 102;

    for(int i =0;i<vetor.length;i++){
      System.out.println("vetor["+i+"] = "+vetor[i]);
    }
  }
}
