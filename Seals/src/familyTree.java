public sealed abstract class familyTree permits Grandparent, Parent, Child{ // CAN ONLY HAVE THESE SUBTYPES

    private final String name;
    private final int age;
    private final String gender;

    public familyTree(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

final class Grandparent extends familyTree{ // CANNOT HAVE ANYMORE SUBTYPES

    private final String job;

    public Grandparent(String name, int age, String gender,String job) {
        super(name, age, gender);
        this.job = job;
    }

    public String getJob() {
        return job;
    }
}

sealed class Parent extends familyTree permits Mom, Dad{    //  CAN ONLY HAVE THESE 2 SUBTYPES
    private final String hobby;

    public Parent(String name, int age, String gender,String hobby) {
        super(name, age, gender);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }
}

final class Mom extends Parent {

    public Mom(String name, int age, String gender, String hobby) {
        super(name, age, gender, hobby);
    }
}
final class Dad extends Parent {

    public Dad(String name, int age, String gender, String hobby) {
        super(name, age, gender, hobby);
    }
}

non-sealed class Child extends familyTree { // CAN HAVE ANY SUBTYPES
    private final String interest;

    public Child(String name, int age, String gender, String interest) {
        super(name, age, gender);
        this.interest = interest;
    }

    public String getInterest() {
        return interest;
    }

}