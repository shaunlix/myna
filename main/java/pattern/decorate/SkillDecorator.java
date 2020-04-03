package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/1
 */
public class SkillDecorator implements Skill {

    private Skill skill;

    public SkillDecorator(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void sayMySkills() {
        skill.sayMySkills();
    }
}
