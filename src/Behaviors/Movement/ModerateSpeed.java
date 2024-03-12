package Behaviors.Movement;
import interfaces.IMovementBehavior;

public class ModerateSpeed implements IMovementBehavior {

    @Override
    public void movement() {
        System.out.println("Movimiento a velocidad moderada");
    }

}