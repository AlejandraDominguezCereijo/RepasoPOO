import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Equipo _equipo = new Equipo();
        Scanner cubrir = new Scanner(System.in);
        System.out.println("¿Por cuanto se multiplica el daño de tu espada?");
        double multiplicador = cubrir.nextDouble();
        System.out.println("¿Cuanto daño hace tu espada?");
        double damage = cubrir.nextDouble();
        System.out.println("¿A cuanta distancia hace daño tu espada?");
        double distancia= cubrir.nextDouble();
        System.out.println("¿A que distancia esta nuestro enemigo?");
        double distancia_enemigo = cubrir.nextDouble();
        Arma _arma = new Arma();
        System.out.println(_arma.doing_damage(distancia_enemigo));
        Espada _espada = new Espada();
        System.out.println(_espada.doing_damage(distancia_enemigo));
        System.out.println("¿A que distancia hace daño tu lanza?");
        Scanner cubrir = new Scanner(System.in);
        System.out.println("¿A que distancia esta nuestro enemigo?");
        double distancia_enemigo = cubrir.nextDouble();*/

        Random ale = new Random();
        int distancia_enemigo = ale.nextInt(5) + 1;

        boolean proyectil=true;
        boolean melee=true;


        Espada _espada = new Espada(5,3,5,1);

        Lanza _lanza = new Lanza(3,2,6,2);

        Hacha _hacha = new Hacha(8,4,3,4);

        Casco _casco=new Casco(3,2);

        Botas _botas = new Botas(4,2);


        Equipo[] array_equipo=new Equipo[5];
        array_equipo[0]=_espada;
        array_equipo[1]=_lanza;
        array_equipo[2]=_hacha;
        array_equipo[3]=_casco;
        array_equipo[4]=_botas;

        for (Equipo e : array_equipo){
            if (e instanceof Arma){
                System.out.println(((Arma) e).doing_damage(distancia_enemigo));
            }else {
                if (e instanceof Botas){
                    System.out.println(((Botas) e).accion_especial(melee,5));
                }if (e instanceof Casco){
                    System.out.println(((Casco) e).accion_especial(proyectil));
                }
            }
        }
    }
}
