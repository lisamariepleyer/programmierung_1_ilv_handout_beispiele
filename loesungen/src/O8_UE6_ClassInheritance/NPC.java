package O8_UE6_ClassInheritance;

public class NPC {
    protected String name;
    protected int health;
    protected int attackPower;

    public NPC(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        System.out.println(getClass().getSimpleName() + " was damaged, health is at " + this.health);
    }

    public void fight(NPC target) {
        target.takeDamage(this.attackPower);
    }

    public final void jump() {
        System.out.println(getClass().getSimpleName() + " jumps");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + this.name + ", health=" + this.health + ", attackPower=" + this.attackPower + "]";
    }

    public void print() {
        System.out.println(this.toString());
    }
}
