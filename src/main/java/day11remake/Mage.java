package day11remake;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
        this.physResist = 0;
        this.magicResist = 0.8;
        this.physDmg = 5;
        this.magicDmg = 20;
        this.healForSelf = 0;
        this.healForOther = 0;
    }
}
