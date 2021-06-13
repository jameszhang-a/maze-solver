import java.util.ArrayList;

/*
 * TA's code
 * This class represents a cell in the maze.
 * 
 */
public class Cell {

	public boolean path = false;
	public int xCoord;
	public int yCoord;
	public int mDist = 0;
	public ArrayList<Cell> neighbors;
	public double g; // for A* search
	public double f; // for A* search
	public Cell parent; // for backtracking
	public boolean visited = false;


	public Cell(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	public ArrayList<Cell> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<Cell> neighbors) {
		this.neighbors = neighbors;
	}

}
