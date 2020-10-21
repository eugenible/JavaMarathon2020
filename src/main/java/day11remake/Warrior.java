package day11remake;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
        this.physResist = 0.8;
        this.magicResist = 0;
        this.physDmg = 30;
        this.magicDmg = 0;
        this.healForSelf = 0;
        this.healForOther = 0;
    }
}
