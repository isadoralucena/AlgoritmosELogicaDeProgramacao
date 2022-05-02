/*Escrever um algoritmo que leia o nome de dois vendedores de uma loja,
o salário fixo de cada um e o total de vendas efetuadas por cada vendedor no mês (em dinheiro).

Sabendo que o primeiro vendedor ganha 15% de comissão sobre suas vendas efetuadas e
o segundo vendedor ganhar 20% de comissão sobre suas vendas efetuadas,
seu programa deverá informar o nome, o salário fixo e salário no final do mês, dos dois vendedores.*/
import java.util.Scanner;
public class IsadoraQuestaoUm{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do vendedor 1: ");
    String vendUm = sc.nextLine();

    System.out.println("Qual o salario fixo de "+vendUm+"?");
    //SALARIO_UM é uma constante, e seu valor só pode ser atribuido uma vez, estando em CAPS LOCK por convenção, para diferenciar das variáveis
    final float SALARIO_UM= sc.nextFloat();

    System.out.println("Qual o total de vendas que "+vendUm+" realizou no mes?");
    int totalDeVendasUm = sc.nextInt();

    System.out.print(vendUm+" recebe quanto por uma venda? R$");
    float valorDeUmaVendaUm = sc.nextFloat();

    //Na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado antes da leitura do valor String
    sc.nextLine();//esvazia o buffer do teclado

    /*Números com ponto flutuante(que aceitam casas decimais) são por padrão do tipo double,
    mas é possível especificar o tipo do valor durante a criação, para float utiliza-se f ou F
    e também se pode especificar para double, usando d ou D*/
    float comissaoUm = 0.15f;


    float dinheiroTotalVendasUm = (float)totalDeVendasUm * valorDeUmaVendaUm * comissaoUm;

    System.out.println("Digite o nome do vendedor 2: ");
    String vendDois = sc.nextLine();

    System.out.println("Qual o salario fixo de "+vendDois+"?");
    final float SALARIO_DOIS= sc.nextFloat();

    System.out.println("Qual o total de vendas que "+vendDois+" realizou no mes?");
    int totalDeVendasDois = sc.nextInt();

    System.out.print(vendDois+" recebe quanto por uma venda? R$");
    float valorDeUmaVendaDois = sc.nextFloat();

    float comissaoDois = 0.20f;
    float dinheiroTotalVendasDois = (float)totalDeVendasDois * valorDeUmaVendaDois * comissaoDois;

    System.out.println("----------------------------------------------");
    System.out.println("Nome: "+vendUm);
    System.out.println("Salario fixo: R$"+SALARIO_UM);
    System.out.println("Total de vendas em dinheiro: R$"+dinheiroTotalVendasUm);
    System.out.println("Salario final: " +(SALARIO_UM+dinheiroTotalVendasUm));
    System.out.println("----------------------------------------------");
    System.out.println("Nome: "+vendDois);
    System.out.println("Salario fixo: R$"+SALARIO_DOIS);
    System.out.println("Total de vendas em dinheiro: R$"+dinheiroTotalVendasDois);
    System.out.println("Salario final: " +(SALARIO_DOIS+dinheiroTotalVendasDois));
    sc.close();
  }
}
