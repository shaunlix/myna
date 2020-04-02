package pattern.decorate;

/**
 * @author lixiangxiang | 2020/4/1
 */
public class PersonDecorator implements Person {

    private Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void sayMySkills() {
        person.sayMySkills();
    }
}
