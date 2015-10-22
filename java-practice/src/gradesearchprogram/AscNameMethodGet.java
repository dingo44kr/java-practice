package gradesearchprogram;

import java.util.Comparator;

public class AscNameMethodGet implements Comparator<Grade> {

	@Override
	public int compare(Grade front, Grade back) {
		return front.getName().compareTo(back.getName());
	}
	

}
