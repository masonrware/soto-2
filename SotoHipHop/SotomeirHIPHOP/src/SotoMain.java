import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class SotoMain {
	
	//test for git 


	JFrame window;
	Container con;
	JPanel titleNamePanel, subTitlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, menuButtonPanel1, menuButtonPanel, playerPanel, menuTextPanel, JournalSelectPanel, titlePanel, SusListPanel;
	JLabel titleNameLabel, subTitleLabel;
	Font titleFont = new Font("Times New Roman", Font.BOLD, 120), normalFont = new Font("Times New Roman", Font.PLAIN, 90), subTitleFont = new Font("Times New Roman", Font.ITALIC, 30), menuFont = new Font("Times New Roman", Font.PLAIN, 20), menuButtonFont = new Font("Times New Roman", Font.PLAIN, 150),  LabelFont = new Font("Times New Roman", Font.BOLD, 20);
	JTextArea mainTextArea, menuTextArea,journalTextAreaTitle, journalTextAreaNote, errorTextArea, noteTextArea,journalTextAreaTitleLabel, journalTextAreaNoteLabel, fieldLabel,fieldTitleLabel;
	JButton startButton, menuButton, choice1, choice2, choice3, choice4, menuExitButton, Journal, SusList, newJournal, editJournal, titleButton, backButton, noteTextButton;
	String position;
	JTextField field, fieldTitle, noteTextField;
	int Jcount = 0, Ecount = 0, JScount = 0, Mcount = 0, Acount = 0;
	HashMap<String, String> journal = new HashMap<>();
	ArrayList<String> passengers = new ArrayList<String>(){
		{
		add("pass1");
		add("pass2");
		add("pass3");
		}
	};
	ArrayList<String> suspects = new ArrayList<String>();

	ImageIcon logo = new ImageIcon();
	String selectedKey;

	public static void main(String[] args) {
		new SotoMain();
	}

	public SotoMain() {
		TitleScreenHandler tsHandler = new TitleScreenHandler();
		
		
		window = new JFrame();
        window.setSize(1920, 1080);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.blue);
        window.setLayout(null);
        window.setIconImage(logo.getImage());
        con = window.getContentPane();
        
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(0, 100, 1500, 200);
        titleNamePanel.setBackground(Color.blue);
        
        titleNameLabel = new JLabel("SOTOMEIR: HIP-HOP");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);  
         
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(550, 600, 400, 120); //600
        startButtonPanel.setBackground(Color.blue);
         
        startButton = new JButton("START");
        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);
        
        subTitlePanel = new JPanel();
        subTitlePanel.setBounds(450, 320, 650, 100);
        subTitlePanel.setBackground(Color.blue);
        
        subTitleLabel = new JLabel("A Text-Based RPG by Mason Ware");
        subTitleLabel.setForeground(Color.white);
        subTitleLabel.setFont(subTitleFont);
        
        
        subTitlePanel.add(subTitleLabel);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
         
        
        con.add(subTitlePanel);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
         
        
        window.setVisible(true);
	}
	
	
	public void createGameScreen() {
		MenuHandler menuHandler = new MenuHandler();
		ChoiceHandler choiceHandler = new ChoiceHandler();
		
		titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        subTitlePanel.setVisible(false);
        
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 800, 450);
        mainTextPanel.setBackground(Color.black);
           
       
        mainTextArea = new JTextArea("This is the main text are."
            + "This game is going to be great. I'm sure of it!!!!!!!");
        mainTextArea.setBounds(100, 100, 600, 1080); 
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true); 
        mainTextArea.setEditable(false);    
        mainTextPanel.add(mainTextArea);
        con.add(mainTextPanel);  
        
        
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(920, 100, 500, 350);
        choiceButtonPanel.setBackground(Color.yellow);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler); 
        choice1.setActionCommand("c1"); 
        choiceButtonPanel.add(choice1);
        
        choice2 = new JButton("Choice 2"); 
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        
        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        
        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);
        
        menuButtonPanel1 = new JPanel();
        menuButtonPanel1.setBounds(0, 0, 100, 40);
        menuButtonPanel1.setBackground(Color.black);
        con.add(menuButtonPanel1);   
        
         
        menuButton = new JButton("MENU");
        menuButton.setBackground(Color.green);
        menuButton.setForeground(Color.white);
        menuButton.setFont(menuFont);
        menuButton.addActionListener(menuHandler);
        menuButton.setFocusPainted(false);
        menuButtonPanel1.add(menuButton);
        
        
        playerSetup();
	}
	
	
	public void playerSetup(){
		controller();
    }
	
	
	public void createMenuScreen() {
		EscapeHandler escapeHandler = new EscapeHandler();
		JournalSelectHandler journalSelectHandler = new JournalSelectHandler();
		SusListSelectHandler SusListSelectHandler = new SusListSelectHandler();
	
        choiceButtonPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        menuButton.setVisible(false);
        
        Mcount ++;
        
        if(Jcount>0) {
        	journalTextAreaNoteLabel.setVisible(false);
        	journalTextAreaTitleLabel.setVisible(false);
        	fieldLabel.setVisible(false);
        	fieldTitleLabel.setVisible(false);
        	journalTextAreaTitle.setVisible(false); 
        	journalTextAreaNote.setVisible(false);
        	field.setVisible(false);
        	fieldTitle.setVisible(false);
        	Jcount = 0;
        }
        
        if(Ecount > 0 && journal.isEmpty()) {
        	errorTextArea.setVisible(false);
        	Ecount = 0;
        }
//        if(JScount > 1) {
//        	backButton.setVisible(false);
//        	JScount = 0;
//        }
        if(Acount > 0) {
        	SusListPanel.setVisible(false);
        	Acount = 0;
        }
        
        // menuButtonPanel = new JPanel();
        // menuButtonPanel.setBounds(100, 100, 1500, 1080);
        // menuButtonPanel.setBackground(Color.yellow);
        // menuButtonPanel.setLayout(new GridLayout(6,1));
        
        menuExitButton = new JButton("EXIT");
        menuExitButton.setBackground(Color.black);
        menuExitButton.setForeground(Color.white);
        menuExitButton.setFont(menuFont);
		menuExitButton.addActionListener(escapeHandler);
        menuExitButton.setFocusPainted(false);
        menuButtonPanel1.add(menuExitButton);
        
        menuButtonPanel = new JPanel();
        menuButtonPanel.setBounds(100, 100, 800, 1080);
        menuButtonPanel.setBackground(Color.yellow);
        menuButtonPanel.setLayout(new GridLayout(5,1));
        
        Journal = new JButton("JOURNAL");
        Journal.setBackground(Color.black);
        Journal.setForeground(Color.white);
        Journal.setFont(menuButtonFont);
        Journal.addActionListener(journalSelectHandler);
        Journal.setFocusPainted(false);
	    menuButtonPanel.add(Journal);
        
	    SusList = new JButton("SUSPECT LIST");
        SusList.setBackground(Color.black);
        SusList.setForeground(Color.white);
        SusList.setFont(menuButtonFont);
        SusList.addActionListener(SusListSelectHandler);
        SusList.setFocusPainted(false);
	    menuButtonPanel.add(SusList);
	    
	    //add new menu items here
	    
        con.add(menuButtonPanel);
	}
	



	
	
	
	//-------------------------------------------------------Journal Methods----------------------------------------------------------------------//
	
	
	public void JournalSelection() {
		NewJournalHandler newJournalHandler = new NewJournalHandler();
		EditJournalHandler editJournalHandler = new EditJournalHandler();
		BackOutHandler backOut = new BackOutHandler();

		JScount++;
		
		choiceButtonPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        menuButtonPanel.setVisible(false);
        menuButtonPanel1.remove(menuExitButton);
		
		
		backButton = new JButton("BACK");
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.white);
		backButton.setFont(menuFont);
		backButton.setFocusPainted(false);
		backButton.addActionListener(backOut); 
	    menuButtonPanel1.add(backButton);
		
		
		
        
        
        if(Jcount>0) {
        	journalTextAreaNoteLabel.setVisible(false);
        	journalTextAreaTitleLabel.setVisible(false);
        	fieldLabel.setVisible(false);
        	fieldTitleLabel.setVisible(false);
        	journalTextAreaTitle.setVisible(false);
        	journalTextAreaNote.setVisible(false);
        	field.setVisible(false);
        	fieldTitle.setVisible(false);
        	Jcount = 0;
        }
        if(Ecount > 0 && journal.isEmpty()) {
        	errorTextArea.setVisible(false);
        	Ecount = 0;
        }
        
        JournalSelectPanel = new JPanel();
        JournalSelectPanel.setBounds(100, 100, 800, 500);
        JournalSelectPanel.setBackground(Color.yellow);
        JournalSelectPanel.setLayout(new GridLayout(2,1));
	    
        newJournal = new JButton("NEW JOURNAL NOTE");
        newJournal.setBackground(Color.black);
        newJournal.setForeground(Color.white);
        newJournal.setFont(menuFont);
        newJournal.addActionListener(newJournalHandler);
        newJournal.setFocusPainted(false);
	    JournalSelectPanel.add(newJournal);
        
	    editJournal = new JButton("EDIT JOURNAL NOTES");
	    editJournal.setBackground(Color.black);
	    editJournal.setForeground(Color.white);
	    editJournal.setFont(menuFont);
	    editJournal.addActionListener(editJournalHandler);
	    editJournal.setFocusPainted(false);
	    JournalSelectPanel.add(editJournal);			
        
        con.add(JournalSelectPanel);
	}
	
	
	
	
	public void editJournalScreen() {
		EditJournalNote editTextHandler = new EditJournalNote();
		NoteDisplay noteDisplay = new NoteDisplay();
		
		int keySetLength = journal.keySet().size();
		
		Ecount++;	
		
		choiceButtonPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        menuButtonPanel.setVisible(false);
		JournalSelectPanel.setVisible(false);
		
		
		if(journal.isEmpty()) {
			errorTextArea = new JTextArea ("NO ENTRIES TO EDIT");
			errorTextArea.setBounds(100, 100, 800, 1080); 
			errorTextArea.setBackground(Color.black);
			errorTextArea.setForeground(Color.white);
			errorTextArea.setFont(normalFont);
			errorTextArea.setLineWrap(true);
			errorTextArea.setWrapStyleWord(true); 
			errorTextArea.setEditable(false);  
	        con.add(errorTextArea);
		}
		else {
			titlePanel = new JPanel();
			titlePanel.setBounds(100, 100, 200, 600); 
			titlePanel.setBackground(Color.red);
	        JournalSelectPanel.setLayout(new GridLayout(keySetLength,1)); 
			
	        
	        
	        for(String title : journal.keySet()) {
	        	titleButton = new JButton(title);
	        	titleButton.setBackground(Color.black);
	        	titleButton.setForeground(Color.white);
	        	titleButton.setFont(menuFont);
	        	titleButton.addActionListener(noteDisplay);
	        	titleButton.setFocusPainted(false);
	     	    titlePanel.add(titleButton);
	     	    selectedKey = title;
	        }
			
	        noteTextArea = new JTextArea("Note TExt here");
	        noteTextArea.setBounds(400, 100, 800, 1080); 
	        noteTextArea.setBackground(Color.black);
	        noteTextArea.setForeground(Color.white);
	        noteTextArea.setFont(menuFont);
	        noteTextArea.setLineWrap(true);
	        noteTextArea.setWrapStyleWord(true); 
	        noteTextArea.setEditable(false); 
	        
	        
			noteTextField = new JTextField(20);
			noteTextField.setBounds(1500, 100, 300, 100);
			noteTextField.setBackground(Color.WHITE);
			noteTextField.setFont(menuFont);
			noteTextField.addActionListener(editTextHandler);		//change from this to class object that handles text from the editor and alters the corresponding hashed value, updating the note
			
			con.add(noteTextField);
			con.add(titlePanel);
			con.add(noteTextArea);  
		}
	}
	
	
	
	public void createJournalScreen() {
		TextHandler textHandler = new TextHandler();
		Jcount++;
		
		choiceButtonPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        menuButtonPanel.setVisible(false);
		JournalSelectPanel.setVisible(false);
        
		journalTextAreaTitleLabel = new JTextArea("TITLE:");
		journalTextAreaTitleLabel.setBounds(100, 80, 300, 20); 
		journalTextAreaTitleLabel.setBackground(Color.blue);
		journalTextAreaTitleLabel.setForeground(Color.white);
		journalTextAreaTitleLabel.setFont(LabelFont);
		journalTextAreaTitleLabel.setLineWrap(true);
		journalTextAreaTitleLabel.setWrapStyleWord(true); 
		journalTextAreaTitleLabel.setEditable(false); 
		
		journalTextAreaTitle = new JTextArea();
        journalTextAreaTitle.setBounds(100, 100, 300, 20); 
        journalTextAreaTitle.setBackground(Color.red);
        journalTextAreaTitle.setForeground(Color.white);
        journalTextAreaTitle.setFont(menuFont);
        journalTextAreaTitle.setLineWrap(true);
        journalTextAreaTitle.setWrapStyleWord(true); 
        journalTextAreaTitle.setEditable(false); 
        
        journalTextAreaNoteLabel = new JTextArea("NOTE:");
        journalTextAreaNoteLabel.setBounds(500, 80, 300, 20); 
        journalTextAreaNoteLabel.setBackground(Color.blue);
        journalTextAreaNoteLabel.setForeground(Color.white);
        journalTextAreaNoteLabel.setFont(LabelFont);
        journalTextAreaNoteLabel.setLineWrap(true);
        journalTextAreaNoteLabel.setWrapStyleWord(true); 
        journalTextAreaNoteLabel.setEditable(false); 
		
		
        journalTextAreaNote = new JTextArea();
        journalTextAreaNote.setBounds(500, 100, 600, 550); 
        journalTextAreaNote.setBackground(Color.black);
        journalTextAreaNote.setForeground(Color.white);
        journalTextAreaNote.setFont(menuFont);
        journalTextAreaNote.setLineWrap(true);
        journalTextAreaNote.setWrapStyleWord(true); 
        journalTextAreaNote.setEditable(false); 
        

        fieldLabel = new JTextArea("ENTER NOTE:");
        fieldLabel.setBounds(100, 650, 300, 20); 
        fieldLabel.setBackground(Color.blue);
        fieldLabel.setForeground(Color.white);
        fieldLabel.setFont(LabelFont);
        fieldLabel.setLineWrap(true);
        fieldLabel.setWrapStyleWord(true); 
        fieldLabel.setEditable(false); 
        
		field = new JTextField(10);
		field.setBounds(100, 670, 800, 30);
        field.setBackground(Color.WHITE);
        field.setFont(menuFont);
        field.addActionListener(textHandler);

        fieldTitleLabel = new JTextArea("ENTER TITLE:");
        fieldTitleLabel.setBounds(100, 600, 300, 20); 
        fieldTitleLabel.setBackground(Color.blue);
        fieldTitleLabel.setForeground(Color.white);
        fieldTitleLabel.setFont(LabelFont);
        fieldTitleLabel.setLineWrap(true);
        fieldTitleLabel.setWrapStyleWord(true); 
        fieldTitleLabel.setEditable(false); 
        
        
        fieldTitle = new JTextField(10);
        fieldTitle.setBounds(100, 620, 800, 30);
		fieldTitle.setBackground(Color.WHITE);
		fieldTitle.setFont(menuFont);
		fieldTitle.addActionListener(textHandler);
        
		con.add(fieldTitleLabel);
		con.add(fieldLabel);
		con.add(journalTextAreaNoteLabel);
		con.add(journalTextAreaTitleLabel);
        con.add(journalTextAreaTitle);
        con.add(journalTextAreaNote);
        con.add(field);
        con.add(fieldTitle);
	}
	
	
	
	
	//-------------------------------------------------------SUS LIST Methods-------------------------------------------------------------------//
	
	
	public void SuspectList() {
		BackOutHandler backOut = new BackOutHandler();
		copySusListHandler copySusListHandler = new copySusListHandler();
		
		
		choiceButtonPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        menuButtonPanel.setVisible(false);
        menuButtonPanel1.remove(menuExitButton);
		
		
		backButton = new JButton("BACK");
		backButton.setBackground(Color.black);
		backButton.setForeground(Color.white);
		backButton.setFont(menuFont);
		backButton.setFocusPainted(false);
		backButton.addActionListener(backOut); 
	    menuButtonPanel1.add(backButton);
		
		
		
        
        
        if(Jcount>0) {
        	journalTextAreaNoteLabel.setVisible(false);
        	journalTextAreaTitleLabel.setVisible(false);
        	fieldLabel.setVisible(false);
        	fieldTitleLabel.setVisible(false);
        	journalTextAreaTitle.setVisible(false);
        	journalTextAreaNote.setVisible(false);
        	field.setVisible(false);
        	fieldTitle.setVisible(false);
        	Jcount = 0;
        }
        if(Ecount > 0 && journal.isEmpty()) {
        	errorTextArea.setVisible(false);
        	Ecount = 0;
        }
        String plugStr = "Suspect List:";
       
        SusListPanel = new JPanel();
		SusListPanel.setBounds(100, 100, 800, 500);
		SusListPanel.setBackground(Color.yellow);
		
         if(suspects.size()==0) {					
        	plugStr="woahhhh now, looks like your suspect list is empty, hit the button to copy everyone's name down - no one is safe from suspicion";
        	noteTextButton = new JButton("copy list");
        	noteTextButton.setBackground(Color.black);
        	noteTextButton.setForeground(Color.white);
        	noteTextButton.setFont(menuFont);
        	noteTextButton.setFocusPainted(false);
        	noteTextButton.addActionListener(copySusListHandler);
    	    SusListPanel.add(noteTextButton);
        }else {
        	plugStr="Suspects List: \n" + suspects;
        	SusListPanel.remove(noteTextButton);
        }
         
        noteTextArea = new JTextArea(plugStr);
        noteTextArea.setBounds(400, 100, 700, 600); 
        noteTextArea.setBackground(Color.black);
        noteTextArea.setForeground(Color.white);
        noteTextArea.setFont(menuFont);
        noteTextArea.setLineWrap(true);
        noteTextArea.setWrapStyleWord(true); 
        noteTextArea.setEditable(false); 
        SusListPanel.add(noteTextArea);
       
        
       
        
        Acount++;
        
        con.add(SusListPanel);
	}

	public void copySusList(){
		for(int i =0; i<passengers.size(); i++){
			suspects.add(passengers.get(i));
		}
	}
	
	
	//-------------------------------------------------------Story Methods----------------------------------------------------------------------//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public void controller() {
		position = "controller";
		
		
		//heres where I can initialize any game variables like P.O.P., CAR LABEL
		
		panel1();		
	}
			
			
	public void panel1() {
		choiceButtonPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        menuButton.setVisible(true);
        if(Mcount>0) {
        	menuButtonPanel1.remove(menuExitButton);
        	Mcount = 0;
        }
        
		position = "panel 1";
				
				
		mainTextArea.setText("Panel 1");
		choice1.setText("next");
		choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
	}
	
	public void panel2() {
		choiceButtonPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        menuButton.setVisible(true);
        
        
        position = "panel 2";
        
        mainTextArea.setText("Panel 2");
        choice1.setText("next");
		choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
        
	}
	
	public void panel3() {
		choiceButtonPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        menuButton.setVisible(true);
        
        
        position = "panel 3";
        
        mainTextArea.setText("Panel 3");
        choice1.setText("next");
		choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
        
	}
		
	
	public void panel4() {
		choiceButtonPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        menuButton.setVisible(true);
        
        
        position = "panel 4";
        
        mainTextArea.setText("Panel 4");
        choice1.setText("next");
		choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
        
	}
	
	
	public void panel5() {
		choiceButtonPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        menuButton.setVisible(true);
        
        
        position = "panel 5";
        
        mainTextArea.setText("Panel 5");
        choice1.setText("next");
		choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
        
	}
	
	
	public void panel6() {
		choiceButtonPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        menuButton.setVisible(true);
        
        
        position = "panel 6";
        
        mainTextArea.setText("Panel 6");
        choice1.setText("next");
		choice2.setText("");
	    choice3.setText("");
	    choice4.setText("");
        
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//---------------------------------------------------------Handlers (but Choice)-----------------------------------------------------------------//	

	//1. create handler for text boxes to edit the value of a key (title of note) -- reference TextHandler
	//2. work out way to confirm that a note has been added and updated
	//3. format menu and journal screens
	//4. create suspect list...
	
	public class EditJournalNote implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String edit = noteTextField.getText();
			noteTextArea.append("\n" + edit);
		}
	}
	
	
	public class BackOutHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			 if(Jcount>0) {
		        	journalTextAreaNoteLabel.setVisible(false);
		        	journalTextAreaTitleLabel.setVisible(false);
		        	fieldLabel.setVisible(false);
		        	fieldTitleLabel.setVisible(false);
		        	journalTextAreaTitle.setVisible(false);
		        	journalTextAreaNote.setVisible(false);
		        	field.setVisible(false);
		        	fieldTitle.setVisible(false);
		        	Jcount = 0;
		        }
			else if(Ecount > 0 && !journal.isEmpty()) {
				titlePanel.setVisible(false);
				noteTextArea.setVisible(false);
				noteTextField.setVisible(false);
				titlePanel.setVisible(false);
			}
			else if(JScount > 0) {
				JournalSelectPanel.setVisible(false);
			}
			else if(Ecount>0 && journal.isEmpty()) {
				errorTextArea.setVisible(false);
			}
			else if(Acount > 0) {
				noteTextArea.setVisible(false);
			}
				
			backButton.setVisible(false);
			createMenuScreen();
		}
	}
	
	
	public class NoteDisplay implements ActionListener{
		public void actionPerformed(ActionEvent event){ 
			
			String note = journal.get(titleButton.getText());
			noteTextArea.setText(note);
			selectedKey = "";
		}
	}
	
	
	public class TextHandler implements ActionListener{
		public void actionPerformed(ActionEvent event){ 
			String title = fieldTitle.getText();
			String note = field.getText();
			journal.put(title, note);
			journalTextAreaTitle.append(title);
		    journalTextAreaNote.append(note + "\n");
		    fieldTitle.selectAll();
		    field.selectAll();
		}
	}
	
	
	public class EscapeHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){ 
			menuButtonPanel.setVisible(false);
			 if(Jcount>0) {
		        	journalTextAreaNoteLabel.setVisible(false);
		        	journalTextAreaTitleLabel.setVisible(false);
		        	fieldLabel.setVisible(false);
		        	fieldTitleLabel.setVisible(false);
		        	journalTextAreaTitle.setVisible(false);
		        	journalTextAreaNote.setVisible(false);
		        	field.setVisible(false);
		        	fieldTitle.setVisible(false);
		        	Jcount = 0;
		        }
			else if(Ecount > 0 && !journal.isEmpty()) {
					titlePanel.setVisible(false);
					noteTextArea.setVisible(false);
					noteTextArea.setVisible(false);
			}
			else if(JScount > 0) {
				JournalSelectPanel.setVisible(false);
			}
			else if(Ecount>0 && journal.isEmpty()) {
				errorTextArea.setVisible(false);
			}

		    switch(position) {
		     
		     
		    case "panel 1" : panel1(); break;
		     
		    case "panel 2" : panel2(); break;
		    
		    case "panel 3" : panel3(); break;
		    
		    case "panel 4" : panel4(); break;
		    
		    case "panel 5" : panel5(); break;
		    
		    case "panel 6" : panel6(); break;
		    }
		     
		   
		 }
	}
	
	
	public class JournalSelectHandler implements ActionListener {
		public void actionPerformed(ActionEvent event){
			 JournalSelection();
		 }
	}
	
	//-------
			public class NewJournalHandler implements ActionListener{
		        
				 public void actionPerformed(ActionEvent event){
					 createJournalScreen();
				 }
			}
			
			
			public class EditJournalHandler implements ActionListener {
				public void actionPerformed(ActionEvent event){
					editJournalScreen(); 
				}
			}
	//-------
			
	public class SusListSelectHandler implements ActionListener {
		public void actionPerformed(ActionEvent event){
			 SuspectList();
		 }
	}
	
	//------
	
	public class copySusListHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			//set the previous text to false visibility and display the suspect list
			copySusList();
			
		}
	}
	
	
	
	
	public class MenuHandler implements ActionListener{
        
		 public void actionPerformed(ActionEvent event){
			 createMenuScreen();
		 }
	}
	
	
	public class TitleScreenHandler implements ActionListener{
        
	    public void actionPerformed(ActionEvent event){
	        createGameScreen();
	    }
	}


	
	
	
	
	
	
	
	
	
//-----------------------------------------------------------Choice Handling----------------------------------------------------------------//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public class ChoiceHandler implements ActionListener{
	        
	    public void actionPerformed(ActionEvent event){
	             
	        String yourChoice = event.getActionCommand();;

	        switch(position){
	            
	        case "panel 1":
	            switch(yourChoice) {
	            case "c1" :
	            	panel2(); break;											
	            }
	            break;	
	        
	        case "panel 2":
	        	switch(yourChoice) {
	        	case "c1":
	        		panel3(); break;	
	        	}
	        	break;
	        	
	        case "panel 3":
	        	switch(yourChoice) {
	        	case "c1":
	        		panel4(); break;	
	        	}
	        	break;	
	        	
	        case "panel 4":
	        	switch(yourChoice) {
	        	case "c1":
	        		panel5(); break;	
	        	}
	        	break;	
	        	
	        case "panel 5":
	        	switch(yourChoice) {
	        	case "c1":
	        		panel6(); break;	
	        	}
	        	break;	
	        	
	        case "panel 6":
	        	switch(yourChoice) {
	        	case "c1":
//	        		panel7(); break;	
	        	}
	        	break;	

	        }
	    }
	}
	
	
	
	
	
	
	
	
	

}