package com.mars.rover.parser;

import java.util.Arrays;
import java.util.List;

public class CommandParser {
	public static List<String> parseCommand(String commands){
		List<String> parseStringList = Arrays.asList(commands.split(""));
		return parseStringList;
	}
}
