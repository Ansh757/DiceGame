/* Program by Ansh
 * Mr. Bains
 * Due Date: June 23, 2020
 * Program Description: This Programs is combination of Die class and GUI where the computer rolls the Dies by itself
 * and outputs the identical values on all dies and the tries it to get to that point. Next, this program plays a game with user and Computer
 * playing against each other where they both roll dies and depending on the values they get rewarded points but also lose 10 points for each roll
 */

/*
 * Importing all the packages 
 */
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// class Name extending JFrame
class MyFrame extends JFrame {
/**
 * Defining all the Global Variables here
 */
	//Global Variable JFrame for GUI
	Container f; 
// Global Variables for the Dice Game
	 static int pPoints = 100;
	 static int cpuPoints = 100;
// Global Variable for Looping
	 int loop;
// Global Variable for Score	 
	static int winc = 0;
	static int winp = 0;
	

	public static boolean isAllEqual(int[] a){  //Boolean method for checking the values if all equal
        for(int i=1; i<a.length; i++){ 
            if(a[0] != a[i]){ //Check if value i isn't equal to value 0 then returns false
                return false; 
            }
        }

        return true; // returns true if all values equal
    } // isAllEqual

public static void DieObject() { // Method called DieObject()
     //Local Variable    
        int count = 0;
        boolean identical = false; // variable called identical which is set to false
        Die[] dice = new Die[6]; // Array called dice using Die Class creating of 6 die methods 
        int[] values = new int[6]; //Array called values creating of 6 values method
        while(!identical){
            
            for(int i = 0; i < 6; i++) //Runs 6 times 
            {
            	dice[i] = new Die(); // New Object 
                dice[i].dieRoll(); // Object is rolled
                values[i] = dice[i].getValue(); //values from the dice[i] stored into values[i]
            }
            
            if(isAllEqual(values)) // If all the values are equal it stops the loop
                identical = true; 
            count++; // increments up by 1
        }
// Prints this        
        JOptionPane.showMessageDialog(null,
                    "The Value for Dice 1 is: " + values[0] + "\n" + ("The Value for Dice 2 is: " + values[0]) + "\n"
                            + ("The Value for Dice 3 is: " + values[0]) + "\n" + ("The Value for Dice 4 is: " + values[0])
                            + "\n" + ("The Value for Dice 5 is: " + values[0]) + "\n"
                            + ("The Value for Dice 6 is: " + values[0]));
        
        JOptionPane.showMessageDialog(null, count + " are the number of tries it took to get Identical Numbers");
    } //DieObject ends here  
/*
 * Method Called UserVsCpu
 */
	public static void UserVsCpu() throws IOException { //Method called UserVsCpu throws IOException
		//Local Variables
		String answer;		
		int cpuValue = 0, p1Value = 0, cpu2Value = 0, p1Value2 = 0;
//Making these variables from Die Class
		Die p2 = new Die();
		Die p1 = new Die();
		Die cpu = new Die();
		Die cpu2 = new Die();
// Variable type String, Name to get the user's/ Players Name 
		String Name = JOptionPane.showInputDialog(null, "Enter Name", JOptionPane.QUESTION_MESSAGE);
//Prints this
		JOptionPane.showMessageDialog(null, Name + " is going to be play against Computer", Name,
				JOptionPane.ERROR_MESSAGE);
		answer = JOptionPane.showInputDialog(null, "Enter 'yes' to play the game ", JOptionPane.QUESTION_MESSAGE);
// while the answer equals to yes then it will run everything here	
		while (answer.equalsIgnoreCase("yes")) {
// rolling the dies
			p1.dieRoll();
			p2.dieRoll();
			cpu.dieRoll();
			cpu2.dieRoll();
//Storing these values into new variables
			cpuValue = cpu.getValue();
			cpu2Value = cpu2.getValue();
			p1Value2 = p2.getValue();
			p1Value = p1.getValue();
//Prints this
			JOptionPane.showMessageDialog(null, Name + " rolled: " + p1Value + " on the First Try" + "\n"
					+ (Name + " rolled: " + p1Value2 + " on Second Try"));

			JOptionPane.showMessageDialog(null,  " Computer rolled: " + cpuValue +  " on the First Try" + "\n"
					+ ("Computer rolled: " + cpu2Value + " on Second Try"));
/*
 * HashMap is a Map based collection class that is used for storing Key & value pairs
 * Hash map is used to map out the values and its corresponding points					
 */	
			HashMap<Integer, Integer> map = new HashMap<>(); 
			//HashMap<key point(p1Value + p2Value), storing value (corresponded number to the total2 points> 
			map.put(2, 0);
			map.put(3, 2);
			map.put(4, 3);
			map.put(5, 5);
			map.put(6, 7);
			map.put(7, 10);
			map.put(8, 11);
			map.put(9, 13);
			map.put(10, 15);
			map.put(11, 17);
			map.put(12, 20);
// Every turn pPoints are decreased by 20 then added according to the HashMap to its
			pPoints = pPoints - 20;
			pPoints += map.get(p1Value + p1Value2);
 //Prints this
 		JOptionPane.showMessageDialog(null,   "Total Points after this turn for " + Name + " are: " + pPoints);
/*
 *  HashMap is a Map based collection class that is used for storing Key & value pairs
 *  Hash map is used to map out the values and its corresponding points		
 */
 			HashMap<Integer, Integer> map2 = new HashMap<>();
 			//HashMap<key point(cpuValue + cpu2Value), storing value (corresponded number to the total2 points> 
 			map2.put(2, 0);
 			map2.put(3, 2);
			map2.put(4, 3);
			map2.put(5, 5);
			map2.put(6, 7);
			map2.put(7, 10);
			map2.put(8, 11);
			map2.put(9, 13);
			map2.put(10, 15);
			map2.put(11, 17);
			map2.put(12, 20);
// Every turn cpuPoints are decreased by 20 then added according to the HashMap 
			cpuPoints = cpuPoints - 20;
			cpuPoints += map2.get(cpuValue + cpu2Value);
			JOptionPane.showMessageDialog(null,    "Total Points after this turn for Computer are: " + cpuPoints);
// Player's Point below 0 or equal to 0 run this and then breaks the program
			if (pPoints <= 0) {
				JOptionPane.showMessageDialog(null, Name + " lost!", null, JOptionPane.ERROR_MESSAGE);
				winc++;				
				break;
			}
// CPU's Point below 0 or equal to 0  run this then breaks the program
			else if (cpuPoints <= 0) {
				JOptionPane.showMessageDialog(null, "Computer lost! ", null, JOptionPane.ERROR_MESSAGE);
				winp++;
				break;
			}
// Asks if you want to roll again
			JOptionPane.showInternalMessageDialog(null, "Next Turn!");
			answer = JOptionPane.showInputDialog(null, "Enter 'Yes' to continue  ", JOptionPane.CENTER_ALIGNMENT);
		}
		Loop();
	} // ends the UserVsCpu
/*
 * Loop Method used for looping the UserVsCpu method	
 */
	public static void Loop() throws IOException { // method called Loop throws IOException
		// Tells the Score
		JOptionPane.showMessageDialog(null, "Score is " + winp + " - " + winc);
		int loop =  JOptionPane.showConfirmDialog(null, "Start All Over Again?", "Loop", JOptionPane.YES_NO_OPTION);
		// if loop = yes then initialize the points then runs UserVsCpu(); 
		  if (loop == JOptionPane.YES_OPTION) {
			  //YES       
			  pPoints =100;
			  cpuPoints = 100 ;
			  UserVsCpu();     
		  }	
		  // else run this for No or Cancel
		  else {
		  System.exit(0);
		  }
	}// Loop(); ends here
/*
 * Overall GUI design method includes, panel, buttons with ActionListeners, image
 */
	public MyFrame() { //method called MyFrame(); for GUI design

		JPanel panel = new JPanel(); //JPanel
		f = this.getContentPane();
		f.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
// Creating Button while clicking the button it will run UserVsCpu
		JButton Game = new JButton(new AbstractAction("Dice Game") { 		
			public void actionPerformed(java.awt.event.ActionEvent ev) {
				try {
					pPoints =100;
					 cpuPoints = 100 ;
					UserVsCpu();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		//customizing the GAME button
		Game.setBounds(222, 101, 192, 31);
		Game.setBackground(new Color(255, 0, 0));
		Game.setForeground(Color.white);
		Game.setFont(new Font("Serif", Font.BOLD, 16));
		panel.add(Game);
		Game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
// Creating a Button called SameNumbers when clicked DieObject(); will run
		JButton sameNumbers = new JButton(new AbstractAction("Identical Die Numbers") {
			public void actionPerformed(java.awt.event.ActionEvent ev) {
				DieObject();
			}
		});
// customizing the Equal Numbers Button
		sameNumbers.setBounds(20, 101, 192, 31);
		sameNumbers.setBackground(new Color(255, 0, 0));
		sameNumbers.getToolkit();
		sameNumbers.setForeground(Color.white);
		sameNumbers.setFont(new Font("Serif", Font.BOLD, 16));
		panel.add(sameNumbers);
// Creating a panel
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		lblNewLabel.setBounds(0, 0, 434, 408);
		Image img = new ImageIcon(this.getClass().getResource("istockphoto-820136340-612x612.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));		
	}  
	public static void main(String[] arg) throws IOException { //Main Method Making the JFrmae and its component
		MyFrame f = new MyFrame(); 
		f.setVisible(true);
		f.setSize(450, 450);
		f.setLocation(500, 250);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}