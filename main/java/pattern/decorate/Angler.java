package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/2
 */
public class Angler extends PersonDecorator {
    public Angler(Person person) {
        super(person);
    }

    @Override
    public void sayMySkills() {
        super.sayMySkills();
        System.out.println("我会钓鱼");
    }
}
