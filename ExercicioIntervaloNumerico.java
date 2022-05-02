/*Faça um algoritmo que leia dois valores, um pra limite inferior e outro pra superior,
dentro desse limite imprima a soma de todos os números pares contidos nesse intervalo*/
import java.util.Scanner;
public class ExercicioIntervaloNumerico{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois numeros, sendo OBRIGATORIAMENTE um deles maior do que o outro:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    while(num1==num2){
      System.out.println("Os dois numeros sao iguais");
      System.out.println("Digite dois numeros, sendo OBRIGATORIAMENTE um deles maior do que o outro:");
      num1 = sc.nextInt();
      num2 = sc.nextInt();
    }
    int inferior;
    int superior;
    if(num1>num2){
      superior = num1;
      inferior = num2;
    }else{
      superior = num2;
      inferior = num1;
    }

    int numerosPares = 0;
    for(int i=0; i<superior;i++){
      if(i>inferior && i%2==0){
        numerosPares +=i;
      }
    }
    System.out.println("A soma de todos os numeros pares entre "+inferior+" e "+superior+" eh = "+numerosPares);
    sc.close();
  }
}
