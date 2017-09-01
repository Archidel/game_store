package com.archidel.gs.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="U_ID")
    private int id;

    @Column(name="U_NAME", nullable=false)
    private String name;
    
    @Column(name="U_SURNAME", nullable=false)
    private String surname;
    
    @Column(name="U_EMAIL", nullable=false)
    private String email;
    
    @Column(name="U_CONTACT_NUMBER", nullable=false)
    private String contactNumber;
    
    @Column(name="U_ADDRESS", nullable=false)
    private String address;
    
    @Column(name="U_CITY", nullable=false)
    private String city;
    
    @Column(name="U_PASSWORD", nullable=false)
    private String password;
    
    @Column(name="U_STATE", nullable=false)
    private String state = State.ACTIVE.getState();
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="USER_M2M_USER_PROFILE",
	    joinColumns = {@JoinColumn(name = "U_ID")},
	    inverseJoinColumns = {@JoinColumn(name = "UP_ID")})
    private Set<UserProfile> userProfile = new HashSet<UserProfile>();

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((surname == null) ? 0 : surname.hashCode());
	result = prime * result + ((userProfile == null) ? 0 : userProfile.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	User other = (User) obj;
	if (address == null) {
	    if (other.address != null)
		return false;
	} else if (!address.equals(other.address))
	    return false;
	if (city == null) {
	    if (other.city != null)
		return false;
	} else if (!city.equals(other.city))
	    return false;
	if (contactNumber == null) {
	    if (other.contactNumber != null)
		return false;
	} else if (!contactNumber.equals(other.contactNumber))
	    return false;
	if (email == null) {
	    if (other.email != null)
		return false;
	} else if (!email.equals(other.email))
	    return false;
	if (id != other.id)
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (password == null) {
	    if (other.password != null)
		return false;
	} else if (!password.equals(other.password))
	    return false;
	if (state == null) {
	    if (other.state != null)
		return false;
	} else if (!state.equals(other.state))
	    return false;
	if (surname == null) {
	    if (other.surname != null)
		return false;
	} else if (!surname.equals(other.surname))
	    return false;
	if (userProfile == null) {
	    if (other.userProfile != null)
		return false;
	} else if (!userProfile.equals(other.userProfile))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", contactNumber="
		+ contactNumber + ", address=" + address + ", city=" + city + ", password=" + password + ", state="
		+ state + ", userProfile=" + userProfile + "]";
    }
    
}
