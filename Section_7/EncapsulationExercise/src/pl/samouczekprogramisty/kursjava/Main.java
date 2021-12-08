package pl.samouczekprogramisty.kursjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(30, true);
        System.out.println(printer.addToner(20));
        System.out.println("Number of pages printed: " + printer.printPages(5));
        System.out.println("Number of pages printed: " +         printer.printPages(6));
        System.out.println("Total number of pages printed: " + printer.getPagesPrinted());
    }
}
