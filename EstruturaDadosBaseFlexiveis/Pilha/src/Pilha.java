public class Pilha {
    
    //Atributo topo, fica sempre apontado para o endereço da ultima entrada
    Celula topo;
    
    //Metodo Construtor, faz a pilha iniciar com topo = null
    Pilha(){
        topo = null;
    }

    /**
     * @return Celula return the topo
     */
    public Celula getTopo() {
        return topo;
    }

    /**
     * @param topo the topo to set
     */
    public void setTopo(Celula topo) {
        this.topo = topo;
    }

    /**
     * Metodo inserir
     */
    public void inserir(int x){
        Celula tmp = new Celula(x);
        tmp.setProx(topo);
        topo = tmp;
        tmp = null;
    }


    /**
     * Metodo remover
     */
    public int remover()throws Exception{
        if(topo == null){
            throw new Exception("Erro!");
        }else{
            int remover = topo.getElemento();

            Celula tmp = topo;
            topo = topo.getProx();
            tmp.setProx(null);
            tmp = null;
    
            return remover;
        }
    }


    /**
     * Metodo mostar
     */
    public void mostar() throws Exception{
        System.out.print("\n [ ");
        for(Celula i = topo; i != null; i = i.getProx()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.print("]\n\n");
    }
    


}






















