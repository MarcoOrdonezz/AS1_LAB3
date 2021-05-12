package gt.edu.umg.ingenieria.sistemas.as1;

public class DecoradorBomba extends DecoradorArbol {

    public DecoradorBomba(ArbolNavidad arbolNavidad) {
       super(arbolNavidad);
    }
    

    public void colocar(){
        super.arbolNavidad.colocar();
        this.colocarBomba(super.arbolNavidad);
    }
    
    public void colocarBomba(ArbolNavidad arbolNavidad) {
        if(arbolNavidad instanceof ArbolPinabete){
            System.out.println("decorando Pinabete con bombas");
        }
        if(arbolNavidad instanceof ArbolAbeto){
            System.out.println("decorando Abeto con bombas");
        }
        if(arbolNavidad instanceof ArbolThuya){
            System.out.println("decorando Thuya con bombas");
        }
        if(arbolNavidad instanceof ArbolChiribisco){
            System.out.println("decorando Chiribisco con bombas");
        }
        if(arbolNavidad instanceof ArbolAbies){
            System.out.println("decorando Abies con bombas");
        }
    }


}