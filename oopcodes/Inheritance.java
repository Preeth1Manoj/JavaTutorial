package oopcodes;

class Onepiece {
	 void gear() {
	     System.out.println("Gear1 powerrr");
	 }
	
  void power() {
	  System.out.println("Pirate hunter");
	  
  }}

	class Strawhats extends Onepiece {
	 void power() {
	     System.out.println("Strawhats will find the OnePiece");
	 }
	}


public class Inheritance {
	public static void main(String[] args) {
Onepiece luffy = new Onepiece();
luffy.gear();
luffy.power();
Strawhats zoro = new Strawhats();
zoro.power();
}}