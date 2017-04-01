package sort_algorithm;
import java.util.*;

public class quick_sort extends sort_algorithm {
	
	private int start;
	private int end;
	
	public int get_start(){
		return start;
	}
	public int get_end(){
		return end;
	}

	
	public void set_start(int st){
		start = st;
	}
	public void set_end(int en){
		end = en;
	}
	

	public quick_sort(ArrayList<Integer> input_array) {
		// TODO Auto-generated constructor stub
		set_array(input_array);
		set_start(0);
		set_end(get_array().size()-1);
	}
	
	private void quick_sort_algorithm(ArrayList<Integer> array, int start, int end){
		if(start <= end){
		int i =start, j = end;
		int emptyIndex = i;
		int pivot = array.get(i);
		while(i < j){
			while(i < j && pivot <= array.get(j)){
				j--;
			}
			if(i < j){
				array.set(emptyIndex, array.get(j));
				emptyIndex = j;
			}
			while(i < j && array.get(i) <= pivot){
				i++;
			}
			if(i < j){
				array.set(emptyIndex,  array.get(i));
				emptyIndex = i;
			}
		}
		array.set(emptyIndex, pivot);
		if(i - start > 1){
			quick_sort_algorithm(array, 0, i - 1);
		}
		if(end - i > 1){
			quick_sort_algorithm(array, i+1, end);
		}
		}
	}
		
	
	public void sort(){
		quick_sort_algorithm(get_array(), get_start(), get_end());
		
	}

}
