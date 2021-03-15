package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;

	public Company() {
		super();
	}
	
	
	public Company(String name, Double anualcome, Integer numberOfEmployees) {
		super(name, anualcome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public double tax() {
		// TODO Auto-generated method stub
		if(getNumberOfEmployees() > 10) {
			return getAnualcome() * 0.14;
		} else {
			return getAnualcome() * 0.16;
 		}
	}
}
