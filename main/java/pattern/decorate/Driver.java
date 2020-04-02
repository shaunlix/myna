package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/2
 */
public class Driver extends PersonDecorator {
    public Driver(Person person) {
        super(person);
    }

    @Override
    public void sayMySkills() {
        super.sayMySkills();
        System.out.println("我会开车");
    }
}
