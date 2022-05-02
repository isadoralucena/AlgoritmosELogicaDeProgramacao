import java.util.Scanner;
public class ContandoNumeros{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ate onde deseja contar? Digite um numero inteiro positivo: ");
    int numero = sc.nextInt();
    if(numero<0){
      System.out.print("\nDigite um numero valido, que seja inteiro e positivo: ");
      numero = sc.nextInt();
    }
    for(int i=0;i<=numero;i++){
      if(i%2==0){
        System.out.println(+i+" - par");
      }else{
        System.out.println(+i+" - impar");
      }
    }
    sc.close();
    }
  }
