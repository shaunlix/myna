package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/2
 */
public class TalkSkill extends SkillDecorator {
    public TalkSkill(Skill skill) {
        super(skill);
    }

    @Override
    public void sayMySkills() {
        super.sayMySkills();
        System.out.println("我点亮了 说话 技能");
    }
}
