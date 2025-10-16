package O8_UE6_ClassInheritance;

public class Elf extends NPC {
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

        super.takeDamage(amount);
    }
}
