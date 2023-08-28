public class Main {

    public static void main(String[] args) {

        Parent marie = new Parent("marie", 45, "Female", "Drawing");
        System.out.println(marie.getHobby());

        Grandparent wayne = new Grandparent("wayne", 70, "Male", "Unemployed");
        System.out.println(wayne.getName());

        Child gavin = new Child("gavin", 14, "Male", "Video Games");
        System.out.println(gavin.getName());
    }

}
