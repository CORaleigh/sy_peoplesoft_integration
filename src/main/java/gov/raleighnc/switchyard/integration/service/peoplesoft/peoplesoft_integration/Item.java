package gov.raleighnc.switchyard.integration.service.peoplesoft.peoplesoft_integration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Representation of a material item delivered from Raleigh's Peoplesoft REST api.
 * 
 * @author bryand
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
	
	@XmlElement(name = "lastdttmupdate")
	private String lastDttmUpdate;
	
	@XmlElement(name = "invitemid")
	private String materialUID;
	
	@XmlElement(name = "descr60")
	private String description;
	
	@XmlElement(name = "mfgid")
	private String manufacturer;
	
	@XmlElement(name = "lastpopricepaid")
	private String unitCostString;
	
	@XmlElement(name = "descr254mixed")
	private String detail;
	
	@XmlElement(name = "unitmeasurestd")
	private String unitOfMeasure;
	
	@XmlElement(name = "itmstatuscurrent")
	private String viewableString;
	
	@XmlElement(name = "invprodfamcd")
	private String familyField;

	/**
	 * @return the lastDttmUpdate
	 */
	public String getLastDttmUpdate() {
		return lastDttmUpdate;
	}

	/**
	 * @param lastDttmUpdate the lastDttmUpdate to set
	 */
	public void setLastDttmUpdate(String lastDttmUpdate) {
		this.lastDttmUpdate = lastDttmUpdate;
	}

	/**
	 * @return the materialUID
	 */
	public String getMaterialUID() {
		return materialUID;
	}

	/**
	 * @param materialUID the materialUID to set
	 */
	public void setMaterialUID(String materialUID) {
		this.materialUID = materialUID;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the unitCostString
	 */
	public String getUnitCostString() {
		return unitCostString;
	}

	/**
	 * @param unitCostString the unitCostString to set
	 */
	public void setUnitCostString(String unitCostString) {
		this.unitCostString = unitCostString;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the unitOfMeasure
	 */
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	/**
	 * @param unitOfMeasure the unitOfMeasure to set
	 */
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	/**
	 * @return the viewableString
	 */
	public String getViewableString() {
		return viewableString;
	}

	/**
	 * @param viewableString the viewableString to set
	 */
	public void setViewableString(String viewableString) {
		this.viewableString = viewableString;
	}

	/**
	 * @return the familyField
	 */
	public String getFamilyField() {
		return familyField;
	}

	/**
	 * @param familyField the familyField to set
	 */
	public void setFamilyField(String familyField) {
		this.familyField = familyField;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((detail == null) ? 0 : detail.hashCode());
		result = prime * result
				+ ((familyField == null) ? 0 : familyField.hashCode());
		result = prime * result
				+ ((lastDttmUpdate == null) ? 0 : lastDttmUpdate.hashCode());
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result
				+ ((materialUID == null) ? 0 : materialUID.hashCode());
		result = prime * result
				+ ((unitCostString == null) ? 0 : unitCostString.hashCode());
		result = prime * result
				+ ((unitOfMeasure == null) ? 0 : unitOfMeasure.hashCode());
		result = prime * result
				+ ((viewableString == null) ? 0 : viewableString.hashCode());
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
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (detail == null) {
			if (other.detail != null)
				return false;
		} else if (!detail.equals(other.detail))
			return false;
		if (familyField == null) {
			if (other.familyField != null)
				return false;
		} else if (!familyField.equals(other.familyField))
			return false;
		if (lastDttmUpdate == null) {
			if (other.lastDttmUpdate != null)
				return false;
		} else if (!lastDttmUpdate.equals(other.lastDttmUpdate))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (materialUID == null) {
			if (other.materialUID != null)
				return false;
		} else if (!materialUID.equals(other.materialUID))
			return false;
		if (unitCostString == null) {
			if (other.unitCostString != null)
				return false;
		} else if (!unitCostString.equals(other.unitCostString))
			return false;
		if (unitOfMeasure == null) {
			if (other.unitOfMeasure != null)
				return false;
		} else if (!unitOfMeasure.equals(other.unitOfMeasure))
			return false;
		if (viewableString == null) {
			if (other.viewableString != null)
				return false;
		} else if (!viewableString.equals(other.viewableString))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Item [lastDttmUpdate=" + lastDttmUpdate + ", materialUID="
				+ materialUID + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", unitCostString="
				+ unitCostString + ", detail=" + detail + ", unitOfMeasure="
				+ unitOfMeasure + ", viewableString=" + viewableString
				+ ", familyField=" + familyField + "]";
	}

	public Item(String lastDttmUpdate, String materialUID, String description,
			String manufacturer, String unitCostString, String detail,
			String unitOfMeasure, String viewableString, String familyField) {
		this.lastDttmUpdate = lastDttmUpdate;
		this.materialUID = materialUID;
		this.description = description;
		this.manufacturer = manufacturer;
		this.unitCostString = unitCostString;
		this.detail = detail;
		this.unitOfMeasure = unitOfMeasure;
		this.viewableString = viewableString;
		this.familyField = familyField;
	}

	public Item() {
	}
	
	// additional getters 
	public double getUnitCost() {
		/*
		 * Use this method to try to access the unit cost of the item as a double value.
		 * Failure to parse as a double is indicated by a -1.0 value.
		 */
		// try to parse from string
		try {
			Double unitCost = Double.parseDouble(this.unitCostString);
			return unitCost;
		} catch (Exception ex) {
			// do nothing
		}
		
		return -1.0; // flag value
	}
	
	public boolean isViewable() {
		/*
		 * Use this method to try to access the viewable flag value as a boolean value.
		 * Failure to parse results in false value.
		 */
		// try to parse from string
		try {
			Boolean viewable = Boolean.parseBoolean(this.viewableString);
			return viewable;
		} catch (Exception ex){
			// do nothing
		}
		return false;
	}
}

