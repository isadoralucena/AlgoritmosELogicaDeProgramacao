import java.util.Scanner;
public class Bhaskara{
	public static void main(String args[]){
	Scanner variaveis = new Scanner(System.in);
	System.out.println("Vamos resolver uma equacao do 2 grau!?");

	//Descobrindo delta

	System.out.println("Digite o valor de a: ");
	int a;
	a = variaveis.nextInt();
	System.out.println("Digite o valor de b: ");
	int b;
	b = variaveis.nextInt();
	System.out.println("Digite o valor de c: ");
	int c;
	c= variaveis.nextInt();

	double delta;
	delta= (Math.pow(b, 2))-(4*a*c);

	double xLinha;
	double xDuasLinhas;

	if(delta>0){
		System.out.println("Delta eh maior que 0");
			xLinha= ((-b) + (Math.sqrt(delta)))/(2*a);
			xDuasLinhas= ((-b) - (Math.sqrt(delta)))/(2*a);
			System.out.println("x linha = " +xLinha+ " e x duas linhas = " +xDuasLinhas);
	}else if(delta==0){
		System.out.println("Delta eh igual a 0");
			xLinha= ((-b) + (Math.sqrt(delta)))/(2*a);
			System.out.println("x linha = x duas linhas = " +xLinha);
	}else{
		System.out.println("Delta eh menor que 0 e a equacao nao possui raizes reais");
	}
	variaveis.close();
	}
}
