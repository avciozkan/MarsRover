package com.mars.rover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;

import com.mars.rover.parser.CommandParser;

public class MarsRoverMain {
	public static void main(String[] args) throws IOException, Exception {
		RoverGrid grid = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (Objects.isNull(grid)) {
			try {
				System.out.print("Grid Size [int int]: ");
				String gridCommand = bufferedReader.readLine().trim();
				grid = RoverGrid.parseFromCommand(gridCommand);
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
				System.out.println("Try Again Grid Size");
			}
		}
		RangeRoverEvoque rangeRoverEvoque = new RangeRoverEvoque(null);
		while (true) {
			try {
				System.out.print("Rover intial Location [int int String] : ");
				String locationCommand = bufferedReader.readLine().trim();
				RoverLocation roverLocation = RoverLocation.parseFromCommand(locationCommand);
				roverLocation.setGrid(grid);
				rangeRoverEvoque.setLocation(roverLocation);
				System.out.print("Rover move commands [String...] : ");
				String moveCommand = bufferedReader.readLine().trim();
				List<String> moveCommands = CommandParser.parseCommand(moveCommand.toUpperCase());
				rangeRoverEvoque.processMoveCommands(moveCommands);
				System.out.println("Location of RangeRoverEvoque : " + rangeRoverEvoque.getLocation().toString() + "\n");
			} catch (Exception e) {
				System.out.println("Exception :" + e.getMessage());
				System.out.println("Try Again to Buy Range Rover Evoque ^^");
			}
		}
	}
}
