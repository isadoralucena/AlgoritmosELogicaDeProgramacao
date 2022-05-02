public class OperadoresAritmeticos{
  public static void main(String[] args){

    /*Ordem de precedência:
    1° ()
    2° *, / e %
    3° + ou -
    */
    int resultado = 1 + 2;
    System.out.println(resultado);

    resultado = resultado - 1;
    System.out.println(resultado);

    resultado = resultado * 2;
    System.out.println(resultado);

    resultado = resultado / 2;
    System.out.println(resultado);

    resultado = resultado + 8;
    System.out.println(resultado);

    resultado = resultado % 7;//Resto da divisão
    System.out.println(resultado);

    String palavra = "Esta eh:";
    palavra += " uma string concatenada";//palavra = palavra + " uma string concatenada"
    System.out.println(palavra);

    String nome = "NOME:\tIDADE:\n";
    nome += "Michel\t16\n";
    nome += "Isadora\t16";
    System.out.println(nome);

    resultado = 10;
    System.out.println(resultado++); //Aqui será imprimido 10 pq o incremento só vai valer após essa linha
    System.out.println(resultado);//Aqui ele vai imprimir 11 porque estamos usando resultado depois do incremento (pós incremento)
    /*O pós incremento é a mesma coisa que:
    System.out.println(resultado);
    resultado+=1;*/

    resultado = 10;
    System.out.println(++resultado); //Aqui será imprimido 11 pq o incremento acontece no exato momento (pré incremento)
    /*O pré incremento é a mesma coisa que:
    resultado+=1;
    System.out.println(resultado);*/
  }
}
