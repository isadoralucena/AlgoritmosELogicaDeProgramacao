package stringVetoresMatrizes;
/*Faça um programa que leia um nome e imprima as 4 primeiras letras do nome*/
import java.util.Scanner;
public class InformandoPrimeirasLetrasString{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Informe um nome: ");
  String nome = sc.next();
   while(nome.length()<4){
     System.out.print("Informe um nome com no minimo 4 letras: ");
     nome = sc.next();
   }
   sc.close();
   System.out.println("As 4 primeiras letras do nome "+nome+" sao "+nome.substring(0,4));
  }
}
