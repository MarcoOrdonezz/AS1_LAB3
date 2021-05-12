package gt.edu.umg.ingenieria.sistemas.as1;

public class FachadaArbolesNavidad {

    public FachadaArbolesNavidad() {
    }



    public void fabricarPinabete() {
       FabricaArbol fabrica = new FabricaArbol();
       DecoradorArbol decorador = new DecoradorListon(fabrica.getArbol("pinabete"));
       decorador.colocar();
    }

    public void fabricarChiribisco() {
       FabricaArbol fabrica = new FabricaArbol();
       DecoradorArbol decorador = new DecoradorListon(fabrica.getArbol("chiribisco"));
       decorador.colocar();
    }

    public void fabricarThuya() {
       FabricaArbol fabrica = new FabricaArbol();
       DecoradorArbol decorador = new DecoradorListon(fabrica.getArbol("thuya"));
       decorador.colocar();
    }

    public void fabricarAbies() {
       FabricaArbol fabrica = new FabricaArbol();
       DecoradorArbol decorador = new DecoradorListon(fabrica.getArbol("abies"));
       decorador.colocar();
    }

    public void fabricarAbeto() {
       FabricaArbol fabrica = new FabricaArbol();
       DecoradorArbol decorador = new DecoradorListon(fabrica.getArbol("abeto"));
       decorador.colocar();
    }

}