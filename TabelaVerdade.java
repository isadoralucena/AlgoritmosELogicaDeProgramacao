public class TabelaVerdade{
	public static void main(String args[]){
	boolean p;
	boolean q;
	p=true;
	q=true;

  //P e Q
  System.out.println("P ^ Q");

  System.out.print("\nP | Q | ");
	System.out.print(p&&q);
	q=false;
  System.out.print("\nP | Q | ");
	System.out.print(p&&q);

	//P ou q
  System.out.println("\n\nP ou  Q");
  System.out.print("\nP | Q | ");
	q=true;
	System.out.print(p||q);
	q=false;
  System.out.print("\nP | Q | ");
	System.out.print(p||q);

	//P se então q
  System.out.println("\n\nP --> Q");
  System.out.print("\nP | Q | ");
	q=true;
	if((p==true) && (q==false)){
		System.out.print("false");
	}else{
		System.out.print("true");
	}

  System.out.print("\nP | Q | ");
	q=false;
	if((p==true) && (q==false)){
		System.out.print("false");
	}else{
		System.out.print("true");
	}
	}
}
