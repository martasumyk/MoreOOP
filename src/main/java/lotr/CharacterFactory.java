package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Charater createCharacter() throws InstantiationException, IllegalAccessException{
        List<Class<? extends Charater>> characters = Arrays.asList(Hobbit.class);
        return characters.get(new Random().nextInt(characters.size())).newInstance();
    }
}
