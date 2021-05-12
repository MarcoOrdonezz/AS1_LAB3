package gt.edu.umg.ingenieria.sistemas.as1;

import java.util.*;

public class DecoradorNieve extends DecoradorLuces {

    public DecoradorNieve(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
    public void colocar(){
        super.arbolNavidad.colocar();
        super.colocarBomba(super.arbolNavidad);
        super.colocarLuces(super.arbolNavidad);
        this.colocarNieve(super.arbolNavidad);
    }

    public void colocarNieve(ArbolNavidad arbolNavidad) {
        if(arbolNavidad instanceof ArbolPinabete){
            System.out.println("decorando Pinabete con nieve");
        }
        if(arbolNavidad instanceof ArbolAbeto){
            System.out.println("decorando Abeto con nieve");
        }
        if(arbolNavidad instanceof ArbolThuya){
            System.out.println("decorando Thuya con nieve");
        }
        if(arbolNavidad instanceof ArbolChiribisco){
            System.out.println("decorando Chiribisco con nieve");
        }
        if(arbolNavidad instanceof ArbolAbies){
            System.out.println("decorando Abies con nieve");
        }
    }

}