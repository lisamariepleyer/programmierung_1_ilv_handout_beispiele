package O9_UE7_AbstractClassesInterfaces;

import java.awt.dnd.DragGestureEvent;

public class Main {
    public static void main(String[] args) {
        NPC orc = new Orc("orc1");
        NPC elf = new Elf("elf1");
        NPC dwarf = new Dwarf("dwarf1");

        // superclass can't be instantiated
        // NPC npc = new NPC("iDontMakeSense", 0, 0);
        // object type vs. polymorphism
        // orc.imASpecialOrcMethod();
        Orc helperOrg = new Orc("orc2");
        helperOrg.imASpecialOrcMethod();

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

        // doesn't work since it's type NPC
        // elf.trade();
        Elf helperElf = new Elf("elf2");
        helperElf.trade();
        helperElf.jump();
        // some more subtyping
        Trader helperDwarf = new Dwarf("dwarf2");
        helperDwarf.trade();
        // helperDwarf.jump();

        Troll troll = new Troll("troll1");
        troll.print();
        troll.turnToStone();
        troll.print();
    }
}
