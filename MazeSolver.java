/**
Determine whether there is a path to the treasure in the Maze from the starting position of the explorer or there is no solution 
*/


public class MazeSolver {

     public Maze toSolve;
      
     public MazeSolver(Maze maze){
	 toSolve = maze;
     }
    
     public boolean solve(){

         Maze snapshot = new Maze( toSolve);

		 if (toSolve.explorerIsOnA() == 0){
		     
		 System.out.println("true              ");
            System.out.println( toSolve);            
		    return true;
		 }
		 else if (toSolve.explorerIsOnA() == 1){
		     
		    System.out.println("backtrack");
            System.out.println( toSolve); 

            toSolve = snapshot;
		 }
		 else {
		    System.out.println("recursion");

            toSolve.dropA( Maze.WALL);
            toSolve.go( toSolve.EAST);       
            revertTest( snapshot); 

            System.out.println( toSolve.toString());

            //recursion
            solve(); 
    	 }
         return false;
     }

     private void revertTest( Maze snapshot){
        int element = toSolve.explorerIsOnA();
        if (element == 1){
           toSolve = snapshot; 
        }
     }

}
