package Behaviors.Movement;
import interfaces.IMovementBehavior;

public class HighSpeed implements IMovementBehavior {

    @Override
    public void movement() {
        System.out.println("Movimiento a gran velocidad");
    }

}