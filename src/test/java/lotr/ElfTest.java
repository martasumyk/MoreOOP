package lotr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lotr.Charater;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Charater character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

}

