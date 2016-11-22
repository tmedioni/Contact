package view.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddContactForm extends ActionForm {
	private String firstname;
	private String lastname;
	private String email;
	private String mobile;
	private String fixe;
	private String bureau;
	private String street;
	private String city;
	private String country;
	private String zipcode;
	private String siret;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFixe() {
		return fixe;
	}
	public void setFixe(String fixe) {
		this.fixe = fixe;
	}
	public String getBureau() {
		return bureau;
	}
	public void setBureau(String bureau) {
		this.bureau = bureau;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		firstname = null;
		lastname = null;
		email = null;
		mobile = null;
		fixe = null;
		bureau = null;
		street = null;
		city = null;
		country = null;
		zipcode = null;
		siret = null;
	}
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) 
	{
		ActionErrors errors = new ActionErrors();
		
		if(firstname == null || firstname.length() < 1)
		{
			errors.add("firstname", new ActionMessage("error.firstname.required"));
		}
		if(lastname == null || lastname.length() < 1)
		{
			errors.add("lastname", new ActionMessage("error.lastname.required"));
		}
		if(email == null || email.length() < 1)
		{
			errors.add("email", new ActionMessage("error.email.required"));
		}
		
		if( (street == null || street.length() < 1)
		    ||(city == null || city.length() < 1)
		    ||(country == null || country.length() < 1)
		    ||(zipcode == null || zipcode.length() < 1))
		{
			if(!(street == null || street.length() < 1)
		    &&(city == null || city.length() < 1)
		    &&(country == null || country.length() < 1)
		    &&(zipcode == null || zipcode.length() < 1))
			{
				errors.add("address", new ActionMessage("error.address.incomplete"));
			}
			street = null;
			city = null;
			country = null;
			zipcode = null;
		}
		
		return errors;
	}
	
	
}
