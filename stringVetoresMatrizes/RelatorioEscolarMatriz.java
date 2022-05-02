package stringVetoresMatrizes;
/*Faça um programa que preencha uma matriz 10x3
com as notas de dez alunos em três provas.
O programa deverá mostrar um relatório com o número dos alunos (número da linha)
e a prova em que cada aluno obteve menor nota.
Ao final do relatório, deverá ser mostrado
quantos alunos tiveram menor nota em cada uma das provas: nas provas 1, 2 e 3.*/
import java.util.Scanner;
public class RelatorioEscolarMatriz{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      //int alunos = 10;
      //int provas = 3;
      int matriz[][] = {
      {6,6,6,6,6,6,6,6,6,10},//Prova 0
      {7,7,7,7,7,7,7,7,7,7},//Prova 1
      {9,9,9,9,9,9,9,9,9,9}};//Prova 2

      int piorProva[] = new int[10];//A pior prova de um aluno pode ser 0, 1 ou 2
      int menorNota[]= {10,10,10,10,10,10,10,10,10,10};//Nota maxima=10 e minima=0

      for(int i = 0; i < matriz.length; i++){//Alunos = linhas
          for(int j = 0; j < matriz[i].length; j++){//Provas = colunas
          if(menorNota[j] > matriz[i][j]){
              menorNota[j] = matriz[i][j];
              piorProva[j] = i;
          }
        }
      }

      System.out.println("***********");
      System.out.println("|Relatorio|");
      System.out.println("***********");

      System.out.println("");

      for(int i = 0;i < piorProva.length; i++){
         System.out.println("O aluno " +i+ " teve a pior nota na prova "+piorProva[i]);
      }

      int piorProva0 = 0;
      int piorProva1 = 0;
      int piorProva2 = 0;

      for(int i = 0; i < piorProva.length; i++){
          int valor = piorProva[i];
          if(valor == 0){
              piorProva0++;
          }else if(valor == 1){
              piorProva1++;
          }else{
              piorProva2++;
          }
      }
      System.out.println("Numero de alunos que tiveram a menor nota na prova 1: " +piorProva0);
      System.out.println("Numero de alunos que tiveram a menor nota na prova 2: " +piorProva1);
      System.out.println("Numero de alunos que tiveram a menor nota na prova 3: " +piorProva2);
      sc.close();
    }
}
