package hack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private static List<String> strList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STDIN();
	}

	public static List<String> STDIN() {
		strList = new ArrayList<String>();
		int count = -1;
		try {
			Scanner fileScanner = new Scanner(System.in);

			while (fileScanner.hasNextLine()) // if you are trying to count
												// lines
			{ // you should use hasNextLine()
				count++;
				strList.add(fileScanner.nextLine()); // advance the inputstream

				if (strList.get(count).contains("end-of-file")) {
					STDOUT(strList);
				} else {
					String[] s = strList.get(count).split(" ");
					String first = s[0];
					String second = "test";
					if (s.length >= 2) {
						second = s[1];
					}
					String end = s[s.length - 1];

					if ((first.toCharArray()[0] == 'e') && (second.toCharArray()[0] == 'u')
							&& (end.toCharArray()[0] == 'f')) {
						STDOUT(strList);
					}

				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return strList;
	}

	public static void STDOUT(List<String> strList) {
		int count = 0;
		for (String str : strList) {
			if (str != null && !str.equals("")) {
				count++;
				System.out.println(count + " " + str);
			}
		}
		System.exit(0);
	}

}
