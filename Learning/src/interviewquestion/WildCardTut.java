package interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class WildCardTut {

	public static void main(String... strings) {

		List<AI> s = new ArrayList<>();
		Check(s);
	}

	static <K extends Aw> void Check(List<? extends Aw> l) {

	}

}

interface Aw {

}

class AI implements Aw {

}

class BI implements Aw {

}
