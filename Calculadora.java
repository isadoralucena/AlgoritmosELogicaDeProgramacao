import java.util.Scanner;
public class Calculadora{
	public static void main(String args[]){
	Scanner numeros = new Scanner(System.in);

	//Definindo os números
	System.out.println("Digite um numero: ");
	int n1 = numeros.nextInt();
	System.out.println("Digite outro numero: ");
	int n2 = numeros.nextInt();

	//Escolhendo a operação
	System.out.println("Escolha uma operacao matematica: digite '1' para soma, '2' para subtracao, '3' para divisao e '4' para multiplicacao ");
	int operacao = numeros.nextInt();

	switch(operacao){
		case 1:
			System.out.println(+n1+" + " +n2+ " eh igual a " +n1+n2);
			break;
		case 2:
			System.out.println(+n1+" - " +n2+ " eh igual a " +n1+-n2);
			break;
		case 3:
			System.out.println(+n1+" / " +n2+ " eh igual a " +n1/n2);
			break;
		case 4:
			System.out.println(+n1+" * " +n2+ " eh igual a " +n1*n2);
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
		numeros.close();
	}
}
