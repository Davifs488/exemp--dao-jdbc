package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Saller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalery;
	
	private Department department;
	
	public Saller() {
	}

	public Saller(Integer id, String name, String email, Date birthDate, Double baseSalery, Department department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalery = baseSalery;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalery() {
		return baseSalery;
	}

	public void setBaseSalery(Double baseSalery) {
		this.baseSalery = baseSalery;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saller other = (Saller) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Saller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", baseSalery="
				+ baseSalery + ", department=" + department + "]";
	}
		
}
