package sort_algorithm;
import java.util.*;

public abstract class sort_algorithm {
	private ArrayList<Integer> array;
	
	public ArrayList<Integer> get_array(){
		return array;
	}
	public void set_array(ArrayList<Integer> input_array){
		array = input_array;
	}
	
	abstract void sort();

}
