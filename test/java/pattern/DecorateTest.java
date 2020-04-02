package pattern;

import pattern.decorate.Angler;
import pattern.decorate.Driver;
import pattern.decorate.Man;

/**
 * @author lixiangxiang | 2020/3/31
 */
public class DecorateTest {

    public static void main(String[] args) {
        Man richard = new Man("Richard");
        new Driver(new Angler(richard)).sayMySkills();
    }
}
