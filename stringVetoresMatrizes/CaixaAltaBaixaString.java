package stringVetoresMatrizes;
/*O método .toUpperCase() retorna uma nova string
com o conteúdo da original convertido para letras maiúsculas,
mantendo a original inalterada

E o método .toLowerCase() retorna uma cópia de uma string
com todas as letras convertidas para minúsculo,
mantendo a original inalterada*/
public class CaixaAltaBaixaString{
  public static void main(String[]args){
    String nome = "Isadora Beatriz";
    System.out.println("O metodo toUpperCase no nome "+nome+" fica "+nome.toUpperCase());
    System.out.println("O metodo toLowerCase no nome "+nome+" fica "+nome.toLowerCase());
  }
}
