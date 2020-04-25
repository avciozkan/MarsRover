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

	// guarentine inside
	public void move() {
		x += direction.getxAffect();
		x = Math.min(x, grid.getxGrid());
		x = Math.max(0, x);

		y += direction.getyAffect();
		y = Math.min(y, grid.getyGrid());
		y = Math.max(0, y);
	}

	public void turnRight() {
		direction = direction.getNext();
	}

	public void turnLeft() {
		direction = direction.getPrevious();
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
