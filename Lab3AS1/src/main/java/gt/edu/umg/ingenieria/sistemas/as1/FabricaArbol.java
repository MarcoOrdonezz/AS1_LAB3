package gt.edu.umg.ingenieria.sistemas.as1;

public class FabricaArbol {

    public FabricaArbol() {
    }

    public ArbolNavidad getArbol(String tipoArbol) {
        switch(tipoArbol.toUpperCase()){
            case "PINABETE":
                System.out.println("Fabricando árbol tipo Pinabete");
                return new ArbolPinabete();
            case "CHIRIBISCO": 
                System.out.println("Fabricando árbol tipo Chiribisco");
                return new ArbolChiribisco();
            case "ABETO": 
                System.out.println("Fabricando árbol tipo Abeto");
                return new ArbolAbeto();
            case "ABIES": 
                System.out.println("Fabricando árbol tipo Abies");
                return new ArbolAbies();
            case "THUYA": 
                System.out.println("Fabricando árbol tipo Thuya");
                return new ArbolThuya();
            default: return null;
        }
    }

}