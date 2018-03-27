# Maze

## personnel
Jack Lu, Elena Sapelyuk

# statement of problem
  Returns the boolean value of the statement "the maze is navigable, having a legal travel path 
  that is continuous from start point to existing treasure"

  Navigate a maze from start to finish 
  
  legal means 
	don't cross the walls

	right angle turns only

	a path cannot go through the same point twice 


# recursive abstraction
  The recursive abstraction can go to the next intersection (point) in the maze

	if there is no legal next point,

	go back and try next available path from that intersection.

