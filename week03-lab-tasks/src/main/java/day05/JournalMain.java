package day05;

public class JournalMain {
	public static void main(String[] args) {
		Journal journal = new Journal();
		journal.addStudent("Kis Pista");
		journal.addStudent("Madonna");
		journal.addStudent(" Feri");
		journal.addStudent("Kovács Kokó István");

		System.out.println(journal.kidsNames.toString());
	}
}
