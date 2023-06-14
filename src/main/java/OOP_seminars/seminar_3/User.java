package OOP_seminars.seminar_3;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinate;

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }

    public Personal getSubordinate() {
        return subordinate;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d лет", firstName, lastName, age);
    }


    @Override
    public int compareTo(User o) {
        int compareFirstNames = this.firstName.compareTo(o.firstName);
        if(compareFirstNames!=0) return compareFirstNames;
        int compareLastNames = this.lastName.compareTo(o.lastName);
        if(compareLastNames!=0) return compareLastNames;
//        if(this.age<o.age){
//            return -1;
//        } else if (this.age>o.age) {
//            return 1;
//        } else return 0;
        return this.age - o.age;
    }
}
