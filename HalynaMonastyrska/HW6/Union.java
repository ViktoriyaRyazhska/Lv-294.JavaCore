import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Union {

	public static void main(String[] args) {
		Set<String> writersUnion = new TreeSet<>();
		writersUnion.addAll(Arrays.asList(new String[] { "Bachynskyi", "Rubak", "Levchenko", "Gryniv", "Petriv", "Havryliv", "Demko" }));
		System.out.println("Members of writers' union:");
		System.out.println(writersUnion);
		System.out.println();
		Set<String> politicalGroup = new TreeSet<>();
		politicalGroup.addAll(Arrays.asList(new String[] { "Medvid", "Soroka", "Dorosh", "Levchenko", "Leniv" }));
		System.out.println("Members of political group:");
		System.out.println(politicalGroup);
		System.out.println();
		union(writersUnion, politicalGroup);
		intersect(writersUnion, politicalGroup);
	}

	@SuppressWarnings("unchecked")
	private static void union(@SuppressWarnings("rawtypes") Set set1, @SuppressWarnings("rawtypes") Set set2) {
		Set<Integer> union = new TreeSet<>(set1);
		union.addAll(set2);
		System.out.println("Union of two sets:");
		System.out.println(union);
		System.out.println();
	}

	@SuppressWarnings("unchecked")
	private static void intersect(@SuppressWarnings("rawtypes") Set set1, @SuppressWarnings("rawtypes") Set set2) {
		@SuppressWarnings({ "rawtypes" })
		Set intersect = new TreeSet(set1);
		intersect.retainAll(set2);
		System.out.println("Intersection:");
		System.out.println(intersect);

	}

}
