package encryption;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<Character> list=new ArrayList<>();
		 char character;
		 
		 character=' ';
		  list.clear();
		 
		  
		  for(int i=32;i<127;i++) {
			  list.add(Character.valueOf(character));
			  character++;
		  }
		  
		  for(int i=0;i<list.size();i++) {
			  System.out.println(list.get(i));
		  }
	
		    ArrayList<Character> shuffledList;
	}

}
