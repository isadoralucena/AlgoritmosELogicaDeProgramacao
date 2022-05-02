import java.util.Scanner;
public class GastoDeGasolina{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
      System.out.println("Quantos litros de gasolinas seu automovel percorre em 1 km ?");
      int litro = sc.nextInt();

      System.out.println("Para saber quanto de gasolina ele gastou digite a quantidade de km percorridos: ");
      int km = sc.nextInt();

      System.out.println("Digite o preco da gasolina em 1L para saber quanto foi gasto em real de acordo com os seus km percorridos");
      int valorDaGasolina = sc.nextInt();

      double gastoEmLitros = km/litro;
      double gastoDaGasolina = gastoEmLitros*valorDaGasolina;

      System.out.println("\nKm percorridos = " +km);
      System.out.println("Gasto em litros = " +gastoEmLitros+" L/km");
      System.out.println("Preco da gasolina = R$"+valorDaGasolina);
      System.out.println("Gasto da gasolina nos km percorridos = R$" +gastoDaGasolina);
      sc.close();
    }
  }
