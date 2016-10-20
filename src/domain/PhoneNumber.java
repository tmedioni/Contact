package domain;

public class PhoneNumber {
	private long id;
	private String phoneKind;
	private String phoneNumber;
	private Contact contact;
	private int version;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneKind() {
		return phoneKind;
	}
	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
		
		for(PhoneNumber n : contact.getPhones())
		{
			if(n == this) return;
		}
		contact.getPhones().add(this);
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
