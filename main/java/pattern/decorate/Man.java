package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/1
 */
public class Man implements Skill {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void sayMySkills() {
        System.out.println(String.format("我是%s", name));
        System.out.println("开始点亮我的技能树\n我自带了 吃喝拉撒睡 技能");
    }
}
