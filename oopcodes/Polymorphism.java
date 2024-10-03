package oopcodes;

class Hospital {
void hosp() {
   System.out.println("Electronic medical records");
}
}

class Lab extends Hospital {
@Override
void hosp() {
   System.out.println("Lab room");
}
}

class Doctor extends Hospital {
@Override
void hosp() {
   System.out.println("Consult doctors");
}
}
public class Polymorphism {
	public static void main(String[] args) {
	     Hospital circle = new Hospital();
	     Lab square = new Lab();
	     Doctor doc = new Doctor();
	     circle.hosp();
	     square.hosp();
	     doc.hosp();
	}

}
