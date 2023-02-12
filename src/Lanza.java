public class Lanza extends Arma {
    public Lanza() {
    }

    public Lanza(double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(damage, multiplicador, distancia, tiempo_para_damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo) {
        if (distancia_enemigo <= getDistancia() && distancia_enemigo >= (getDistancia() / 2)) {
            double dañoEspada = getDamage();
        } else {
            System.out.println("No se puede aplicar el daño, estas demasiado cerca");
        }
        return super.doing_damage(distancia_enemigo);
    }
}
