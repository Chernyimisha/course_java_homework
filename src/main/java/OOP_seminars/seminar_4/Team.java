package OOP_seminars.seminar_4;

import OOP_seminars.seminar_4.shilds.Hoplon;
import OOP_seminars.seminar_4.shilds.NullShield;
import OOP_seminars.seminar_4.shilds.Shielded;
import OOP_seminars.seminar_4.warriors.Archer;
import OOP_seminars.seminar_4.warriors.Warrior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{


    List<T> team = new ArrayList<>();


    public T getWarrior(int index){
        return team.get(index);
    }

    public void add(T element){
        team.add(element);
    }


    @Override
    public Iterator<T> iterator() {
        return team.iterator();
    }

    public int getTeamHealth(){
        int result = 0;
        for (T warrior: this) {
            result += warrior.getHealthPoint();
        }
        return result;
    }

    public int getMinSizeShield(){
        int result = 0;
        int tempResult;

        for (T warrior1: this) {
            if (!(warrior1.getShield() instanceof NullShield) && result == 0) {
                result = warrior1.getShield().getSize();
            }

            for (T warrior2 : this) {
                if (!(warrior2.getShield() instanceof NullShield)) {
                    tempResult = warrior2.getShield().getSize();
                    if (tempResult < result) result = tempResult;
                }
            }
        } return result;
    }


    public int getTeamArmorReserve(){
        int result = 0;
        for (T warrior: this) {
            result += warrior.getShield().armorReserve();
        }
        return result;
    }
    public int getTeamDamage(){
        int result = 0;
        for (T warrior: this) {
            result += warrior.getWeapon().damage();
        }
        return result;
    }

    public int maxAttackDistance(){
        int result;
        int tempResult;
        result = tempResult = 0;

        for (T warrior: this) {
            if(warrior instanceof Archer){
                tempResult = ((Archer) warrior).distance();
                if(tempResult > result) result = tempResult;
            }
        } return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T warrior: this) {
            sb.append(warrior).append(",\n");
        }
        sb.append(String.format("\nMaxTeamAttack: %d\n", getTeamDamage()));
        sb.append(String.format("MaxDistanceAttack: %d\n", maxAttackDistance()));
        sb.append(String.format("TeamHealth: %d\n", getTeamHealth()));
        sb.append(String.format("TeamArmorReserve: %d\n", getTeamArmorReserve()));
        if (getMinSizeShield()>0) sb.append(String.format("MinSizeShield: %d\n", getMinSizeShield()));
        else sb.append("MinSizeShield: there are no warriors with shields in the team\n");
        return sb.toString();
    }
}
