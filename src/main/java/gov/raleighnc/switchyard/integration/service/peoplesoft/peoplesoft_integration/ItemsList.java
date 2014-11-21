package gov.raleighnc.switchyard.integration.service.peoplesoft.peoplesoft_integration;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Representation of a material items list from Raleigh Peoplesoft REST api.
 * 
 * @author bryand
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ItemsList")

public class ItemsList {
	
	@XmlElement(name = "item")
	private ArrayList<Item> items;

	/**
	 * @return the items
	 */
	public ArrayList<Item> getItems() {
		// clone
		ArrayList<Item> list = new ArrayList<Item>();
		list.addAll(items);
		return list;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		ItemsList other = (ItemsList) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}
	
	

	public ItemsList(ArrayList<Item> items) {
		this.items = items;
	}

	public ItemsList() {
	}

	
}

