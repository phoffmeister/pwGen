/*
A simple terminal based password generator.
Interactive only.
*/

import java.io.Console;

public class pwGen{
	public static void main(String args[]){
		int pwLength=0;
		boolean number,letter,sonder;
		sonder=false;letter=false;number=false;
		String blacklist = null;
		if(args.length==0){
			Console console;			
			console = System.console();

			sonder=false;letter=false;number=false;
			pwLength = Integer.parseInt(console.readLine("how long? "));
			if(console.readLine("numbers? (y/n) ").equals("y")){number=true;};
			if(console.readLine("letters? (y/n) ").equals("y")){letter=true;};
			if(console.readLine("sonders? (y/n) ").equals("y")){sonder=true;};
		
			
		}else if(args.length==2){
			pwLength = Integer.parseInt(args[1]);
			if(args[0].contains("s"))sonder=true;
			if(args[0].contains("l"))letter=true;
			if(args[0].contains("n"))number=true;
		}else if(args.length==3){
			pwLength = Integer.parseInt(args[1]);
			if(args[0].contains("s"))sonder=true;
			if(args[0].contains("l"))letter=true;
			if(args[0].contains("n"))number=true;
			blacklist=args[2];
		}
		

		if(!(number || letter || sonder)){
			System.out.println("every option was dismissed");
			System.exit(0);
		}//if

		if(blacklist==null){
			for(int n=0;n<pwLength;n++){
				System.out.print(getOne(number,letter,sonder));
			}
		}else{
			String picked;
			for(int n=0;n<pwLength;n++){
				picked = getOne(number, letter, sonder);
				if(blacklist.contains(picked)){
					n--;
				}else{
					System.out.print(picked);
				}
			}

		}
		System.out.print("\n");
		
	}
	
	public static String getOne(boolean number, boolean letter, boolean sonder){
		int choice;
		choice = (int) (Math.random()*86);
		
		if(choice>=0 && choice<=9){
			if(number){
				if(choice == 0)
					return "0";
				if(choice == 1)
					return "1";
				if(choice == 2)
					return "2";
				if(choice == 3)
					return "3";
				if(choice == 4)
					return "4";
				if(choice == 5)
					return "5";
				if(choice == 6)
					return "6";
				if(choice == 7)
					return "7";
				if(choice == 8)
					return "8";
				if(choice == 9)
					return "9";				
			}else{
				return getOne(number,letter,sonder);
			}
		}else if(choice>9 && choice<=61){
			if(letter){
				if(choice == 10)
					return "a";
				if(choice == 11)
					return "b";
				if(choice == 12)
					return "c";
				if(choice == 13)
					return "d";
				if(choice == 14)
					return "e";
				if(choice == 15)
					return "f";
				if(choice == 16)
					return "g";
				if(choice == 17)
					return "h";
				if(choice == 18)
					return "i";
				if(choice == 19)
					return "j";				
				if(choice == 20)
					return "k";
				if(choice == 21)
					return "l";
				if(choice == 22)
					return "m";
				if(choice == 23)
					return "n";
				if(choice == 24)
					return "o";
				if(choice == 25)
					return "p";
				if(choice == 26)
					return "q";
				if(choice == 27)
					return "r";
				if(choice == 28)
					return "s";
				if(choice == 29)
					return "t";				
				if(choice == 30)
					return "u";
				if(choice == 31)
					return "v";
				if(choice == 32)
					return "w";
				if(choice == 33)
					return "x";
				if(choice == 34)
					return "y";
				if(choice == 35)
					return "z";
				if(choice == 36)
					return "A";
				if(choice == 37)
					return "B";
				if(choice == 38)
					return "C";
				if(choice == 39)
					return "D";				
				if(choice == 40)
					return "E";
				if(choice == 41)
					return "F";
				if(choice == 42)
					return "G";
				if(choice == 43)
					return "H";
				if(choice == 44)
					return "I";
				if(choice == 45)
					return "J";
				if(choice == 46)
					return "K";
				if(choice == 47)
					return "L";
				if(choice == 48)
					return "M";
				if(choice == 49)
					return "N";				
				if(choice == 50)
					return "O";
				if(choice == 51)
					return "P";
				if(choice == 52)
					return "Q";
				if(choice == 53)
					return "R";
				if(choice == 54)
					return "S";
				if(choice == 55)
					return "T";
				if(choice == 56)
					return "U";
				if(choice == 57)
					return "V";
				if(choice == 58)
					return "W";
				if(choice == 59)
					return "X";	
				if(choice == 60)
					return "Y";
				if(choice == 61)
					return "Z";			
			}else{
				return getOne(number,letter,sonder);
			}
		}else if(choice>61 && choice<=85){
			if(sonder){
				if(choice == 62)
					return "!";
				if(choice == 63)
					return "\"";
				if(choice == 64)
					return "§";
				if(choice == 65)
					return "$";
				if(choice == 66)
					return "%";
				if(choice == 67)
					return "&";
				if(choice == 68)
					return "/";
				if(choice == 69)
					return "(";
				if(choice == 70)
					return ")";
				if(choice == 71)
					return "=";
				if(choice == 72)
					return "!";
				if(choice == 73)
					return "+";
				if(choice == 74)
					return "#";
				if(choice == 75)
					return "-";
				if(choice == 76)
					return "_";
				if(choice == 77)
					return "*";
				if(choice == 78)
					return "\\";
				if(choice == 79)
					return "?";
				if(choice == 80)
					return "}";
				if(choice == 81)
					return "]";
				if(choice == 82)
					return "[";
				if(choice == 83)
					return "{";
				if(choice == 84)
					return "<";
				if(choice == 85)
					return ">";			
			}else{
				return getOne(number,letter,sonder);
			}
		}
		return "";
	}
}//end
