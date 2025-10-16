package O9_UE7_AbstractClassesInterfaces;

public abstract class NPC {
    protected String name;
    protected int health;
    protected int attackPower;

    public NPC(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // concrete classes must have takeDamage() but behaviour differs, thus abstract
    public abstract void takeDamage(int amount);

    public abstract void fight(NPC target);

    public final void jump() {
        // can remain concrete because it is final and can thus not be overridden
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
