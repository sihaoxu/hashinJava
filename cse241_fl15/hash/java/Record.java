//
// RECORD.JAVA
// Record type for string hash table
//
// A record associates a certain string (the key value) with 
// a list of sequence positions at which that string occurs.
//

import java.util.*;

public class Record {
    public String key;
    public int hashKey;
    public ArrayList<Integer> positions;
    
    public Record(String s)
    {
	key = s;
	int A = 1952786893;
	int B = 367257;
	int v = B;
	
	for (int j = 0; j < s.length(); j++)
	    {
		char c = s.charAt(j);
		v = A * (v + (int) c + j) + B;
	    }
	
	if (v < 0) v = -v;
    hashKey=v;
	positions = new ArrayList<Integer>(1);
    }

}
