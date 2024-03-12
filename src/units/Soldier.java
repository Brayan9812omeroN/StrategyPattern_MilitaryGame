package units;
import abstracts.MilitaryUnits;

public class Soldier extends MilitaryUnits {


    public Soldier() {

        atackBehavior = new Behaviors.Atack.MeleeSword();
        movementBehavior = new Behaviors.Movement.LowSpeed();

    }

    @Override
    public void display() {

    }

}