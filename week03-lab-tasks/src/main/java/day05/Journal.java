package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
	List<String> kidsNames = new ArrayList<String>();

	boolean addStudent(String studentName) {
		if (studentName.trim().contains(" ")) {
			kidsNames.add(studentName);
			return true;
		}
		return false;
	}
}
