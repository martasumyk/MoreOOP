package lotr;

import java.util.Random;

import kick.KickStrategy;

public class King extends Charater {

    private Random random = new Random();

    public King() {
        super(new kingKick());
        setHp(random.nextInt(15));
        setPower(random.nextInt(15));
    }
    }
    
}
