public class IncrementosEDecrementos{
  public static void main(String[]args){
  /*Considere o seguinte código Java: int i = 5, j, k; j = --i; k = i++; i+= 10;
  Depois da execução do código, qual será o valor da variável i, j, k*/
    int i = 5, j, k;
    j = --i;//Pré decremento (j valera 4)
    k = i++;//Pós incremento (k valera 4 pois o incremento de i so vai acontecer depois dessa linha)
    i+=10;// i = i + 10 (i valera 15)
    System.out.println(i);
    System.out.println(j);
    System.out.println(k);

  }
}
