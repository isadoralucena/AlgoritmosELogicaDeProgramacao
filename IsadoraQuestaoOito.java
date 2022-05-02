/*Faça um algoritmo que verifique se um valor é perfeito ou não.
Um valor é dito perfeito quando ele é igual a soma dos seus divisores excetuando ele próprio.
(Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus divisores).
Seu algoritmo deve mostrar o número e a mensagem informando se ele é perfeito ou não.*/
import java.util.Scanner;
public class IsadoraQuestaoOito{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor positivo :");
    int valor = sc.nextInt();
    while(valor<0){
      System.out.println("Digite um valor positivo: ");
      valor = sc.nextInt();
    }
    int total = 0;
    if(valor<6){
      System.out.println("Nao eh numero perfeito");
    }else{
      for(int i=1;i<valor;i++){
          if(valor%i==0){
            total += i;
          }
      }
      if(total==valor){
        System.out.println("O numero eh perfeito");
      }else{
        System.out.println("O numero nao eh perfeito");
      }
    }
    sc.close();
  }
}
