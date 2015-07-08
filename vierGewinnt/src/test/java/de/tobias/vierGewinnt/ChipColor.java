package de.tobias.vierGewinnt;

public enum ChipColor {

	EMPTY(0), YELLOW(1), RED(2);

	private final int value;

	private ChipColor(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}

	public static ChipColor fromInt(int i) {
		return ChipColor.values()[i];
	}
}
