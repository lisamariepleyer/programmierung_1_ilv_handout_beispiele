package O8_UE6_ClassInheritance;

public class Main {
    public static void main(String[] args) {
        Orc orc = new Orc("orc1");
        Elf elf = new Elf("elf1");
        Dwarf dwarf = new Dwarf("dwarf1");

        orc.print();
        elf.print();
        dwarf.print();

        orc.fight(elf);
        // ensure Dwarf takes reduced damage
        elf.fight(dwarf);
        dwarf.fight(orc);

        orc.jump();
        elf.jump();
        dwarf.jump();

        orc.print();
        elf.print();
        dwarf.print();

        // ensure Orcs attackPower changes based on health and
        // ensure Elf can sometimes void attack
        orc.fight(orc);
        orc.print();
        orc.fight(elf);
        orc.print();
        elf.print();
    }
}
