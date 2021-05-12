package gt.edu.umg.ingenieria.sistemas.as1;

public abstract class DecoradorArbol {
    
    protected ArbolNavidad arbolNavidad;

    public DecoradorArbol(ArbolNavidad arbolNavidad) {
        this.arbolNavidad=arbolNavidad;
    }

    public void colocar() {
        this.arbolNavidad.colocar();
    }

}