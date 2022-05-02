package stringVetoresMatrizes;
/*Faça um programa que leia o nome do usuário e o imprima na vertical,
em forma de escada, usando apenas letras maiúsculas.
Exemplo:
Nome = HULIANE
Resultado gerado pelo programa:
H
HU
HUL
HULI
HULIA
HULIAN
HULIANE*/
import java.util.Scanner;
public class EscadaLetrasDeString{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe seu nome: ");
    String nome = sc.next();
    sc.close();
    String nomeCaixaAlta = nome.toUpperCase();
    nome = "";
    for(int i=0; i < nomeCaixaAlta.length(); i++){
      nome+= nomeCaixaAlta.charAt(i);
      System.out.println(nome);
    }
  }
}
