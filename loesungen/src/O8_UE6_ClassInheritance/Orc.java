package O8_UE6_ClassInheritance;

public class Orc extends NPC{
    public Orc(String name) {
        super(name, 120, 30);
    }

    @Override
    public void fight(NPC target) {
        int damage = this.attackPower;

        if (this.health > 80) {
            damage += 10;
            System.out.println(getClass().getSimpleName() + " is strong and has +10 damage");
        }

        target.takeDamage(damage);
    }
}
