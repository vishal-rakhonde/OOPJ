package phonebook;


import java.time.LocalDate;

public class Customer {
	private String name;
	private String email;
	private LocalDate date;
	private int mobno;
	//-----------construstors--------------
	
	public Customer(String name, String email, LocalDate date, int mobno) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		this.mobno = mobno;
	}
	
	//-----------gettersetters------------------------------------
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	
	//-------------- tostring----------------------------------------------
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", date=" + date + ", mobno=" + mobno + "]";
	}
	
	
//-------------------equals method in java ------------------------------
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
		{
			Customer custTwo=(Customer)o;
			return this.name.equals(custTwo.name)&&this.date.equals(custTwo.date);
		}
		else {
			return false;
		}
		
	}
	
	
	// for the single comparison  below method is used
	
	/* public boolean equals(Object o)
	{
		System.out.println("in emp's equals");
		if(o instanceof Employee)
			return this.id.equals(((Employee)o).id);
		return false;
	}
	*/
	//---------hashcode--------------------------------
	
	public int HashCode()
	{
		int result= this.name.hashCode()+this.email.hashCode();
		return result;
	}
	
	
	
	//---------------overriding hash code---------
	
	@Override
	public int hashCode() {
	    int result = 17;
	    result = 31 * result + name.hashCode();
	    result = 31 * result + email.hashCode();
	    return result;
	}

	
	
	
	
	
	
	
	

}

