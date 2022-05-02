package stringVetoresMatrizes;
/*Faça um programa que conte o número de uns(um) que aparecem em um string.
Exemplo: 0011001 tem 3 uns*/
public class ContandoUnsNumaString{
  public static void main(String[]args){
    String str1 = "00101010101010101011010100000001";
    int contagem=0;
    for(int i=0; i<str1.length();i++){
      if(str1.charAt(i) == '1'){
        contagem++;
      }
    }
    System.out.println("Na string "+str1+" ha "+contagem+"uns(um)");
  }
}
