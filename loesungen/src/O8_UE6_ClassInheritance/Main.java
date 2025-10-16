package O8_UE6_ClassInheritance;

public class Main {
    public static void main(String[] args) {
        NPC orc = new Orc("orc1");
        NPC elf = new Elf("elf1");
        NPC dwarf = new Dwarf("dwarf1");

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
