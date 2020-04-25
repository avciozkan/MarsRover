package com.mars.rover.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mars.rover.RangeRoverEvoque;
import com.mars.rover.RoverDirection;
import com.mars.rover.RoverGrid;
import com.mars.rover.RoverLocation;
import com.mars.rover.parser.CommandParser;

public class MarsRoverTest {
	RoverLocation location;
	RoverGrid grid;

	@Before
	public void initialize() {
		grid = new RoverGrid(5, 5);
		location = new RoverLocation(3, 3, RoverDirection.E, grid);
	}

	@Test
	public void rangeRoverEvoque() {
		String commands = "MMRMMRMRRM";
		RangeRoverEvoque evoque = new RangeRoverEvoque(location);
		evoque.processMoveCommands(CommandParser.parseCommand(commands));

		assertEquals("5 1 E", evoque.getLocation().toString());
	}

}
