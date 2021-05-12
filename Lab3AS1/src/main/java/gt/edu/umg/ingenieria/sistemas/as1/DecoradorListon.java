package gt.edu.umg.ingenieria.sistemas.as1;


public class DecoradorListon extends DecoradorBricho {

    public DecoradorListon(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
    public void colocar(){
        super.arbolNavidad.colocar();
        super.colocarBomba(super.arbolNavidad);
        super.colocarLuces(super.arbolNavidad);
        this.colocarNieve(super.arbolNavidad);
        this.colocarBricho(super.arbolNavidad);
        this.colocarListon(super.arbolNavidad);
    }

    public void colocarListon(ArbolNavidad arbolNavidad) {
        if(arbolNavidad instanceof ArbolPinabete){
            System.out.println("decorando Pinabete con listón");
        }
        if(arbolNavidad instanceof ArbolAbeto){
            System.out.println("decorando Abeto con listón");
        }
        if(arbolNavidad instanceof ArbolThuya){
            System.out.println("decorando Thuya con listón");
        }
        if(arbolNavidad instanceof ArbolChiribisco){
            System.out.println("decorando Chiribisco con listón");
        }
        if(arbolNavidad instanceof ArbolAbies){
            System.out.println("decorando Abies con listón");
        }
    }

}