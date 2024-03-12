package Behaviors.Atack;
import interfaces.IAtackBehavior;

public class MeleeSword implements IAtackBehavior {

    @Override
    public void atack() {
        System.out.println("Ataque con Espada");
    }

}