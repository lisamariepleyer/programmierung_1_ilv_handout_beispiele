package O8_UE6_ClassInheritance;

public class Dwarf extends NPC {
    public Dwarf(String name) {
        super(name, 110, 18);
    }

    @Override
    public void takeDamage(int amount) {
        System.out.println(getClass().getSimpleName() + " takes reduced damage");

        amount -= 5;
        super.takeDamage(amount);
    }
}
