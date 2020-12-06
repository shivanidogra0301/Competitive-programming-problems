package googleFAQs;

import java.util.HashMap;
import java.util.Map;

public class FruitesIntoBasket {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(20, 1);
		map.put(20, 2);
		map.put(30, 1);
		System.out.println(map.remove(30));
	}

}
