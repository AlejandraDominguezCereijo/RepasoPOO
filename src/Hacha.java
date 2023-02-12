public class Hacha extends Arma {
    public Hacha() {
    }

    public Hacha(double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(damage, multiplicador, distancia, tiempo_para_damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo) {
        if (getDistancia()==distancia_enemigo){
          double dañoHacha=getDamage()*3;
        }

        return super.doing_damage(distancia_enemigo);
    }
}
