/**
 * Determine whether there is a path to the treasure in the Maze from the starting position of the explorer or there is no solution
 */


public class MazeSolver {

	public Maze toSolve;
	private int[] directions = new int[]{ Maze.EAST, Maze.SOUTH, Maze.WEST, Maze.NORTH, };

	public MazeSolver(Maze maze) {
		toSolve = maze;
	}

	public boolean solve() {


		if (toSolve.explorerIsOnA() == 0) {
//			System.out.println("true");
//			System.out.println(toSolve);
			return true;
		}
		else if (toSolve.explorerIsOnA() == 1) {
//			System.out.println(" fail. on wall");
//			System.out.println(toSolve);
		}
		else {
//			System.out.println("recursion");
			for (int i = 0; i < 4; i++){
				Maze snapshot = new Maze(toSolve);
				toSolve.dropA( Maze.WALL);
//				System.out.println( toSolve);
				toSolve.go( directions[i]);
				if ( solve() )
					return true;
				toSolve = snapshot;
			}
		}
//		System.out.println(" fail no solution");
		return false;
	}
}
