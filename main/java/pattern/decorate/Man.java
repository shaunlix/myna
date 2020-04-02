package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/1
 */
public class Man implements Person {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void sayMySkills() {
        System.out.println(String.format("我是%s, 我会吃饭、睡觉", name));
    }
}
