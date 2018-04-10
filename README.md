## personnel
Jack Lu & Elena Sapelyuk

## statement of problem

  Returns the boolean value of the statement "the maze is navigable, having a legal travel path 
  that is continuous from start point to existing treasure"

  Navigate a maze from start to finish 
  
  legal means 
	don't cross the walls

	right angle turns only

	a path cannot go through the same point twice 


## recursive abstraction

  	When I am asked to solve a maze,
  
	if the explorer is not on the treasure or the wall
  
         determine a path from that point,

	if there is no legal next point,

	return to previous point and try next legal adjacent point available.


## base case
	if explorer is on treasure
	   return true
	if explorer is on wall 
	   return false


## pseudocode

	if explorer is on treasure
	   return true //base case 1
	if explorer is on wall
	   return false //base case 2
	else //recursive case
		if there is a legal point to the north,
		   recursively abstract from that point
 		if there is a legal point to the east,
	 	   recursively abstract from that point
 		if there is a legal point to the south,
	  	   recursively abstract from that point
               	if there is a legal point to the west,
	           recursively abstract from that point
             	else return to previous point & mark current point illegal

## class(es), with fields and methods
- Holmes' Maze 
- Maze Solver
 

## version n wish list

