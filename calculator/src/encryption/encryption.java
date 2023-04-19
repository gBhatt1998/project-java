package encryption;
import java.util.*;
public class encryption {
	
	private Scanner scanner;
	private Random random;
	private ArrayList<Character> list;
	private  ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letter;
	private char[] sectreLetter;

	
	encryption(){
	 scanner= new Scanner(System.in);
		 random= new Random();
	 list=new ArrayList<>();
	 shuffledList=new ArrayList<>();
		character=' ';
		newKey();
		askQuestion();
	}
	
  private void askQuestion() {
	  while(true) {
		  System.out.println("******************");
		  System.out.println("What do you want ?");
		  System.out.println("(N)ewkey,(G)etkey,(E)ncrypt,(D)ecrypt,(Q)uit");
		  char response=Character.toUpperCase(scanner.nextLine().charAt(0));
		  switch(response) {
		  case 'N':
			  newKey();
			  break;
		  case 'G':
			  getKey();
			  break;
		  case 'E':
			  encrypt();
			  break;
		  case 'D':
			  decrypt();
			  break;	
		  case 'Q':
			  quit();
			  break;
			  default:
				  System.out.println("not a valid answer");
		  }
	  }
  }
  
  private void newKey() {
	  character=' ';
	  list.clear();
	  shuffledList.clear();
	  
	  for(int i=32;i<127;i++) {
		  list.add(Character.valueOf(character));
		  character++;
	  }
	  
	  shuffledList=new ArrayList(list);
	  Collections.shuffle(shuffledList);
	  System.out.println("a new key has been generated");
	  
  }
  
  private void getKey() {
	  
	  System.out.println("Key");
	  
	  for(char x: list) {
		  System.out.print(x);
	  }
	  
	  System.out.println();
	  for(char x: shuffledList) {
		  System.out.print(x);
	  }
  }
  
  private void encrypt() {
	  System.out.println("Enter the message");
	  String message=scanner.nextLine();
	  letter=message.toCharArray();
	  
	  for(int i=0;i<letter.length;i++) {
		  for(int j=0;j<list.size();j++) {
			  if(letter[i]==list.get(j)) {
				  letter[i]=shuffledList.get(j);
				  break;
			  }
		  }
	  }
	  
	  System.out.println("Encrypted message to encrypt");
	  for(char x:letter) {
		  System.out.print(x);
	  }
	  
	  System.out.println();
	  
  }
  
  private void decrypt() {
	  System.out.println("Enter the message to decrypt");
	  String message=scanner.nextLine();
	  letter=message.toCharArray();
	  
	  for(int i=0;i<letter.length;i++) {
		  for(int j=0;j<shuffledList.size();j++) {
			  if(letter[i]==shuffledList.get(j)) {
				  letter[i]=list.get(j);
				  break;
			  }
		  }
	  }
	  
	  System.out.println("Dencrypted message");
	  for(char x:letter) {
		  System.out.print(x);
	  }
	  
	  System.out.println();
  }
  
  private void quit() {
	  System.out.println("good day");
	  System.exit(0);
	  
  }
}
