package gt.edu.umg.ingenieria.sistemas.as1;

public class DecoradorLuces extends DecoradorBomba {

    public DecoradorLuces(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
    public void colocar(){
        super.arbolNavidad.colocar();
        this.colocarBomba(super.arbolNavidad);
        this.colocarLuces(super.arbolNavidad);
    }

    public void colocarLuces(ArbolNavidad arbolNavidad) {
        if(arbolNavidad instanceof ArbolPinabete){
            System.out.println("decorando Pinabete con luces");
        }
        if(arbolNavidad instanceof ArbolAbeto){
            System.out.println("decorando Abeto con luces");
        }
        if(arbolNavidad instanceof ArbolThuya){
            System.out.println("decorando Thuya con luces");
        }
        if(arbolNavidad instanceof ArbolChiribisco){
            System.out.println("decorando Chiribisco con luces");
        }
        if(arbolNavidad instanceof ArbolAbies){
            System.out.println("decorando Abies con luces");
        }
    }
    

}