import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SearchSpack {

	static List<String> lst = new ArrayList<String>();
	static FileOutputStream fout = null;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		fout = new FileOutputStream(new File("D://testOut.txt"), true);
		getSearch(new File("D://opt//HBS//rd//chs"));

		System.out.println("Searching is done, Numbers of file:" + lst.size());

		for (String str : lst) {

			getReqText(str);
		}

		System.out.println("done");
	}

	public static void getSearch(File file) {

		File[] fArray = file.listFiles();
		for (File f : fArray) {

			if (f.isDirectory()) {
				getSearch(f);
			}

			if (!f.isDirectory()) {
				lst.add(f.getAbsolutePath());
			}

		}

	}

	public static void getReqText(String str) {

		// if(str.endsWith("help_HNG_help_postal_general_info_3_s_sizeandweights_max_htm77846.tmp"))
		// System.out.println(str);
		if (str.endsWith(".tmp")) {
			try {
				FileInputStream fileInputStream = new FileInputStream(new File(str));
				BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));

				String search = "";
				while ((search = br.readLine()) != null) {
					if (search.contains(".jpg")) {
						// pr.println("file Path:" + str + " imagepath :" +
						// search);
						getImagePath(str, search);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void getImagePath(String path, String search) {

		try {

			Document doc = Jsoup.parse(search);
			Elements image = doc.select("img[src$=.jpg]");
			for (Element e : image) {
				String url = e.attr("src");
				PrintWriter pr = new PrintWriter(fout, true);
				pr.println("path: " + path + " image path:" + url);
				//pr.println("image path:" + url);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
