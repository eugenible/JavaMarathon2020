package day11remake;

public class Shaman extends Hero {

    public Shaman(String name) {
        super(name);
        this.physResist = 0.2;
        this.magicResist = 0.2;
        this.physDmg = 10;
        this.magicDmg = 15;
        this.healForSelf = 50;
        this.healForOther = 30;
    }
}
