package com.mars.rover;

public class RoverLocation {
	private int x, y;
	private RoverDirection direction;
	private RoverGrid grid;

	public static RoverLocation parseFromCommand(String command) throws IllegalArgumentException {
		String[] locationInfo = command.split(" ");
		try {
			return new RoverLocation(Integer.parseInt(locationInfo[0]), Integer.parseInt(locationInfo[1]),
					RoverDirection.getDirectionFromDirectionString(locationInfo[2]), null);
		} catch (Exception ex) {
			throw new IllegalArgumentException("Illegal Location Parameters : " + command);
		}
	}

	public RoverLocation(int x, int y, RoverDirection direction, RoverGrid grid) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.grid = grid;
	}

	/* 
	 *  Ensuring that the x and y points remain in the grid (Outside and inside control)
	 */
	public void move() {
		x += direction.getxAffect();
		x = Math.min(x, grid.getxGrid()); // Ensuring that x point is not greater than gridXPoint
		x = Math.max(0, x); // Ensuring that x point is not less than zero

		y += direction.getyAffect(); 
		y = Math.min(y, grid.getyGrid()); // Ensuring that y point is not greater than gridYPoint
		y = Math.max(0, y); // Ensuring that y point is not less than zero
	}

	public void turnRight() {
		direction = direction.getRight();
	}

	public void turnLeft() {
		direction = direction.getLeft();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public RoverGrid getGrid() {
		return grid;
	}

	public void setGrid(RoverGrid grid) {
		this.grid = grid;
	}

	public RoverDirection getDirection() {
		return direction;
	}

	@Override
	public String toString() {
		return getX() + " " + getY() + " " + getDirection().getLabel();
	}
}
