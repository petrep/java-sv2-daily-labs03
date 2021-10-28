package day04;

import java.util.Arrays;

public class Prison {
	private boolean[] cells = new boolean[100];

	public boolean[] getCells() {
		return cells;
	}

	public void openFreeCells() {
		for (int i = 0; i < cells.length; i++) {
			for (int j = i; j < cells.length; j++) {
				if ((j + 1) % (i + 1)==0) {
					cells[j] = !cells[j];
				}
			}
		}
	}
}
