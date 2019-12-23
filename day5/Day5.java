package day5;

import java.io.IOException;

import helpers.Day;
import helpers.IntcodeComputer;

public class Day5 implements Day {
	
	public static void main(String[] args) throws IOException {
		new Day5().printParts();
	}
	
	@Override
	public Object part1() throws IOException {
		long res;
		IntcodeComputer intcodeComputer = new IntcodeComputer(5, 1);
		while((res = intcodeComputer.run()) == 0);
		return res;
	}
	
	@Override
	public Object part2() throws IOException {
		return new IntcodeComputer(5, 5).run();
	}
}