package HomeWork01;

public class HomeWork {
    public static void main(String[] args) {
        Person temp = null;
        Person[] person = new Person[3];
        person[0] = new Person("Jack",18,"JavaEE工程师");
        person[1] = new Person("Mary",59,"C++工程师");
        person[2] = new Person("Roes",23,"C语言工程师");
        for (int i = 0; i < person.length-1; i++) {
            //减一是因为数组第一位是0开头的
            for (int j = 0; j < person.length-1; j++) {
                if(person[i].getAge()>person[i+1].getAge()){
                    temp = person[i];
                    person[i]= person[i+1];
                    person[i+1] = temp;

                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}