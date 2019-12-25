package day13;

import intcodeComputer.IntcodeComputer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Day13 {

  //  private static String resourceDirectory = "src/main/resources/day13/";
    private static String inputFilePart1 = "./src/day13/Day13Input.txt";
    private static String inputFilePart2 = "./src/day13/Day13Input2.txt";

    public static void main(String[] args) throws Exception{
        doPartOne();
        doPartTwo();
    }

    private static void doPartOne() throws FileNotFoundException {
        System.out.println("Starting Part One");

        IntcodeComputer computer = new IntcodeComputer(new Scanner(new FileReader(inputFilePart1)).nextLine());
        computer.runProgram();

        Map<Position, Tile> board = new HashMap<>();
        addTilesToBoard(computer.getOutputs(), board, null);

        System.out.println("num of blocks : " +  board.values().stream().filter(x -> x == Tile.BLOCK).count());
    }

    private static void doPartTwo() throws FileNotFoundException {
        System.out.println("Starting Part Two");

        IntcodeComputer computer = new IntcodeComputer(new Scanner(new FileReader(inputFilePart2)).nextLine());
        ScoreBoard scoreBoard = new ScoreBoard();
        Map<Position, Tile> board = new HashMap<>();

        boolean notDone = true;
        while(notDone) {
            String exitCode = computer.runProgram();
            addTilesToBoard(computer.getOutputs(), board, scoreBoard);

            boolean blocksAllBroken = board.values().stream().noneMatch(x -> x == Tile.BLOCK);
            boolean systemExit = exitCode.equals("EXITED");

            System.out.println("Final Score After All blocks Are Broken 1: " + scoreBoard.getScore());

            if(systemExit && !blocksAllBroken) {
                throw new RuntimeException("EXITED BUT NOT BROKEN");
            }
            else if (blocksAllBroken) {
                notDone = false;
            }
            else {
                computer.addInput(findInputForComputer(board));
            }
        }

        System.out.println("Final Score After All blocks Are Broken 2: " + scoreBoard.getScore());
    }

    private static long findInputForComputer(Map<Position, Tile> board) {
        long paddleXPosition = board.entrySet().stream().filter(positionTileEntry -> positionTileEntry.getValue() == Tile.HORIZONTAL_PADDLE).map(entry -> entry.getKey().x).findFirst().get();
        long ballXPosition = board.entrySet().stream().filter(positionTileEntry -> positionTileEntry.getValue() == Tile.BALL).map(entry -> entry.getKey().x).findFirst().get();

        if(paddleXPosition < ballXPosition) {
            return 1;
        }
        else if (paddleXPosition > ballXPosition){
            return -1;
        }
        else {
            return 0;
        }
    }


    public static void addTilesToBoard(Queue<Long> tiles, Map<Position, Tile> board, ScoreBoard scoreBoard) {
        while(tiles.size() > 0) {
            Position position = new Position(tiles.remove(), tiles.remove());
            if(position.x != -1) {
                Tile tile = Tile.getFromId(tiles.remove());
                board.put(position, tile);
            } else {
                scoreBoard.setScore(tiles.remove());
            }
        }
    }

    public static class ScoreBoard{
        long score = 0;
        public void setScore(long score) {
            this.score = score;
        }

        public long getScore() {
            return score;
        }
    }

    public enum Tile{
        EMPTY(0),
        WALL(1),
        BLOCK(2),
        HORIZONTAL_PADDLE(3),
        BALL(4);

        private long id;
        Tile(long id) {
            this.id = id;
        }

        public static Tile getFromId(long idToGet){
            return Arrays.stream(Tile.values()).filter(x -> x.id == idToGet).findFirst().get();
        }
    }

    public static class Position {
        long x;
        long y;

        Position(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            Position other = (Position) obj;
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public int hashCode() {
            return Math.toIntExact(x + y);
        }

        public String toString(){
            return "(" + x + "," + y + ")";
        }
    }
}