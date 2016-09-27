package domain;

import java.util.HashSet;
import java.util.Set;

public class Contact 
{
	private String firstName;
	private String lastName;
	private String email;
	private long   id;
	private Set<ContactGroup> books;
	private Set<PhoneNumber> phones;
	private Address add;
	
	
	
	public Contact() {
		books = new HashSet<ContactGroup>();
		phones = new HashSet<PhoneNumber>();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Set<ContactGroup> getBooks() {
		return books;
	}
	public void setBooks(Set<ContactGroup> books) {
		this.books = books;
	}
	public Set<PhoneNumber> getPhones() {
		return phones;
	}
	public void setPhones(Set<PhoneNumber> phones) {
		this.phones = phones;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
}
