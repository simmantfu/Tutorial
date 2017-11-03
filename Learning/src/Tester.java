
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Tester {

	static List<String> sList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		sList = new Tester().test();
		sList.forEach((d) -> System.out.println(d));

	}

	private List<String> test() throws IOException {

		String str = "", str2 = "";
		FileInputStream fileInputStream = new FileInputStream(new File("C://Users//yadavsim//Desktop//test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
		while ((str = br.readLine()) != null) {
			if (!str.equals("start")) {
				str2 = str2 + "\n" + str;
			}
			if (str.equals("end")) {
				sList.add(str2.replace("end", ""));
				str2 = "";
			}

		}

		return sList;
	}

}
