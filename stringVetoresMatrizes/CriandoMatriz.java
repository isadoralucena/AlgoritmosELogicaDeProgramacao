package stringVetoresMatrizes;
/*Matrizes sao um conjunto de variáveis de mesmo tipo
Alocadas sequencialmente na memória
Indice: referencia sua localização dentro da estrutura.
No caso de matrizes, precisamos de tantos índices quantos forem seu dimensionamento.
Matriz = um vetor de vetores.
Uma matriz bidimensional(duas dimensões) tem colunas e linhas.
Matriz multimensional = mais de uma dimensão (o mais comum é quando há duas dimensoes)
Vetor = matriz unidimensional(uma dimensão)*/
public class CriandoMatriz{
  public static void main(String[]args){

    //Declarando e inicializando uma matriz 2x2
    int [][]matriz1 = {{24,25},{29,80}};

    //Declarando uma matriz
    //int[][] matriz2 = new int[3][3];

    //Exibindo ela
    for(int linha=0;linha<matriz1.length;linha++){
      for(int coluna=0;coluna<matriz1[linha].length;coluna++){
        System.out.print("\t\tMatriz["+linha+"]["+coluna+"] = "+matriz1[linha][coluna]);
      }
      System.out.println();
    }
  }
}
