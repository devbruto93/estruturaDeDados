public class Filas {
  private int[] valores;
  private int inicio;
  private int fim;
  private int total;

  public Filas(){
    valores = new int[10];
    inicio = 0;
    fim = 0;
    total=0;
  }
  public void add(int elemento){
    valores[fim] = elemento;//na fila s adciona no final, como numa fila de banco
    /*aqui pode ser implementado outra logica pro ponteiro do final da fila voltar 
     * ao inicio da fila.
     * if (fim == 10){
     *     fim == 0}
     * indicando que assim que a variavel fim chegar ao tamanho da fila ela recebera
     * o valor 0, mas para economizar codigo o prof. ensinou essa outra logica.
     */
    fim = (fim + 1) % valores.length;/*essa logica garante que o indice volte ao inicio pois ao chegar na ultima posiçao,
     9 no caso de uma fila com 10 elemento, soma + 1 e
      a logica (% valores.length) faz o valor "voltar" para 0*/
    total++;
  }
  public int delete(){
    int elemento = valores[inicio];
    inicio = (inicio + 1 ) % 10;
    total--;
    return elemento;
  }
  public boolean isEmpty(){
    return total == 0;
  }
  public boolean isFull(){
    return total == 10; //esquça a posição, aqui é quardado o tamanho da fila
  }

}

// fila == queue
