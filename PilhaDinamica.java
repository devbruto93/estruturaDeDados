public class PilhaDinamica {

    private Caixinha2 topo;

    public PilhaDinamica(){
        topo = null;
    }
    public void push(int element){
        Caixinha2 novo = new Caixinha2();
        novo.setElement(element);
        novo.setProximo(topo);

        topo = novo;
    }
    public int pop(){
        int element = topo.getElement();
        topo = topo.getProximo();
        return element;
    }
    public boolean isEmpty(){
        return (topo == null);
    }

}
