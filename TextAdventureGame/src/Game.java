import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import monsters.Goblin;

public class Game {

	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel;
	JLabel titleNameLabel;
	JButton startButton;
	Font titleFont = new Font("Comic Sans MS", Font.PLAIN, 90);
	Font normalFont = new Font("Comic Sans MS", Font.PLAIN, 30);
	Font statsFont = new Font("Comic Sans MS", Font.PLAIN, 20);
	
	JTextArea mainTextArea;
	JPanel choiceButtonPanel, playerPanel;
	JButton choice1, choice2,choice3, choice4;
	JLabel hpLabel, hpLabelNum, weaponLabel, weaponLabelName, coinLabel, coinLabelNum;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	
	int playerHP;
	String weapon;
	String position;
	int monsterHP;
	String positionArray[];
	int coin;
	int goblinKilled;
	
	ChoiceHandler choiceHandler = new ChoiceHandler();
	
	public static void main(String[] args) 
	{
		
		new Game();
		
		
	}

	public Game()
	{
		createTitleScreen();
		
	}
	
	//The following three methods are creating the
	//basic UI for the game
	public void createTitleScreen()
	{
		window = new JFrame();
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		con=window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100,100,600,150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("ADVENTURE");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);	

		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300,300,200,100);
		startButtonPanel.setBackground(Color.black);
		
		startButton= new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(startButtonPanel);
		con.add(titleNamePanel);
		
		window.setVisible(true);
	}
	
	public void createGameScreen()
	{
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("Start adventure");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250,350,300,150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("s1");
		choiceButtonPanel.add(choice1);
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("s2");
		choiceButtonPanel.add(choice2);
		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("s3");
		choiceButtonPanel.add(choice3);
		
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("s4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100,15,600,50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		
		con.add(playerPanel);
		
		hpLabel =new JLabel("HP: ");
		hpLabel.setFont(statsFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelNum = new JLabel();
		hpLabelNum.setFont(statsFont);
		hpLabelNum.setForeground(Color.white);
		playerPanel.add(hpLabelNum);
		
		weaponLabel = new JLabel("Weapon: ");
		weaponLabel.setFont(statsFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(statsFont);
		weaponLabelName.setForeground(Color.white);
		playerPanel.add(weaponLabelName);
		
		coinLabel =new JLabel("Coin: ");
		coinLabel.setFont(statsFont);
		coinLabel.setForeground(Color.white);
		playerPanel.add(coinLabel);
		
		coinLabelNum = new JLabel();
		coinLabelNum.setFont(statsFont);
		coinLabelNum.setForeground(Color.white);
		playerPanel.add(coinLabelNum);
		
		playerSetup();
	}
	
	public void playerSetup()
	{
		playerHP = 15;
		weapon = "Knife";
		weaponLabelName.setText(weapon);
		hpLabelNum.setText(""+playerHP);
		coinLabelNum.setText(""+coin);
		
		townGate();
		//could create a few different start positions
		//randomize a variable like a dice
	}
	
	//Class specifically for making the button
	//on the title screen work
	public class TitleScreenHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			createGameScreen();
		}
	}
	
	
	//Methods for writing the story of the game
	public void townGate()
	{
		position = "townGate";
		mainTextArea.setText("You are at the gate of the town. "
				+ "\nA guard is standing in front of you. "
				+ "\nWhat do you do?");
		
		choice1.setText("Talk to the guard");
		choice2.setText("Attack the guard");
		choice3.setText("Leave");
		choice4.setText("");
	}
	public void talkGuard()
	{
		if (goblinKilled > 0)
		{
			position = "talkGuard2";
			mainTextArea.setText("Guard: Thank you for killing that goblin, welcome to our town!"
					+"\n You may now enter the town");
			choice1.setText("Enter town");
			choice2.setText("Leave");
			choice3.setText("");
			choice4.setText("");
		}
		else
		{
			position = "talkGuard1";
			mainTextArea.setText("Guard: Hello! I have never seen your face before. "
					+ "I'm sorry, but we can't let strangers into our town");
			
			choice1.setText(">");
			choice2.setText("");
			choice3.setText("");
			choice4.setText("");
		}
	}
	public void attackGuard()
	{
		//Include armor or randomize HP damage based on a level?
		position = "attackGuard";
		mainTextArea.setText("Guard: Hey, don't be stupid!\n"
				+ "The guard fought back, you recieve 3 damage");
		playerHP -=3;
		hpLabelNum.setText(""+playerHP);
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void crossRoad()
	{
		position = "crossRoad";
		mainTextArea.setText("You are at a crossroad.\nIf you go south, you will go back to the town.");
		choice1.setText("Go north");
		choice2.setText("Go east");
		choice3.setText("Go south");
		choice4.setText("Go west");
	}
	public void north()
	{
		position = "north";
		mainTextArea.setText("There is a river. \nYou drink the water and rest at the river side.\nYour HP is recovered by 2");
		playerHP+=2;
		hpLabelNum.setText(""+playerHP);
		choice1.setText("Go south");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void east()
	{
		position = "east";
		mainTextArea.setText("You wander into some woods and find a sword");
		weapon = "Sword";
		weaponLabelName.setText(weapon);
		choice1.setText("Go west");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void south()
	{
		
	}
	public void west()
	{
		position = "west";
		mainTextArea.setText("You encounter a goblin!");
		Goblin goblin = new Goblin(2, 6);
		choice1.setText("Fight");
		choice2.setText("Run");
		choice3.setText("");
		choice4.setText("");
	}
	public void fight()
	{
		position = "fight";
		monsterHP = new java.util.Random().nextInt(21);
		mainTextArea.setText("MonsterHP: "+ monsterHP + "\nWhat do you do?");
		choice1.setText("Attack");
		choice2.setText("Run");
		choice3.setText("");
		choice4.setText("");
	}
	public void seduce()
	{
		position = "seduce";
		mainTextArea.setText("The goblin accepts your advances. \nYou now have goblin herpes");
	}
	public void playerAttack()
	{
		position = "playerAttack";
		
		if (playerHP <= 0)
		{
			playerDeath();
			return;
		}
		
		int playerDamage = 0;
		
		if (weapon.equals("Knife"))
			playerDamage = new java.util.Random().nextInt(3);
		else if(weapon.equals("Sword"))
			playerDamage = new java.util.Random().nextInt(8);
		
		monsterHP-= playerDamage;
		mainTextArea.setText("You attacked the monster and gave " + playerDamage +" damage!");
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
			
	}
	public void monsterAttack()
	{
		position = "monsterAttack";
		
		if (monsterHP <=0)
		{
			monsterDeath();
			return;
		}
		
		int monsterDamage = new java.util.Random().nextInt(4);
		
		mainTextArea.setText("The monster attacked you and gave " + monsterDamage + " damage!");
		
		playerHP -= monsterDamage;
		
		hpLabelNum.setText(""+playerHP);
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void monsterDeath()
	{
		position = "monsterDeath";
		
		mainTextArea.setText("The monster died.");
		goblinKilled++;
		
		choice1.setText("Continue on");
		choice2.setText("Loot it");
		choice3.setText("Back to cross road");
		choice4.setText("");
	}
	public void playerDeath()
	{
		position = "playerDeath";
		
		mainTextArea.setText("You died.");
		
		choice1.setText("New Game");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void loot()
	{
		position = "loot";
		
		int coinFound = new java.util.Random().nextInt(4);
		
		mainTextArea.setText("You found " + coinFound+ " coin.");
		coin+= coinFound;
		coinLabelNum.setText(""+coin);
		
		choice1.setText("Continue on");
		choice2.setText("Back to cross road");
		choice3.setText("");
		choice4.setText("");
	}
	public void town()
	{
		
	}
	
	public class ChoiceHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String playerChoice = event.getActionCommand();
			
			switch (position) 
			{
			case "townGate":
				switch (playerChoice)
				{
				case "s1": talkGuard(); break;
				case "s2": attackGuard(); break;
				case "s3": crossRoad();break;
				case "s4": break;
				}
				break;
			case "talkGuard1":
				switch (playerChoice)
				{
				case "s1": townGate(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "talkGuard2":
				switch (playerChoice)
				{
				case "s1": town(); break;
				case "s2": crossRoad();break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "attackGuard":
				switch (playerChoice)
				{
				case "s1": townGate(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "crossRoad":
				switch (playerChoice)
				{
				case "s1": north();break;
				case "s2": east();break;
				case "s3": townGate();break;
				case "s4": west();break;
				}
				break;
			case "north":
				switch (playerChoice)
				{
				case "s1": crossRoad(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "east":
				switch (playerChoice)
				{
				case "s1": crossRoad(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "west":
				switch (playerChoice)
				{
				case "s1": fight(); break;
				case "s2": crossRoad(); break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "fight":
				switch (playerChoice)
				{
				case "s1": playerAttack(); break;
				case "s2": crossRoad(); break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "playerAttack":
				switch (playerChoice)
				{
				case "s1": monsterAttack(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "monsterAttack":
				switch(playerChoice)
				{
				case "s1": fight(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "playerDeath":
				switch(playerChoice)
				{
				case "s1": createTitleScreen(); break;
				case "s2": break;
				case "s3": break;
				case "s4": break;
				}
				break;
			case "monsterDeath":
				switch(playerChoice)
				{
				case "s1": break;
				case "s2": loot();break;
				case "s3": crossRoad();break;
				case "s4": break;
				}
				break;
			case "loot":
				switch(playerChoice)
				{
				case "s1": break;
				case "s2": crossRoad();break;
				case "s3": break;
				case "s4": break;
				}
				break;
			}
		}
	}
	
}

