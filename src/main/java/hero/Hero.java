package hero;

/**
 * Created by runda on 2016/12/21.
 */
public class Hero {
    private String name;
    private int hp;
    private int damage;
    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "我是"+this.name+"英雄";
    }
}
