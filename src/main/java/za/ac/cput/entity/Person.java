package za.ac.cput.entity;

/*
    Ameer Ismail
    Person java class
    TDD assignment
    218216033
*/

public class Person
{
    private String height, age, gender;

    //getters
    public String getHeight()
    {
        return height;
    }

    public String getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    //setters
    public void setHeight(String height)
    {
        this.height = height;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    //toString
    @Override
    public String toString()
    {
        return "Person{" +
                "height='" + height + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
