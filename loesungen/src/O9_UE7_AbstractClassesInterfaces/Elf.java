package O9_UE7_AbstractClassesInterfaces;

public class Elf extends NPC implements Trader {
    public Elf(String name) {
        super(name, 90, 20);
    }

    @Override
    public void takeDamage(int amount) {
        boolean avoidAttack = Math.random() < 0.3;

        if (avoidAttack) {
            System.out.println(getClass().getSimpleName() + " could avoid attack");
            amount = 0;
        }

        this.health -= amount;
        System.out.println(getClass().getSimpleName() + " was damaged, health is at " + this.health);
    }

    @Override
    public void fight(NPC target) {
        target.takeDamage(this.attackPower);
    }

    @Override
    public void trade() {
        System.out.println(name + " trades elf-specific goods.");
    }
}
