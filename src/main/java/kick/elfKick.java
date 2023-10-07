package kick;

import lotr.Charater;

public class elfKick implements KickStrategy{
    @Override
    public void kick(Charater one, Charater opponent) {
        if (one.getPower() > opponent.getPower()) {
            opponent.setHp(0);
        } else {
            one.setHp(one.getHp() - 1);
        }
        System.out.println("Just a magic and no hp :)");
    }
}