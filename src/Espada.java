public class Espada extends Arma{
    public Espada() {
    }

    public Espada(double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(damage, multiplicador, distancia, tiempo_para_damage);
    }


    @Override
    public double doing_damage(double distancia_enemigo) {
        double dañoEspada=getMultiplicador()*getDamage()*(getDistancia()-distancia_enemigo);
        return dañoEspada;
    }
}
