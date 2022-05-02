import java.util.Scanner;
public class AreaDoTriangulo{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Para saber a area de um triangulo qualquer digite: \nSua base positiva: ");
    int base = sc.nextInt();

    while(base<0 || base==0){
      if(base<0){
        System.out.println("Digite uma base valida, maior que 0");
        base = sc.nextInt();
      }else if(base==0){
        System.out.println("Digite uma base valida, diferente de 0");
        base = sc.nextInt();
      }
    }

    System.out.println("Sua altura positiva: ");
    int altura = sc.nextInt();

    while(altura<0 || altura==0){
      if(altura<0){
        System.out.println("Digite uma base valida, maior que 0");
        altura = sc.nextInt();
      }else if(altura==0){
        System.out.println("Digite uma base valida, diferente de 0");
        altura = sc.nextInt();
      }
    }

    /*Cast é uma conversão, é quando convertemos um valor de um tipo para outro tipo.
    Se fosse só:
    float area = (base*altura)/2;

    o valor da area seria arredondado para inteiro, ja que base e altura são valores inteiros*/

    float area=(float)(base*altura)/2;
    System.out.println("Sua area eh "+area);
    sc.close();
  }
}
