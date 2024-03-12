package abstracts;
import interfaces.IAtackBehavior;
import interfaces.IMovementBehavior;

public abstract class MilitaryUnits {
    public IAtackBehavior atackBehavior;
    public IMovementBehavior movementBehavior;

    public MilitaryUnits(){}

    public abstract void display();

    public void performAtack() {
        atackBehavior.atack();
    }
    public void performMovement() { movementBehavior.movement(); }

}