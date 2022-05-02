package stringVetoresMatrizes;
/*Faça um programa que leia uma data de nascimento no formato dd/mm/aaaa
e imprima a data com o mês escrito por extenso
Exemplo: Data = 03/09/2019
Resultado gerado pelo programa: Você nasceu em 03 de setembro de 2019*/
import java.util.Scanner;
public class ColocandoDataPorExtenso{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe sua data de nascimento no formato dd/mm/aaaa");
    System.out.println("Exemplo.: 03/09/2019");
    System.out.print("Digite-a: ");
    String data = sc.next();

    while(data.charAt(2)!= '/' || data.charAt(5)!= '/' || data.length()<10 || data.length()>10){
      System.out.println("Informe sua data de nascimento no formato dd/mm/aaaa");
      System.out.println("Exemplo.: 03/09/2019");
      System.out.print("Digite-a: ");
      data = sc.next();
    }
    sc.close();
    String mes;
    switch(data.substring(3,5)){
      case "01":
        mes = "janeiro";
        break;
      case "02":
        mes = "fevereiro";
        break;
      case "03":
        mes = "marco";
        break;
      case "04":
        mes = "abril";
        break;
      case "05":
        mes = "maio";
        break;
      case "06":
        mes = "junho";
        break;
      case "07":
        mes = "julho";
        break;
      case "08":
        mes = "agosto";
        break;
      case "09":
        mes = "setembro";
        break;
      case "10":
        mes = "outubro";
        break;
      case "11":
        mes = "novembro";
        break;
      case "12":
        mes = "dezembro";
        break;
      default:
        mes = "mes inexistente";
        break;
    }
    System.out.println("Voce nasceu em "+data.substring(0,2)+" de "+mes+" de "+data.substring(6));
  }
}
