package ak;

/**
 * Created by kondz on 18.03.2017.
 */
public class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(Integer age) {
        this.age = age;
    }


//getery i setery

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge().compareTo(o.getAge());
    }

    @Override
    public String toString() {
        return "ak{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
