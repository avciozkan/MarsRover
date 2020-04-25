package com.mars.rover;

import java.util.List;

public class RangeRoverEvoque {
	private RoverLocation location;

	public RangeRoverEvoque(RoverLocation location) {
		this.location = location;
	}

	public void processMoveCommands(List<String> moveCommands) {
		for (String string : moveCommands) {
			proccessCommand(string);
		}
	}

	private void proccessCommand(String command) {
		if (command.toUpperCase().equals("L")) {
			location.turnLeft();
		} else if (command.toUpperCase().equals("R")) {
			location.turnRight();
		} else if (command.toUpperCase().equals("M")) {
			location.move();
		} else {
			System.out.println("Illegal move command : " + command);
		}
	}

	public RoverLocation getLocation() {
		return this.location;
	}

	public void setLocation(RoverLocation location) {
		this.location = location;
	}
}
