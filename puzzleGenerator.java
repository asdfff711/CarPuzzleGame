
public interface puzzleGenerator {
	/**
	 * Specify the board size and exit location and the number of vehicles and generate a puzzle
	 * @param width
	 * @param height
	 * @param exitRow
	 * @param exitCol
	 * @param numVehicle, number of vehicles on the board
	 * @param moves, the number of moves required to solve the puzzle
	 * @return
	 */
	public Puzzle generatePuzzle(int width, int height, int exitRow, int exitCol, int numVehicle, int moves);
	
	/**
	 * Returns the optimal solution for solving a puzzle.
	 * @param puzzle
	 * @return
	 */
	public Collection<Puzzle> optimalSolution(Puzzle puzzle);
}
