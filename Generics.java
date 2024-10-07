package generics;

public class Generics {
	
	public static class Printer <T>{
		T things;
		public Printer(T things) {
			this.things=things;
		}
		public void print() {
			System.out.println(things);
		}
	}

	public static void main(String[] args) {
	 Printer <Integer> printer = new Printer<>(23);
	 printer.print();
	 Printer <Double> doubleprinter = new Printer<>(56.56);
	 doubleprinter.print();

	}

}
