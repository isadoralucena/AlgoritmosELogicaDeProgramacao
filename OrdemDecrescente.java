import java.util.Scanner;
public class OrdemDecrescente{
	public static void main(String args[]){
	Scanner numeros = new Scanner(System.in);
	System.out.println("Digite tres numeros : ");
	int a;
	a = numeros.nextInt();
	int b;
	b = numeros.nextInt();
	int c;
	c = numeros.nextInt();

	System.out.println("Vamos coloca-los em ordem decrescente?!");

	if(a>b){
		if(b>c){
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}else if(c>b){
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}else{
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}

	}else if(b>c){
		if(a>c){
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		}else if(c>a){
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		}
	}else{
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
	numeros.close();
	}
}
