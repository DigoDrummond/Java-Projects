package Generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	//aceita todos os tipos se for do tipo Object
	//classe está parametrizada pelo tipo T
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() throws Exception {
		if(list.isEmpty()) {
			throw new Exception("List is empty");
		}
		return list.get(0);
	}
	public void print() {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ ", ");
		}
		System.out.println("\n");
	}
}
