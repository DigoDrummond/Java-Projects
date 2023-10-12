package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		//HashSet -> implementação mais rápida( O(1) )
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		//não imprime na ordem pois HashSet não garante ordem
		//para garantir ordem usar TreeSet(lg n)
		for(String p : set) {
			System.out.println(p);
		}
		System.out.println();
		
		set.remove("Tablet");
		
		for(String p : set) {
			System.out.println(p);
		}
		
		/*remove todo elemento com mais de 3 letras
		set.removeIf(x-> x.length()>=3);
		remove todo elemento que começa com T
		set.removeIf(x-> x.charAt(0) == 'T');
		*/
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		
		//união
		Set<Integer> c = new TreeSet<>(a);//conjunto c é copia de a
		c.addAll(b);
		System.out.println(c);

		//interseção
		Set<Integer> d = new TreeSet<>(a);//conjunto d é copia de a
		d.retainAll(b);
		System.out.println(d);
		
		//diferença
		Set<Integer> e = new TreeSet<>(a);//conjunto e é copia de a
		e.removeAll(b);
		System.out.println(e);
	}

}
