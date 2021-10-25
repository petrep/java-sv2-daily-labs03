package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
	private List<Integer> kidHeight = new ArrayList<Integer>();

	public void addHeight(int height) {
		kidHeight.add(height);
	}

	public boolean isHeightsIncreasing() {
//		boolean result = true;
		for (int i = 0; i < kidHeight.size()-1; i++) {
//			if (kidHeight.get(i) > kidHeight.get(i+1)) result = false;
			if (kidHeight.get(i) > kidHeight.get(i+1)) return false;
		}
//		return result;
		return true;
	}
}
