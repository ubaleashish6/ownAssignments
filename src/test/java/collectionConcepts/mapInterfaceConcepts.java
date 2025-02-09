package collectionConcepts;

import java.util.HashMap;
import java.util.Map;

public class mapInterfaceConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "My name is ashish sudhakar ubale";
		Map<Character, Integer> mapObj= new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				if(mapObj.containsKey(ch)) {
					 {
						mapObj.put(ch, mapObj.get(ch)+1);
					}
				}
				else {
					mapObj.put(ch, 1);
				}
			}
			
		}
		//System.out.println(mapObj);
		/*for(Map.Entry<Character, Integer> entrySet:mapObj.entrySet()) {
			if(entrySet.getValue()>1) {
				System.out.println(entrySet.getKey() +":" +entrySet.getValue());
			}
		} */
		
		mapObj.forEach((K,V) ->{if(V>1) System.out.println(K +":"+V);});
		
	}

}
