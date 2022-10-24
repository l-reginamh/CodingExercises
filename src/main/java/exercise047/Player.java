package exercise047;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(0, this.name);
        list.add(1, String.valueOf(this.hitPoints));
        list.add(2, String.valueOf(this.strength));
        list.add(3, this.weapon);
        return list;
    }

    @Override
    public void read(List<String> data) {
        if (data != null && data.size() > 0) {
            this.name = data.get(0);
            this.hitPoints = Integer.parseInt(data.get(1));
            this.strength = Integer.parseInt(data.get(2));
            this.weapon = data.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name=\'" + this.name + "\', hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon=\'" + this.weapon + "\'}";
    }
}
