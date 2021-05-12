package gt.edu.umg.ingenieria.sistemas.as1;


public class DecorarArbol {


    public static void main(String[] args) {
        FachadaArbolesNavidad fachada = new FachadaArbolesNavidad();
        fachada.fabricarPinabete();
        System.out.println("-----------------");
        fachada.fabricarChiribisco();
        System.out.println("-----------------");
        fachada.fabricarAbeto();
        System.out.println("-----------------");
        fachada.fabricarAbies();
        System.out.println("-----------------");
        fachada.fabricarThuya();
    }

}