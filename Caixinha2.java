public class Caixinha2 {
  private int element;
  private Caixinha2 proximo; //a classe referencia a ela mesma.
  public int getElement() {
    return element;
  }
  public void setElement(int element) {
    this.element = element;
  }
  public Caixinha2 getProximo() {
    return proximo;
  }
  public void setProximo(Caixinha2 proximo) {
    this.proximo = proximo;
  }

}

//aqui é a classe que sera guardado os elementos da lista.
//a classe "ListaEncadeadas" faz parte dessa aula.