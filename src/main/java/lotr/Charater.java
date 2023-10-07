package lotr;


import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Charater {
    private int power;
    private int hp;
    protected KickStrategy kickStrategy;

    public Charater(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
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


}
