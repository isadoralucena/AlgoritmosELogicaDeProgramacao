package stringVetoresMatrizes;
/*Dada uma matriz 5x5, elabore um programa que escreva:
  a) A diagonal principal
  b) O triângulo superior à diagonal principal
  c) O triângulo inferior à diagonal principal
  d) Tudo, exceto a diagonal principal*/
import java.util.Scanner;
public class NovaVersaoDiagonalPrincipal{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int matriz[][] = new int[2][2];

    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
        System.out.println("Informe um valor qualquer para a matriz["+i+"]["+j+"] = ");
        matriz[i][j] = sc.nextInt();
      }
    }
    sc.close();
      for (int i=0;i<matriz.length;i++ ) {//Diagonal principal
        for (int j = 0;j<matriz[i].length;j++) {
          if(i==j){
            System.out.print(matriz[i][j]+"\t");
          }else{
            System.out.print("X\t");
          }
        }
        System.out.print("\n");
      }

      System.out.print("\n");
      for (int i=0;i<matriz.length;i++ ) {//Diagonal triangular superior
        for (int j = 0;j<matriz[i].length;j++) {
          if(i<j){
            System.out.print(matriz[i][j]+"\t");
          }else{
            System.out.print("X\t");
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
      for (int i=0;i<matriz.length;i++ ) {//Diagonal triangular inferior
        for (int j = 0;j<matriz[i].length;j++) {
          if(i>j){
            System.out.print(matriz[i][j]+"\t");
          }else{
            System.out.print("X\t");
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
      for (int i=0;i<matriz.length;i++ ) {//Tudo menos diagonal principal
        for (int j = 0;j<matriz[i].length;j++) {
          if(!(i==j)){
            System.out.print(matriz[i][j]+"\t");
          }else{
            System.out.print("X\t");
          }
        }
        System.out.print("\n");
      }
    }
}
