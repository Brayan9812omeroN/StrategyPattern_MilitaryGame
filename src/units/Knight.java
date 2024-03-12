package units;
import abstracts.MilitaryUnits;


public class Knight extends MilitaryUnits {


    public Knight() {

        atackBehavior = new Behaviors.Atack.MeleeSpear();
        movementBehavior = new Behaviors.Movement.HighSpeed();

    }

    @Override
    public void display() {

    }

}