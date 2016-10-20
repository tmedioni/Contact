package domain;


import java.util.HashSet;
import java.util.Set;

public class ContactGroup 
{
	private long groupId;
	private String groupName;
	private int version;
	Set<Contact> contacts;
	
	public ContactGroup() {
		super();
		contacts = new HashSet<Contact>();
	}
	public Set<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
