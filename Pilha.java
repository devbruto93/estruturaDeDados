public class Pilha {
  private int valores[];
  private int topo;

  public Pilha(){
    valores = new int[10];
    topo = -1; /*indica que a pilha esta vazia, 
    no Java a posiçao inicial de um vetor é 0,
     ao atribuir o valor -1 indica a posiça abaixo da posição 0.*/
  }

  public void push(int elemento){
    topo = topo ++; //adciona +1 elemento na pilha
    valores[topo] = elemento;
  }

  public boolean isEmpty(){
    return (topo == -1); /*a aplicação fara o teste se esta vazio
     ou nao pra so assim fazer um pop */
  }

  public boolean isFull(){
    return (topo == 9); /*verifica se a pilha esta cheia antes de
     fazer um push */
  }

  public int pop(){
    int elem = valores[topo];
    topo --; // remove um elemento da pilha na ordem correta
    return elem;
  }
}

//pilha == stack
