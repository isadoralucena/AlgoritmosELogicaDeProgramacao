package stringVetoresMatrizes;
/*Se usa == para comparar o conteúdo das variáveis.
No caso, os tipos primitivos guardam valores
e os tipos de objetos guardam endereços de memória dos objetos (referência).
O método .equals() serve para saber se dois objetos(a referencia a esses objetos) são equivalentes.
Objetos nunca são manipulados diretamente,
mas sempre através de uma variável que contém uma referência para ele.

O método .equalsIgnoreCase() compara uma String com outra String,
ignorando as suas considerações de caso.
Duas strings são consideradas iguais,
se forem do mesmo comprimento
e os caracteres correspondentes nas duas strings forem iguais,
ignorando maiúsculas e minúsculas*/

public class EqualsEqualsIgnoreCase{
  public static void main(String[]args){
    int a = 20;
    int b = 20;
    int c = a;

    if(a == b){//verdadeiro
        System.out.println(a+" eh igual a "+b);
    }else{
      System.out.println(a+" nao eh igual a "+b);
    }

    if(a == c){//verdadeiro
      System.out.println(a+" eh igual a "+c);
    }else{
      System.out.println(a+" nao eh igual a "+c);
    }

    if (b == c){//verdadeiro
      System.out.println(b+" eh igual a "+a);
    }else{
      System.out.println(b+" nao eh igual a "+a);
    }

    System.out.println("----------------------------------------------------------------");

    /*Se str1, str2 e str3 forem criadas sem construtores, todas as condicoes serao verdadeiras.

    Ao usar o operador new é forçado a criação de uma nova String,
    anulando o recurso de otimização da linguagem que evita que o mesmo texto exista mais de uma vez na memória.

    Caso a str1 esteja dentro de um loop for repetido por mil vezes, mil objetos serão criados,
    mas se a str2 estiver dentro de um loop for repetido por mil vezes,
    apenas um objeto será criado na primeira repetição e reutilizado em todas as demais*/

    String str1 = new String("John");
    String str2 = new String("John");
    String str3 = str1;
    if(str1 == str2){//falso (ambas referenciam objetos distintos)
      System.out.println(str1+" eh igual a "+str2);
    }else{
      System.out.println(str1+" nao eh igual a "+str2);
    }

    if(str1.equals(str2)){//verdadeiro
      System.out.println(str1+" eh igual a "+str2);
    }else{
      System.out.println(str1+" nao eh igual a "+str2);
    }

    if(str1 == str3){//verdadeiro (vão referenciar o mesmo objeto)
      System.out.println(str1+" eh igual a "+str3);
    }else{
      System.out.println(str1+" nao eh igual a "+str3);
    }


    if(str1.equals(str3)){//verdadeiro
      System.out.println(str1+" eh igual a "+str3);
    }else{
      System.out.println(str1+" nao eh igual a "+str3);
    }

    if(str2 == str3){//falso (ambas referenciam objetos distintos)
      System.out.println(str2+" eh igual a "+str3);
    }else{
      System.out.println(str2+" nao eh igual a "+str3);
    }

    if(str2.equals(str3)){//verdadeiro
      System.out.println(str2+" eh igual a "+str3);
    }else{
      System.out.println(str2+" nao eh igual a "+str3);
    }








    //compareTo compara se uma cadeia de caracteres é igual a outra
    //se for igual aparece 0
    //Se a diferença for em relação ao excesso de caracteres, aparece um numero -
    //se for em relação a falta de caracteres, um numero +
    System.out.println("----------------------------------------------------------------");


    //Trim so remove espacos no inicio e no final da sring

    //Upper case (coloca string maisucula)
    //Lower case (minuscula)

    //Replace.() substitui caracteres


    System.out.println("JAVA".equals("java")); //false
    System.out.println("JAVA".equalsIgnoreCase("java"));//true
    System.out.println("JAVA ".equalsIgnoreCase("java"));//false

  }
}
