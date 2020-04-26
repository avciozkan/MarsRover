package com.mars.rover.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mars.rover.RoverDirection;

public class MarsRoverDirectionTest {
	RoverDirection directionNorth;
	RoverDirection directionEast;
	RoverDirection directionSouth;
	RoverDirection directionWest;

	@Before
	public void setUp() {
		directionNorth = RoverDirection.getDirectionFromDirectionString("N");
		directionEast = RoverDirection.getDirectionFromDirectionString("E");
		directionSouth = RoverDirection.getDirectionFromDirectionString("S");
		directionWest = RoverDirection.getDirectionFromDirectionString("W");
	}

	@Test
	public void northTurnRight() {
		directionNorth = directionNorth.getRight();
		assertEquals("E", directionNorth.getLabel());
	}

	@Test
	public void northTurnLeft() {
		directionNorth = directionNorth.getLeft();
		assertEquals("W", directionNorth.getLabel());
	}

	@Test
	public void eastTurnRight() {
		directionEast = directionEast.getRight();
		assertEquals("S", directionEast.getLabel());
	}

	@Test
	public void eastTurnLeft() {
		directionEast = directionEast.getLeft();
		assertEquals("N", directionEast.getLabel());
	}

	@Test
	public void southTurnRight() {
		directionSouth = directionSouth.getRight();
		assertEquals("W", directionSouth.getLabel());
	}

	@Test
	public void southTurnLeft() {
		directionSouth = directionSouth.getLeft();
		assertEquals("E", directionSouth.getLabel());
	}

	@Test
	public void westTurnRight() {
		directionWest = directionWest.getRight();
		assertEquals("N", directionWest.getLabel());
	}

	@Test
	public void westTurnLeft() {
		directionWest = directionWest.getLeft();
		assertEquals("S", directionWest.getLabel());
	}
}
