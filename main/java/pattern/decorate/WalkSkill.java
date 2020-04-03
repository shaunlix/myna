package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/2
 */
public class WalkSkill extends SkillDecorator {
    public WalkSkill(Skill skill) {
        super(skill);
    }

    @Override
    public void sayMySkills() {
        super.sayMySkills();
        System.out.println("我点亮了 走路 技能");
    }
}
