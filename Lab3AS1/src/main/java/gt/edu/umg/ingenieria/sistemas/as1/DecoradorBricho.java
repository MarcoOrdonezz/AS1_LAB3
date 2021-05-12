package gt.edu.umg.ingenieria.sistemas.as1;

import java.util.*;

public class DecoradorBricho extends DecoradorNieve {

    public DecoradorBricho(ArbolNavidad arbolNavidad) {
        super(arbolNavidad);
    }
    
    public void colocar(){
        super.arbolNavidad.colocar();
        super.colocarBomba(super.arbolNavidad);
        super.colocarLuces(super.arbolNavidad);
        this.colocarNieve(super.arbolNavidad);
        this.colocarBricho(super.arbolNavidad);
    }

    public void colocarBricho(ArbolNavidad arbolNavidad) {
        if(arbolNavidad instanceof ArbolPinabete){
            System.out.println("decorando Pinabete con bricho");
        }
        if(arbolNavidad instanceof ArbolAbeto){
            System.out.println("decorando Abeto con bricho");
        }
        if(arbolNavidad instanceof ArbolThuya){
            System.out.println("decorando Thuya con bricho");
        }
        if(arbolNavidad instanceof ArbolChiribisco){
            System.out.println("decorando Chiribisco con bricho");
        }
        if(arbolNavidad instanceof ArbolAbies){
            System.out.println("decorando Abies con bricho");
        }
    }

}