import java.util.Stack;




		
		


		/*
		 * To change this license header, choose License Headers in Project Properties.
		 * To change this template file, choose Tools | Templates
		 * and open the template in the editor.
		 */

		/**
		 *
		 * @author John
		 */
		public class Maze{
 

		    public boolean[][] maze;
		    
		    public static final String ANSI_RESET = "\u001B[0m";
		    public static final String ANSI_GREEN = "\u001B[32m";
		    public static final String ANSI_CYAN = "\u001B[36m";
		    final static int START_I = 0, START_J = 0; 
		    final static int END_I = 21, END_J = 70; 
		    final static char X='#';
		    final static char V='.';
		    final static char C=' ';

		    
		    
		    
		    public Maze(int rows, int cols)
		    {
		        maze = new boolean[rows][cols];
		        for(int i=0; i<maze.length; i++)
		            for(int j=0; j<maze[0].length; j++)
		                maze[i][j] = true;
		    }
		    
		    public void drawMaze()
		    {
		        for(int i=0; i<maze.length; i++)
		        {
		            for(int j=0; j<maze[0].length; j++)
		                System.out.print( maze[i][j] ? "#" : ANSI_GREEN + "." + ANSI_RESET );
		            
		            System.out.println();
		        }
		    }
		   
		}


