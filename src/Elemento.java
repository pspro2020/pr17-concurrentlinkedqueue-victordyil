public class Elemento {
    private int numTolva;
    private int idElemento;

    public Elemento(int numTolva, int idElemento) {
        this.numTolva = numTolva;
        this.idElemento = idElemento;
    }

    public int getNumTolva() {
        return numTolva;
    }

    public int getIdElemento() {
        return idElemento;
    }
    public String identifierName(){
        return String.format("%d-%d",getNumTolva(),getIdElemento());
    }
}
