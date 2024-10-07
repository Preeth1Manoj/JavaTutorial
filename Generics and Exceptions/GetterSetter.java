package generics;

public class GetterSetter {


 public static class Person {
	 
    private String name;
    private int age;

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        // validation 
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

    public static void main(String[] args) {
        Person person = new Person();
        Person p1 =new Person();
        
        // Using setters to set values
        person.setName("Preethi");
        person.setAge(23);
        p1.setName("Sijo");
        p1.setAge(43);
        
        // Using getters to access values
        System.out.println("Name: " + person.getName() + " and " + p1.getName()); 
        System.out.println("Age: " + person.getAge() + " and " + p1.getAge());    

        // invalid age
        person.setAge(-5);  
    }
}
