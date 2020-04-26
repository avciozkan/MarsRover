package com.mars.rover;

public class RoverGrid {
	private int xGrid;
	private int yGrid;

	public RoverGrid(int xGrid, int yGrid) {
		this.xGrid = xGrid;
		this.yGrid = yGrid;
	}

	public int getxGrid() {
		return xGrid;
	}

	public int getyGrid() {
		return yGrid;
	}
	/*
	 *  Initialize Grid Size
	 */
	public static RoverGrid parseFromCommand(String command) throws IllegalArgumentException {
		String[] size = command.split(" ");
		try {
			return new RoverGrid(Integer.parseInt(size[0]), Integer.parseInt(size[1]));
		} catch (Exception e) {
			throw new IllegalArgumentException("Illegal Grid Size parameters : " + command);
		}
	}
}
