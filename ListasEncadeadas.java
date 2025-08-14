
public class ListasEncadeadas {
 
  private Caixinha inicio;

  //criando a lista vazia
  public ListasEncadeadas(){
    this.inicio = null;
  }
  public void inserir(int element){
    //tenho que criar uma nova caixinha
    Caixinha nova = new Caixinha();
    nova.setElement(element);//inseri o elemento na caixinha
    nova.setProximo(null); //depois dela nao vem ninguem

    if (inicio == null){
      inicio = nova;
    }else {
      Caixinha aux;
      aux = inicio;
      while (aux.getProximo() != null){
        aux = aux.getProximo();
      }
      aux.setProximo(nova);
    }
  }
  public int retirar(){
    //este metodo sempre considera que alguem ja testou se a liste tem elementos
    //la na aplcação ANTES  de tentar remover algum elemento

    Caixinha aux = inicio;
    int element = aux.getElement();
    inicio = aux.getProximo();
    return element;
  }
  public void listar(){
    if ( inicio == null){
      System.out.println("Lista vazia!");
    }else {
      Caixinha aux = inicio;
      while (aux != null) {
        System.out.println("Elemento visto" + aux.getElement());
        aux = aux.getProximo();
      }
    }
  }
  public boolean isEmpty(){
    return inicio == null;
  }
}

//a classe "Caixinha" faz parte dessa aula
