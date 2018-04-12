/**
Determine whether there is a path to the treasure in the Maze from the starting position of the explorer or there is no solution 
*/


public class MazeSolver {

     public Maze toSolve;
    
     public MazeSolver(Maze maze){
	 toSolve = maze;
     }
    
     public boolean solve(){
	 if (toSolve.explorerIsOnA() == 0){
	     
	 System.out.println("true              ");
	     return true;
	 }
	 else if (toSolve.explorerIsOnA() == 1){
	     
	 System.out.println("false         ");
	     return false;
	 }
	 else {
	     System.out.println("recursion begins");
	     
	 
	 return true;
	 }
     }

}
