package oopcodes;

class Students {
	 private String name;
	 private int age;

	 public void setName(String name) {
	     this.name = name;
	 }

	 public String getName() {
	     return name;
	 }

	 public void setAge(int age) {
	     if (age > 0 && age < 120) {
	         this.age = age;
	     } else {
	         System.out.println("Invalid age");
	     }
	 }

	 public int getAge() {
	     return age;
	 }
	}
public class Encapsulation {

	 public static void main(String[] args) {
	     // Encapsulation
	     Students student = new Students();
	     student.setName("Alice");
	     student.setAge(20);
	     System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
	 }}
