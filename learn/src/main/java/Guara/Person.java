package Guara;

import com.google.common.collect.ComparisonChain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public  Person(){}

    public  Person(String firstName,String lastName,int age,String sex ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.sex=sex;
    }

    @Override
    public int compareTo(Person o) {
        return ComparisonChain.start().
            compare(this.firstName, o.getFirstName()).
            compare(this.lastName, o.getLastName()).
            compare(this.age, o.getAge()).
            compare(this.sex, o.getSex()).result();
    }
}
