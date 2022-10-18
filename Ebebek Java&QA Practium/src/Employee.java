public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}


	public double tax() {
		if(this.salary > 1000) {
			return this.salary * 0.03;
		}
		else {
			return 0;
		}
	}
	
	public double bonus() {
		if(this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}else {
			return 0;
		}
	}
	
	public double raiseSalary() {
		int calısmaZamani = 2021 - this.hireYear;
		if(calısmaZamani < 10) {
			return this.salary * 0.05;
		}else if (calısmaZamani > 9 && calısmaZamani < 20) {
			return this.salary * 0.1;
		}else if (calısmaZamani > 19) {
			return this.salary * 0.15;
		}else {
			return 0;
		}
	}
	
	public String toString() {
		double vergi_ve_bonus_ile_maas = this.salary + this.bonus() - this.tax();
		double toplam_maas = vergi_ve_bonus_ile_maas + this.raiseSalary();
		return "Adi : " + this.name + "\nMaasi : " + this.salary + "\nCalisma Saati : " + this.workHours + "\nBaslangic Yili : " + this.hireYear
				+ "\nVergi : " + this.tax() + "\nBonus : " + this.bonus() + "\nMaas Artisi : " + this.raiseSalary()
				+ "\nVergi ve Bonuslar ile birlikte maas : " + vergi_ve_bonus_ile_maas + "\nToplam Maas : " + toplam_maas;
	}
}