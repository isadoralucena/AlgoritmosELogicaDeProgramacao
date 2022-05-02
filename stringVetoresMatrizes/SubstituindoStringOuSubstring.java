package stringVetoresMatrizes;
/*O método .replace() retorna um novo objeto
contendo a string original com um trecho especificado substituído por outra expressão indicada.
Esse método deixa a string original inalterada*/
public class SubstituindoStringOuSubstring{
  public static void main(String[]args){
    String nome1 = "rare";
    //Coloca-se primeiro o que quer substituir, depois pelo o que
    String nome1Alterado = nome1.replace('r', 'd');//fica "dade"
    System.out.println("'"+nome1+"' apos o metodo replace ficou '"+nome1Alterado+"'");
    String nome2 = "bola";
    String nome2Alterado = nome2.replace("bola", "biscoito");
    System.out.println("'"+nome2+"' apos o metodo replace ficou '"+nome2Alterado+"'");
    String nome3 = "lapis";
    String nome3Alterado = nome3.replace("a", " ");
    System.out.println("'"+nome3+"' apos o metodo replace ficou '"+nome3Alterado+"'");
  }
}
