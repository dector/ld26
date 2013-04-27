package io.github.ldears.ld26.map;

/**
 * @author dector
 */
public enum TileType {

	EMPTY(""),
	CEIL("ceil"),
	WALL_LEFT("wall_left"),
	WALL_RIGHT("wall_right"),
	WALL_CLB("wall_corner_left_bottom"),
	WALL_CRB("wall_corner_right_bottom"),
	WALL_MC("wall_middle_ceil"),
	WALL_MIDDLE("wall_middle");

	public static final int PLAYER_WIDTH 		= 2*12;
	public static final int WALL_MIDDLE_WIDTH 	= 4*2;

	public final String name;
	public final int index;

	private TileType(String name) {
		this.name = name;

		index = ordinal() - 1;
	}

	public static TileType last() {
		TileType[] values = values();
		return values[values.length - 1];
	}

	public static int count() {
		return values().length - 1;
	}
}