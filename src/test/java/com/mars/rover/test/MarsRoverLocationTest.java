package com.mars.rover.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mars.rover.RoverDirection;
import com.mars.rover.RoverGrid;
import com.mars.rover.RoverLocation;

public class MarsRoverLocationTest {
	RoverLocation location;
	RoverDirection roverDirection;
	RoverGrid roverGrid;

	@Before
	public void setUp() {
		roverGrid = RoverGrid.parseFromCommand("4 4");
		roverDirection = RoverDirection.getDirectionFromDirectionString("N");
		location = new RoverLocation(2, 2, roverDirection, roverGrid);
	}

	@Test
	public void moveRoverLocation() {
		location.move();
		assertEquals("2 3 N", location.toString());
	}

	@Test
	public void moveTurnRightRoverLocation() {
		location.move();
		location.turnRight();
		assertEquals("2 3 E", location.toString());
	}

	@Test
	public void moveTurnLeftRoverLocation() {
		location.move();
		location.turnLeft();
		assertEquals("2 3 W", location.toString());
	}

	@Test
	public void turnRightMoveRoverLocation() {
		location.turnRight();
		location.move();
		assertEquals("3 2 E", location.toString());
	}

	@Test
	public void turnLeftMoveRoverLocation() {
		location.turnLeft();
		location.move();
		assertEquals("1 2 W", location.toString());
	}

}
