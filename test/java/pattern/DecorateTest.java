package pattern;

import pattern.decorate.WalkSkill;
import pattern.decorate.TalkSkill;
import pattern.decorate.Man;

/**
 * @author lixiangxiang | 2020/3/31
 */
public class DecorateTest {

    public static void main(String[] args) {
        Man richard = new Man("Richard");
        new TalkSkill(new WalkSkill(richard)).sayMySkills();
    }
}
