package units;
import abstracts.MilitaryUnits;

public class Archer extends MilitaryUnits {


    public Archer() {

        atackBehavior = new Behaviors.Atack.DistanceArrows();
        movementBehavior = new Behaviors.Movement.ModerateSpeed();

    }

    @Override
    public void display() {

    }

}