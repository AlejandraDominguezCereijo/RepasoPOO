public class Botas extends Armadura {
    public Botas() {
    }

    public Botas(double defensa, double multiplicador) {
        super(defensa, multiplicador);
    }


    public double accion_especial(boolean melee,int distancia) {

        return super.accion_especial();
    }
}
