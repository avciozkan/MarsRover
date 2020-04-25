package com.mars.rover;

import java.util.HashMap;
import java.util.Objects;

public class RoverDirection {
	private String label = "";

	private int xAffect = 0;

	private int yAffect = 0;

	private RoverDirection next = null;

	private RoverDirection previous = null;

	public static RoverDirection N = new RoverDirection("N", 0, 1);
	public static RoverDirection E = new RoverDirection("E", 1, 0);
	public static RoverDirection S = new RoverDirection("S", 0, -1);
	public static RoverDirection W = new RoverDirection("W", -1, 0);

	private static HashMap<String, RoverDirection> directionsMap = new HashMap<String, RoverDirection>();

	/*
	 * next => Turn Right previous => Turn Left
	 */

	static {
		N.setNext(E);
		E.setNext(S);
		S.setNext(W);
		W.setNext(N);
		directionsMap.put(N.getLabel(), N);
		directionsMap.put(E.getLabel(), E);
		directionsMap.put(S.getLabel(), S);
		directionsMap.put(W.getLabel(), W);
	}

	private RoverDirection(String label, int xAffect, int yAffect) {
		this.label = label;
		this.xAffect = xAffect;
		this.yAffect = yAffect;
	}

	public static RoverDirection getDirectionFromDirectionString(String directionString)
			throws IllegalArgumentException {
		RoverDirection direction = directionsMap.get(directionString.toUpperCase());
		if (Objects.isNull(direction)) {
			throw new IllegalArgumentException("Direction is not found from String : " + directionString);
		}
		return direction;
	}

	public RoverDirection getNext() {
		return next;
	}

	public void setNext(RoverDirection next) {
		this.next = next;
		this.next.setPrevious(this);
	}

	public RoverDirection getPrevious() {
		return previous;
	}

	public void setPrevious(RoverDirection previous) {
		this.previous = previous;
	}

	public String getLabel() {
		return label;
	}

	public int getxAffect() {
		return xAffect;
	}

	public int getyAffect() {
		return yAffect;
	}

}
