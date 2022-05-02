import java.util.Scanner;
public class DescobrindoMaioridade{
	public static void main(String args[]){
	Scanner numero = new Scanner(System.in);
	System.out.println("Qual a sua idade?");
	int idade;
	idade = numero.nextInt();
	if(idade >= 18){
		System.out.println("Voce eh maior de idade");
	}else{
		System.out.println("Voce nao eh maior de idade");
	}
	numero.close();
	}
}
