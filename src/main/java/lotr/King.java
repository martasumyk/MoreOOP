package lotr;

import java.util.Random;

import kick.kingKick;

public class King extends Charater {

    private static Random random = new Random();

    public King() {
        super(random.nextInt(15), random.nextInt(15), new kingKick());
    }
}
    
