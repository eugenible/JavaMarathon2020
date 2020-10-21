package day11remake;

public abstract class Hero implements Heal, PhysAttack, MagicAttack{
    public static final int MAX_HEALTH = 100;
    public double health = 100;
    public double physResist, magicResist;
    public int physDmg, magicDmg;
    public int healForSelf, healForOther;
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public void physAttack(Hero hero) {
        hero.health -= (1 - hero.physResist) * this.physDmg;
    }

    public void magicAttack(Hero hero) {
        hero.health -= (1 - hero.magicResist) * this.magicDmg;
    }

    public void teammate(Hero hero) {
        hero.health += this.healForOther;
        hero.health = hero.health > MAX_HEALTH ? 100 : hero.health;
    }

    public void himself(){
        this.health += this.healForSelf;
        this.health = this.health > MAX_HEALTH ? 100 : this.health;
    }
}
