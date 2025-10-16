package O9_UE7_AbstractClassesInterfaces;

public class Troll extends NPC implements TurnToStone {
    public Troll(String name) {
        super(name, 150, 40);
    }

    @Override
    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.println(getClass().getSimpleName() + " was damaged, health is at " + this.health);
    }

    @Override
    public void fight(NPC target) {
        target.takeDamage(this.attackPower);
    }

    @Override
    public void turnToStone() {
        this.health = 0;
    }
}
