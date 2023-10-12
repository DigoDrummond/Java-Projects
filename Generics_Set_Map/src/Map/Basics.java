package Map;

import java.util.Map;
import java.util.TreeMap;

public class Basics {

	public static void main(String[] args) {
		// <tipo da chave, tipo do valor>

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("Email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		// sobrescreve primeiro phone, pois map não admite repetição de chave
		cookies.put("phone", "99711133");

		// remove do map entrada cuja chave é email
		cookies.remove("Email");

		System.out.println("ALL COOKIES: ");

		// pega chave e imprime chave mais valor dela
		// imprime dados ordenados pela chave(TreeMap ordena)

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

		System.out.println("Phone number: " + cookies.get("phone"));
		
		//retorna nulo pois chave rg não existe
		System.out.println("Rg: " + cookies.get("rg"));
		
		//size retorna número de chaves
		System.out.println("Size: " + cookies.size());
	}

}
