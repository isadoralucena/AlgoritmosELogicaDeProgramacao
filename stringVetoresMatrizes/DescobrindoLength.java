package stringVetoresMatrizes;
/*O comprimento é o número de caracteres contidos na string
Ex.: o comprimento da string "Olá!" é 4, porque ela tem 4 caracteres

Para encontrar o comprimento de uma string usa-se:
o método length() do objeto String e armazena o resultado em uma variável inteira*/

/*Faça um programa em Java que peça ao usuário para digitar um texto
e informe quantos caracteres o texto informado pelo usuário*/
import java.util.Scanner;
public class DescobrindoLength{
  public static void main(String[]args){
    String str = "Hello!";//String criada sem construtor
    int strLength = str.length();
    System.out.println("O length de '"+str+"' eh: "+strLength);

    System.out.println("-----------------------------------------------");

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu primeiro e segundo nome: ");
    String nome = sc.nextLine();
    for(int i=1;i<=nome.length();i++){
      if(i==nome.length()){
        System.out.println("O tamanho de '"+nome+"' eh = "+i);
      }
    }
    sc.close();
  }
}
