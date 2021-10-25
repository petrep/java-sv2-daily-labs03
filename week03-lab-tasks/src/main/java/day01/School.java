package day01;

import java.util.ArrayList;
import java.util.List;

public class School {
	public static void main(String[] args) {
		List<Integer> kidHeight = new ArrayList<Integer>();
		Students students = new Students();
		students.addHeight(1);
		students.addHeight(3);
		students.addHeight(4);
		students.addHeight(6);
		students.addHeight(7);
		System.out.println(students.isHeightsIncreasing());
	}
}
