import java.util.Scanner;
public class Triangulo{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    float[] lados = new float[3];

    //Atribuindo os valores
    for(int i = 0; i<lados.length;i++){
      System.out.println("Digite o tamanho do lado "+(i+1));
      lados[i] = sc.nextFloat();
    }

    //Atribuindo aos 3 lados diferentes de 0 o tipo de triângulo que formam
    if((lados[0]!=0 && lados[0]>0) && (lados[1]!=0 && lados[1]>0) && (lados[2]!=0 && lados[2]>0)){
      //Desigualdade triangular, condição de existência do triângulo
      if(lados[0] > (lados[1] + lados[2])){
        System.out.println("Nao eh um triangulo, pois o lado 1 eh maior que a soma do lado 2 e 3");
        System.exit(0);
      }else if(lados[1] > (lados[0]+lados[2])){
        System.out.println("Nao eh um triangulo, pois o lado 2 eh maior que a soma do lado 1 e 3");
        System.exit(0);
      }else if(lados[2] > (lados[0]+lados[1])){
        System.out.println("Nao eh um triangulo, pois o lado 3 eh maior que a soma do lado 1 e 2");
        System.exit(0);
      }else{
        //Atribuindo aos 3 lados diferentes de 0 o tipo de triângulo que formam
        if(lados[0]==lados[1] && lados[0]==lados[2]){
          System.out.println("Todos os seus valores sao iguais entao formam um triangulo equilatero");
        }else if(lados[0]==lados[1] || lados[2]==lados[1] || lados[0]==lados[2]){
          System.out.println("Dois dos seus valores sao iguais entao formam um triangulo isosceles");
        }else{
          System.out.println("Todos os seus valores sao diferentes entao formam um triangulo escaleno");
        }
      }
    //Identificando os zeros que não permitem os 3 lados formarem um triângulo
    }else{
      if(lados[0]<=0 && lados[1]<=lados[0]  && lados[2]<=lados[0]){
        System.out.println("Todos os seus lados sao iguais ou menores que 0 entao os valores nao formam um triangulo");
        System.exit(0);//Finaliza a classe
      }else if(lados[0]<=0 || lados[1]<=0  || lados[2]<=0){
        if(lados[0]<=0 && lados[1]<=0){
          System.out.println("Os seus valores nao formam um triangulo pois seu lado 1 e seu lado 2 sao iguais ou menores que 0");
        }else if(lados[0]<=0 && lados[2]<=0){
          System.out.println("Os seus valores nao formam um triangulo pois seu lado 1 e seu lado 3 sao iguais ou menores que 0");
        }else if(lados[1]<=0 && lados[2]<=0) {
          System.out.println("Os seus valores nao formam um triangulo pois seu lado 2 e seu lado 3 sao iguais ou menores que 0");
        }else{
          for(int j = 0;j<lados.length; j++){
            if(lados[j]<=0){
            System.out.println("Seu lado "+(j+1)+" eh igual ou menor que 0 entao seus valores nao formam um triangulo");
            }
          }
        }
      }
    }
    sc.close();
  }
}
