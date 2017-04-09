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
public class FriendClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Club club = new Club();
        Miembro socioSecretario = new Miembro();
        Miembro socioTesorero = new Miembro("Mitama");
        Miembro socio1 = new Miembro("hola");
        Miembro socio2 = new Miembro("chao");
        Miembro socio3 = new Miembro("nose");
        club.setSecretario(socioSecretario);
        club.setTesorero(socioTesorero);
        club.agregarMiembro(socio1);
        club.agregarMiembro(socio2);
        club.agregarMiembro(socio3);
        socioSecretario.setClubDeAmigos(club);
        socioTesorero.setClubDeAmigos(club);
        socio1.setClubDeAmigos(club);
        socio2.setClubDeAmigos(club);
        socio3.setClubDeAmigos(club);
        System.out.println(socioSecretario.getNombre()+" pertenece al club con "+socioSecretario.numeroDeMiembros()+" miembros");
        System.out.println("El club tiene un tesorero "+club.getTesorero());
        System.out.println("Ademas tiene "+(club.getnumeroDeMiembros()-2)+" miembros, los cuales se llaman");
        for(int i=0;i<club.getnumeroDeMiembros()-2;i++){
            System.out.print(club.getNombreMiembro(i));
            if(i%3==2){
                
            }
        }
    }
    
}
