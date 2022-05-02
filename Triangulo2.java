import java.util.Scanner;
public class Triangulo2{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 3 valores para saber se eles formam um triangulo");
    System.out.println("Primeiro valor: ");
    int valorUm = sc.nextInt();

    System.out.println("Segundo valor: ");
    int valorDois = sc.nextInt();

    System.out.println("Terceiro valor: ");
    int valorTres = sc.nextInt();

    if((valorUm!=0 && valorUm>0) && (valorDois!=0 && valorDois>0) && (valorTres!=0 && valorTres>0)){
      if(valorUm==valorDois && valorUm==valorTres){
        System.out.println("Seus valores sao iguais entao formam um triangulo equilatero");
      }else if(valorUm==valorDois || valorTres==valorUm || valorTres==valorDois){
        System.out.println("Dois dos seus valores sao iguais entao formam um triangulo isosceles");
      }else{
        System.out.println("Seus valores sao diferentes entao formam um triangulo escaleno");
      }
    }else{
      if(valorUm<=0 && valorDois<=0 && valorTres<=0){
        System.out.println("Seus valores nao formam um triangulo pois todos os seus valores sao menores ou iguais a 0");
      }else if(valorUm<=0 && valorDois<=0){
        System.out.println("Seus valores nao formam um triangulo pois dois dos seus valores sao menores ou iguais a 0");
      }else if(valorUm<=0 && valorTres<=0){
        System.out.println("Seus valores nao formam um triangulo pois dois dos seus valores sao menores ou iguais a 0");
      }else if(valorTres<=0 && valorDois<=0){
        System.out.println("Seus valores nao formam um triangulo pois dois dos seus valores sao menores ou iguais a 0");
      }else if(valorUm<=0 ){
        System.out.println("Seus valores nao formam um triangulo pois o seu primeiro valor eh menor ou igual a 0 ");
      }else if(valorDois<=0){
        System.out.println("Seus valores nao formam um triangulo pois o seu segundo valor eh menor ou igual a 0 ");
      }else{
        System.out.println("Seus valores nao formam um triangulo pois o seu terceiro valor eh menor ou igual a 0 ");
      }
    }
    sc.close();
    }
  }
