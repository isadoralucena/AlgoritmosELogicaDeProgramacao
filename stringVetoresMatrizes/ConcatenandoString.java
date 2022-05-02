package stringVetoresMatrizes;
public class ConcatenandoString{
  public static void main(String[]args){
    String str1 = "mundo";
    String str2 = "grande";
    String str3 = "lindo";
    String str4 = "cheiroso";
    int num1 = 2;

    //String result = str1 + str2;//mundogrande
    String result = str1.concat(str2);//mundogrande
    result += str3;//mundograndelindo
    result += str3.concat(str4 + num1);//Se for usado só = result ficaria lindocheiroso2
    System.out.println("String resultado: "+result);//mundograndelindolindocheiroso2

  }
}
