/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friend.club;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Club {
    private int numeroDeMiembros;
    private int dineroDeMiembros;
    private Miembro secretario;
    private Miembro tesorero;
    private ArrayList<Miembro> miembros = new ArrayList();
    
    public void setSecretario(Miembro a){
        secretario=a;
    }
    
    public void setTesorero(Miembro a){
        tesorero=a;
    }
    
    public void agregarMiembro(Miembro a){
        miembros.add(a);
    }
    
    public String getNombreMiembro(int i){
        return miembros.get(i).getNombre();
    }
    
    public String getSecretario(){
        return secretario.getNombre();
    }
    
    public String getTesorero(){
        return tesorero.getNombre();
    }
    
    public int getnumeroDeMiembros(){//get and set
        numeroDeMiembros=2+miembros.size();
        return numeroDeMiembros;
    }
}
