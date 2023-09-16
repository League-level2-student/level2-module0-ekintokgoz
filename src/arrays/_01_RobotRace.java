package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot [] robotArray = new Robot [2];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i<robotArray.length; i++) {
			robotArray[i] = new Robot();
			robotArray[i].setSpeed(100);
			robotArray[i].setX(100+i*150);
			robotArray[i].setY(550);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		Random ran = new Random();
		boolean raceOver = false;
		int whoWon = 0;
		while(!raceOver) {
			for(int i = 0; i<robotArray.length; i++) {
				robotArray[i].move(ran.nextInt(50));
				if(robotArray[i].getY()<0) {
					raceOver = true;
					whoWon=i+1;
				}
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot " + whoWon + " won the race! Congrats");
		//8. try different races with different amounts of robots.
		//9. make the robots race around a circular track.
		
	}
}
