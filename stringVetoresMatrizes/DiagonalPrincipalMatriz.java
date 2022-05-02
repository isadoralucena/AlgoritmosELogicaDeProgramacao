package stringVetoresMatrizes;
/*Dada uma matriz 5x5, elabore um programa que escreva:
  a) A diagonal principal
  b) O triângulo superior à diagonal principal
  c) O triângulo inferior à diagonal principal
  d) Tudo, exceto a diagonal principal*/
import java.util.Scanner;
public class DiagonalPrincipalMatriz{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int matriz[][] = new int[5][5];

    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz[i].length;j++){
        System.out.println("Informe um valor qualquer para a matriz["+i+"]["+j+"] = ");
        matriz[i][j] = sc.nextInt();
      }
    }
    sc.close();

    for (int i=0;i<matriz.length;i++ ) {
      for (int j = 0;j<matriz[i].length;j++) {
        if(i==j){
          System.out.println("Numeros da diagonal principal: "+matriz[i][j]);
        }else if(i<j){
          System.out.println("Numeros do triangulo superior: "+matriz[i][j]);
        }else if(i>j){
          System.out.println("Numeros do triangulo inferior: "+matriz[i][j]);
        }else if(!(i==j)){
          System.out.println("Todos os numeros, exceto a diagonal principal: "+matriz[i][j]);
        }
      }
    }
  }
}
