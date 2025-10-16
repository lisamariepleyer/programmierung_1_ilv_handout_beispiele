package O9_UE7_AbstractClassesInterfaces;

public class Dwarf extends NPC implements Trader {
    public Dwarf(String name) {
        super(name, 110, 18);
    }

    @Override
    public void takeDamage(int amount) {
        System.out.println(getClass().getSimpleName() + " takes reduced damage");
        amount -= 5;

        this.health -= amount;
        System.out.println(getClass().getSimpleName() + " was damaged, health is at " + this.health);
    }

    @Override
    public void fight(NPC target) {
        target.takeDamage(this.attackPower);
    }

    @Override
    public void trade() {
        System.out.println(name + " trades dwarf-specific goods.");
    }
}
