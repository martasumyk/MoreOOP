package kick;

import java.util.Random;

import lotr.Charater;

public class kingKick implements KickStrategy{

    @Override
    public void kick(Charater one, Charater opponent) {
        Random rand = new Random();
        opponent.setHp(opponent.getHp()-rand.nextInt(one.getPower()+1));
    
}
}
