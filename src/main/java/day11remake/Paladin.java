package day11remake;

public class Paladin extends Hero {

    public Paladin(String name) {
        super(name);
        this.physResist = 0.5;
        this.magicResist = 0.2;
        this.physDmg = 15;
        this.magicDmg = 0;
        this.healForSelf = 25;
        this.healForOther = 10;
    }
}
