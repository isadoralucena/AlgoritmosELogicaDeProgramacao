/*Faça um algoritmo para ler quatro valores reais do teclado, calcular e imprimir na tela:
a)A soma desses valores
b)O produto do primeiro valor pelo terceiro valor
c)O quociente do segundo pelo quarto valor, caso este não seja 0
Se for 0, imprimir mensagem: "Impossivel divisao por zero"*/

import java.util.Scanner;
public class ExercicioOperadoresAritmeticos{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite quatro valores reais: ");
    double valor1 = sc.nextDouble();
    double valor2 = sc.nextDouble();
    double valor3 = sc.nextDouble();
    double valor4 = sc.nextDouble();

    double soma = valor1 + valor2 + valor3 + valor4;
    System.out.println("A soma de todos os valores informados eh = "+soma);

    double produto = valor1 * valor3;
    System.out.println("O produto do primeiro valor pelo terceiro eh "+valor1+" x "+valor3+" = "+produto);

    double quociente;
    if(valor4!=0){
      quociente = valor2 / valor4;
      System.out.println("O quociente do segundo valor pelo quarto eh "+valor2+" / "+valor4+" = "+quociente);
    }else{
      System.out.println("Nao eh possivel encontrar o quociente de "+valor2+" / "+valor4);
      System.out.println("Eh impossivel divisao por zero");
    }
    sc.close();
  }
}
