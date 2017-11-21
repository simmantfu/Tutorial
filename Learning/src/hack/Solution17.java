package hack;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution17 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new File("D://code//playarea//HackersRank//src//test.txt"));
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		final ArrayList<String> index = new ArrayList<String>();

		for (int i = 0; i < n; i++)
			index.add(s[i] + "s" + i);

		Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();

		for (int i = 0; i < n; i++) {

			map.put(s[i] + "s" + i, new BigDecimal(s[i]));
		}

		Set<Map.Entry<String, BigDecimal>> mapSet = map.entrySet();

		List<Object> list = new ArrayList<Object>(mapSet);

		Collections.sort(list, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Map.Entry<String, BigDecimal> t1 = (Map.Entry<String, BigDecimal>) o1;
				Map.Entry<String, BigDecimal> t2 = (Map.Entry<String, BigDecimal>) o2;

				int result = t2.getValue().compareTo(t1.getValue());

				if (result == 0) {
					int res1 = index.indexOf(t2.getKey());
					int res2 = index.indexOf(t1.getKey());

					if (res1 < res2) {
						return 1;
					} else {
						return -1;
					}

				}

				return result;
			}
		});
		for (int i = 0; i < n; i++) {

			Map.Entry<String, BigDecimal> t1 = (Map.Entry<String, BigDecimal>) list.get(i);
			s[i] = t1.getKey().split("s")[0];
		}

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}
}
