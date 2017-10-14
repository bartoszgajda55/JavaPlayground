package oop2;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("oop2.Player Dead !");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
