package sort_algorithm;
import java.util.*;

public final class sort_main {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input_methord = "0";
		String input_sort_methord;
		typing_input typing = new typing_input();
		file_input File_input = new file_input();
		System.out.println("Welcome to this sort algorithms demo!\n");
		System.out.println("Firstly, there are two ways for inputing your array: \n");
		System.out.println("1. input your array from typing.\n" + "2. input your array from a .txt file\n");
		System.out.println("Now choose one of them to continue!\n");
		input_methord = input.next();
		while(!input_methord.equals("1") && !input_methord.equals("2")){
			System.out.println("Sorry, wrong command! Plz type '1' or '2'.\n");
			input_methord = input.next();
		}
		if(input_methord.equals("1")){
			
			typing.input_methord();
			
		}
		else{
			
			File_input.input_methord();
		}
		
		System.out.println("Now choose the sort algorithm for this array!\n");
		System.out.println("We now have quick sort(a)\n merge sort(b)\n select sort(c)\n bubble sort(d)\n insert sort(e)\n");
		System.out.println("Choose the sort algorithm by the index.\n");
		input_sort_methord = input.next();
		while(input_sort_methord.isEmpty()){
			System.out.println("Cant be empty! Type again please.\n");
			input_sort_methord = input.next();
		}
		switch(input_sort_methord){
		case "a":
			System.out.println("Lets do the quick sort!\n");
			if(input_methord.equals("1")){
			quick_sort Quick_sort = new quick_sort(typing.get_array());
			Quick_sort.sort();
			System.out.println("this is the result:\n");
			System.out.println(Quick_sort.get_array() + "\n");
			}
			else {
				quick_sort Quick_sort = new quick_sort(File_input.get_array());
				System.out.println(Quick_sort.get_array() + "\n");
				Quick_sort.sort();
				System.out.println("this is the result:\n");
				System.out.println(Quick_sort.get_array() + "\n");
				
			}
			break;
		case "b":
			System.out.println("This sort algorithm is not implemented yet!\n");
			break;
		case "c":
			System.out.println("This sort algorithm is not implemented yet!\n");
			break;
		case "d":
			System.out.println("This sort algorithm is not implemented yet!\n");
			break;
		case "e":
			System.out.println("This sort algorithm is not implemented yet!\n");
			break;
		default:
			System.out.println("wrong choose!\n");
			break;
		}
		
		System.out.println("Thank you for using!\n ");
		input.close();
		
		}

		
	}

