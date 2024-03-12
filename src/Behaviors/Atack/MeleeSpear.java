package Behaviors.Atack;
import interfaces.IAtackBehavior;

public class MeleeSpear implements IAtackBehavior {

    @Override
    public void atack() {
        System.out.println("Ataque con Lanza");
    }

}