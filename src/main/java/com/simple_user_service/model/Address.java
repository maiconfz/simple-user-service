/**
 * 
 */
package com.simple_user_service.model;

/**
 * @author MaiconFonsecaZanco
 *
 */
public class Address {

	private final Long id;
	private final Integer cep;
	private final String street;
	private final Integer number;
	private final String district;
	private final String state;
	private final String country;

	private final User user;

	/**
	 * @param id
	 * @param cep
	 * @param street
	 * @param number
	 * @param district
	 * @param state
	 * @param country
	 * @param user
	 */
	public Address(Long id, Integer cep, String street, Integer number, String district, String state, String country,
			User user) {
		super();
		this.id = id;
		this.cep = cep;
		this.street = street;
		this.number = number;
		this.district = district;
		this.state = state;
		this.country = country;
		this.user = user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id != other.id)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [id=" + id + ", cep=" + cep + ", street=" + street + ", number=" + number + ", district="
				+ district + ", state=" + state + ", country=" + country + ", user=" + user + "]";
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the cep
	 */
	public Integer getCep() {
		return cep;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

}
