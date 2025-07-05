package Array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1394_Find_Lucky_Integer_in_an_Array {

	public int findLucky(int[] arr) {

		int rs = -1;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr){
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == entry.getKey()) {
				rs = Math.max(entry.getKey(), rs);
			}
		}

		return rs;
	}
}
