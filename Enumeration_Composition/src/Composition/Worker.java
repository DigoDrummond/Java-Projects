package Composition;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//associaçoes
	
	//um trabalhador tem um departamento
	private Department department;
	
	//um trabalhador tem vários contratos
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {}

	//construtor sem argumentos do tipo lista
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	
	//adiciona contrato na lista
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	//remove contrato
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	//salário base + mais contratos de certo mês no ano
	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			//pegar ano e mês da data do contrato
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
}
