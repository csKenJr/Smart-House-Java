import java.util.*;
import java.io.*;

public class ApplianceList {
	
	ArrayList<String> theAppliances;
	int size  = 0;
	
	public ApplianceList(int newSize, String fileName) throws IOException {
		if(size != 0) {
			size = newSize;
		}
		if (fileName!=null) {
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			size = 10000;
			theAppliances = new ArrayList<String>(size);
			String line = in.nextLine();
			while(in.hasNextLine()) {
				theAppliances.add(line);
				line = in.nextLine();
			}
		}
		
	}

	public ApplianceList(String fileName) throws IOException {
		if (fileName!=null) {
			File inFile = new File(fileName);
			Scanner in = new Scanner(inFile);
			size = 10000;
			theAppliances = new ArrayList<String>(size);
			String line = in.nextLine();
			while(in.hasNextLine()) {
				theAppliances.add(line);
				line = in.nextLine();
			}
		}
	}
	
	
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		String temp= " ";
		if(size > 0) {
			for(int i = 0; i <= theAppliances.size(); i++) {
				temp = temp + theAppliances.get(i);
			}
		}
		return temp;
	}
}
