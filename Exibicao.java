public class Exibicao{
  public static void main(String[]args){
    //Escreva um programa que mostre uma mensagem de boas vindas, composta pelo seu nome, idade e matrícula
    String nome = "Isadora";
    int idade = 16;
    long matricula = 20201101110051L;//É necessário colocar L ou l no final de valores de variaveis Long

    System.out.print("Bem vinda(o) "+nome+", agora que ja tem sua matricula "+matricula+", se cadastre no SUAP. ");
    System.out.print("Nao se esqueca de colocar todos os seus dados corretamente, como a sua idade. ");
    System.out.print("Nos da administracao ja sabemos que ela eh "+idade+". E todos nos do Campus estamos ansiosos para conhece-lo(la) melhor");
  }
}
