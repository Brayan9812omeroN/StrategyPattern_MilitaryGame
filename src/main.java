import abstracts.MilitaryUnits;
import units.Archer;
import units.Knight;
import units.Soldier;

public class main {

	public static void main(String[] args) {
		MilitaryUnits archer = new Archer();
		System.out.println("Arquero");
		archer.performMovement();
		archer.performAtack();
		System.out.println("--------------------------------------");

		MilitaryUnits knight = new Knight();
		System.out.println("Caballero");
		knight.performMovement();
		knight.performAtack();
		System.out.println("--------------------------------------");

		MilitaryUnits soldier = new Soldier();
		System.out.println("Soldado");
		soldier.performMovement();
		soldier.performAtack();
		System.out.println("--------------------------------------");
	}

}