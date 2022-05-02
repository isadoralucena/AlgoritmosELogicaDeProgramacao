/*Faça um algoritmo que solicita ao usuário, a altura (alt)
e o sexo de uma pessoa, exibindo uma mensagem com o peso ideal.
Para homens, calcular o peso ideal usando a formula peso ideal = 72.7 x alt - 58 e,
para mulheres, peso ideal = 62.1 x alt - 44.7*/
import java.util.Scanner;
public class IsadoraQuestaoNove{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe uma altura em metros: ");
    float alt = sc.nextFloat();

    System.out.println("Informe um sexo biologico, considerando: ");
    System.out.println("'feminino' sem aspas para feminino");
    System.out.println("'masculino' sem aspas para masculino");
    String sexo = sc.next();

    switch(sexo){
      case "feminino":
        float pesoIdealFeminino= (float) (62.2 * alt)-44.7f;
        System.out.println("Peso ideal = "+pesoIdealFeminino);
        break;
      case "masculino":
        float pesoIdealMasculino = (float) (72.7 * alt)-58f;
        System.out.println("Peso ideal = "+pesoIdealMasculino);
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
    sc.close();
  }
}
