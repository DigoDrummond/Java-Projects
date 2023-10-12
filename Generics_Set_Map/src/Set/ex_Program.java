package Set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex_Program {

	public static void main(String[] args) {
		//entrada é arquivo txt com nome do usuário e data e hora de acesso a página
		//ex: amanda 2018-08-26T20:45:08Z formato iso 8601
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//usando HashSet por ser mais eficiente e ordem não importa
			Set<ex_LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				//ao tentar inserir elemento repetido, inserção é barrada pelo set
				//dessa forma conta quantos usuários acessaram página sem repetição
				set.add(new ex_LogEntry(username,moment));
				
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
			
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
