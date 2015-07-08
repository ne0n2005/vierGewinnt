package de.tobias.vierGewinnt;

public class GameBoard {
	int[][] field = new int[8][8];

	public boolean put(ChipColor chipColor, int row) {
		boolean success = false;
		int column = 0;
		while (!success) {
			if (get(column, row).equals(ChipColor.EMPTY)) {
				field[column][row] = chipColor.getValue();
				success = true;
			} else {
				column++;
			}
		}
		return success;
	}

	public ChipColor get(int column, int row) {
		return ChipColor.fromInt(field[column][row]);
	}

}
