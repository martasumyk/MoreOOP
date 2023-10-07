package lotr;

import kick.Cry;
import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Charater {
    private int power;
    private int hp;

    public void kick(Charater oponnent){
        KickStrategy.kick(this, oponnent);
    }

    boolean isAlive(){
        return getHp() > 0;
    }

    public void setHp(int hp){
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }

    public Charater(int i, int j, Cry cry) {
    }

}
