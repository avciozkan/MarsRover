package com.mars.rover.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mars.rover.RoverGrid;

public class MarsRoverGridTest {

	@Test
	public void sizeGrid() {
		RoverGrid grid = RoverGrid.parseFromCommand("6 8");
		assertEquals("6 8", grid.getxGrid() + " " + grid.getyGrid());
	}

	@Test(expected = IllegalArgumentException.class)
	public void sizeGridWrong() {
		RoverGrid grid = RoverGrid.parseFromCommand("R 8");
		assertTrue("Illegal Grid Size parameters : R 8", true);
	}
}
