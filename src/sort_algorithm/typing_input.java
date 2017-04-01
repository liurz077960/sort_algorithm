package sort_algorithm;
import java.util.*;
public class typing_input implements input {
	
	private ArrayList<Integer> input_array = new ArrayList<Integer>();
	private int array_size;
	
	public ArrayList<Integer> get_array(){
		return input_array;
	}
	
	public int get_size(){
		return array_size;
	}
	
	public void add_array(int element){
		input_array.add(element);
	}
	
	public void set_size(int size){
		array_size = size;
	}

	@Override
	public void input_methord() {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		String input_command;
		System.out.println("Input the array size you want to use:\n");
		while(!sort_main.input.hasNextInt()){
			System.out.println("Please input a number!\n");
			sort_main.input.next();
		}
		set_size(sort_main.input.nextInt());
		System.out.println("The array size is: " + get_size() + ". Is that correct?\n");
		System.out.println("Type 'yes' or 'no'. \n");
		input_command = sort_main.input.next();
		while(!input_command.equals("yes")){
			if(!input_command.equals("no")){
				System.out.println("cant recognize your command!\n");
				System.out.println("Plz type 'yes' or 'no'.\n");
				input_command = sort_main.input.next();
				continue;
			}
			System.out.println("Please re-type the array size: \n");
			while(!sort_main.input.hasNextInt()){
				System.out.println("Please input a number!\n");
				sort_main.input.next();
			}
			set_size(sort_main.input.nextInt());
			System.out.println("The array size is: " + get_size() + ". Is that correct?\n");
			System.out.println("Type 'yes' or 'no' \n");
			input_command = sort_main.input.next();
		}
		System.out.println("Now please input the value for this array!\n");
		for(int i = 0; i<= get_size()-1; i++){
			while(!sort_main.input.hasNextInt()){
				System.out.println("Please input a number!\n");
				sort_main.input.next();
			}
			add_array(sort_main.input.nextInt());
		}
		System.out.println("The array you have input is as shown below: \n" + get_array());
		System.out.println("Is that correct?\n");
		System.out.println("Type 'yes' or 'no'.\n");
		input_command = sort_main.input.next();
		while(!input_command.equals("yes")){
			if(!input_command.equals("no")){
				System.out.println("cant recognize your command!\n");
				System.out.println("Plz type 'yes' or 'no'.\n");
				input_command = sort_main.input.next();
				continue;
			}
			System.out.println("Please re-type the array: \n");
			get_array().clear();
			for(int i = 0; i<= get_size()-1; i++){
				while(!sort_main.input.hasNextInt()){
					System.out.println("Please input a number!\n");
					sort_main.input.next();
				}
				add_array(sort_main.input.nextInt());
			}
			System.out.println("The array you have input is as shown below: \n" + get_array());
			System.out.println("Is that correct?\n");
			System.out.println("Type 'yes' or 'no'. \n");
			input_command = sort_main.input.next();
		}
	}

}
