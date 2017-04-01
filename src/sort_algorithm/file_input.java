package sort_algorithm;
import java.io.*;
import java.util.*;

public class file_input implements input{
	
	FileReader filereader = null;
	BufferedReader input = null;
	File file = null;
	private ArrayList<Integer> input_array = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> get_array(){
		return input_array;
	}
	private void read_file(String path){
		
		String line;
		String[] sp;
		
		try{
			filereader = new FileReader(path);
			input = new BufferedReader(filereader);
			
		}catch(Exception e){
			System.out.println("Reader file failed!\n");
		}
		
		try{
		while((line = input.readLine()) != null){
			sp = line.split("\t");
			for(int i = 0; i < sp.length;i++){
				input_array.add(Integer.parseInt(sp[i]));
			}
			
		}
		}catch(Exception e){
			
		}
		
	}
	public void input_methord(){
		System.out.println("Please input the address for the file.\n");
		String file_name = sort_main.input.next();
		file = new File(file_name);
		while(!file.exists()){
			System.out.println("File do not exists. Plz re-enter the file path!\n");
			file_name = sort_main.input.next();
			file = new File(file_name);
		}
		read_file(file_name);
	}

}
