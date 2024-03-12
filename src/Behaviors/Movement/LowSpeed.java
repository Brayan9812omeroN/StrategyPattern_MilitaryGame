package Behaviors.Movement;
import interfaces.IMovementBehavior;

public class LowSpeed implements IMovementBehavior {

    @Override
    public void movement() {
        System.out.println("Movimiento a velocidad lenta");
    }

}