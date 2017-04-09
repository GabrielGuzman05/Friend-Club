/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friend.club;

/**
 *
 * @author Gabriel
 */
public class Miembro {
    private String nombre;
    private int identificacion;
    
    private Club clubDeAmigos;
    
    Miembro(){
        nombre="Juanaito";
    }
    
    Miembro(String a){
        nombre=a;
    }
    
    public void setClubDeAmigos(Club a){
        clubDeAmigos=a;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getIdentificacion(){
        return identificacion;
    }
    
    public void setNombre(String a){
        nombre=a;
    }
    
    public int numeroDeMiembros(){
        return clubDeAmigos.getnumeroDeMiembros();
    }
}
