package lotr;

import kick.KickStrategy;
import kick.knightKick;

public class Knight extends Charater {

    public Knight() {
        super(12, 12, new knightKick());
    }
    
}
