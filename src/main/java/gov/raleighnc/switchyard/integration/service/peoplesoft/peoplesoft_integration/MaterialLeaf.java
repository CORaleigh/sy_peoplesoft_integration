package gov.raleighnc.switchyard.integration.service.peoplesoft.peoplesoft_integration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Representation of a material leaf domain for Cityworks (limited set of fields).
 * 
 * @author bryand
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "materialLeaf")
@Entity
@Table(name = "MATERIALLEAF")

public class MaterialLeaf {

	@XmlElement(name = "materialSID")
    @Id
    @Column(name = "MATERIALSID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int materialSID;
	
	@XmlElement(name = "materialUID")
    @Column(name = "MATERIALUID", columnDefinition = "nvarchar2")
	private String materialUID;
	
	@XmlElement(name = "partNumber")
    @Column(name = "PARTNUMBER", columnDefinition = "nvarchar2")
	private String partNumber;
	
	@XmlElement(name = "description")
    @Column(name = "DESCRIPTION", columnDefinition = "nvarchar2")
	private String description;
	
	@XmlElement(name = "manufacturer")
    @Column(name = "MANUFACTURER", columnDefinition = "nvarchar2")
	private String manufacturer;
	
	@XmlElement(name = "supplier")
    @Column(name = "SUPPLIER", columnDefinition = "nvarchar2")
	private String supplier;
	
	@XmlElement(name = "model")
    @Column(name = "MODEL", columnDefinition = "nvarchar2")
	private String model;
	
	@XmlElement(name = "minQuantity")
    @Column(name = "MINQUANTITY")
	private int minQuantity;
	
	@XmlElement(name = "unitCost")
    @Column(name = "UNITCOST")
	private double unitCost;
	
	@XmlElement(name = "costType")
    @Column(name = "COSTTYPE", columnDefinition = "nvarchar2")
	private String costType;
	
	@XmlElement(name = "detail")
    @Column(name = "DETAIL", columnDefinition = "nvarchar2")
	private String detail;
	
	@XmlElement(name = "unitOfMeasure")
    @Column(name = "UNITOFMEASURE", columnDefinition = "nvarchar2")
	private String unitOfMeasure;
	
	@XmlElement(name = "auditInterval")
    @Column(name = "AUDITINTERVAL", columnDefinition = "nvarchar2")
	private String auditInterval;
	
	@XmlElement(name = "defaultImgPath")
    @Column(name = "DEFAULTIMGPATH", columnDefinition = "nvarchar2")
	private String defaultImgPath;
	
	@XmlElement(name = "viewable")
    @Column(name = "VIEWABLE", columnDefinition = "nvarchar2")
	private boolean viewable;
	
	@XmlElement(name = "msrNumber")
    @Column(name = "CUSTOM1")
	private double msrNumber;
	
	@XmlElement(name = "psftFamilyField")
    @Column(name = "CUSTOM3")
	private String psftFamilyField;

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
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
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
	 * @return the supplier
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the minQuantity
	 */
	public int getMinQuantity() {
		return minQuantity;
	}

	/**
	 * @param minQuantity the minQuantity to set
	 */
	public void setMinQuantity(int minQuantity) {
		this.minQuantity = minQuantity;
	}

	/**
	 * @return the unitCost
	 */
	public double getUnitCost() {
		return unitCost;
	}

	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	/**
	 * @return the costType
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * @param costType the costType to set
	 */
	public void setCostType(String costType) {
		this.costType = costType;
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
	 * @return the auditInterval
	 */
	public String getAuditInterval() {
		return auditInterval;
	}

	/**
	 * @param auditInterval the auditInterval to set
	 */
	public void setAuditInterval(String auditInterval) {
		this.auditInterval = auditInterval;
	}

	/**
	 * @return the defaultImgPath
	 */
	public String getDefaultImgPath() {
		return defaultImgPath;
	}

	/**
	 * @param defaultImgPath the defaultImgPath to set
	 */
	public void setDefaultImgPath(String defaultImgPath) {
		this.defaultImgPath = defaultImgPath;
	}

	/**
	 * @return the viewable
	 */
	public boolean isViewable() {
		return viewable;
	}

	/**
	 * @param viewable the viewable to set
	 */
	public void setViewable(boolean viewable) {
		this.viewable = viewable;
	}

	/**
	 * @return the msrNumber
	 */
	public double getMsrNumber() {
		return msrNumber;
	}

	/**
	 * @param msrNumber the msrNumber to set
	 */
	public void setMsrNumber(double msrNumber) {
		this.msrNumber = msrNumber;
	}

	/**
	 * @return the psftFamilyField
	 */
	public String getPsftFamilyField() {
		return psftFamilyField;
	}

	/**
	 * @param psftFamilyField the psftFamilyField to set
	 */
	public void setPsftFamilyField(String psftFamilyField) {
		this.psftFamilyField = psftFamilyField;
	}

	/**
	 * @return the materialSID
	 */
	public int getMaterialSID() {
		return materialSID;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((auditInterval == null) ? 0 : auditInterval.hashCode());
		result = prime * result
				+ ((costType == null) ? 0 : costType.hashCode());
		result = prime * result
				+ ((defaultImgPath == null) ? 0 : defaultImgPath.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((detail == null) ? 0 : detail.hashCode());
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + materialSID;
		result = prime * result
				+ ((materialUID == null) ? 0 : materialUID.hashCode());
		result = prime * result + minQuantity;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(msrNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((partNumber == null) ? 0 : partNumber.hashCode());
		result = prime * result
				+ ((psftFamilyField == null) ? 0 : psftFamilyField.hashCode());
		result = prime * result
				+ ((supplier == null) ? 0 : supplier.hashCode());
		temp = Double.doubleToLongBits(unitCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((unitOfMeasure == null) ? 0 : unitOfMeasure.hashCode());
		result = prime * result + (viewable ? 1231 : 1237);
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
		MaterialLeaf other = (MaterialLeaf) obj;
		if (auditInterval == null) {
			if (other.auditInterval != null)
				return false;
		} else if (!auditInterval.equals(other.auditInterval))
			return false;
		if (costType == null) {
			if (other.costType != null)
				return false;
		} else if (!costType.equals(other.costType))
			return false;
		if (defaultImgPath == null) {
			if (other.defaultImgPath != null)
				return false;
		} else if (!defaultImgPath.equals(other.defaultImgPath))
			return false;
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
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (materialSID != other.materialSID)
			return false;
		if (materialUID == null) {
			if (other.materialUID != null)
				return false;
		} else if (!materialUID.equals(other.materialUID))
			return false;
		if (minQuantity != other.minQuantity)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (Double.doubleToLongBits(msrNumber) != Double
				.doubleToLongBits(other.msrNumber))
			return false;
		if (partNumber == null) {
			if (other.partNumber != null)
				return false;
		} else if (!partNumber.equals(other.partNumber))
			return false;
		if (psftFamilyField == null) {
			if (other.psftFamilyField != null)
				return false;
		} else if (!psftFamilyField.equals(other.psftFamilyField))
			return false;
		if (supplier == null) {
			if (other.supplier != null)
				return false;
		} else if (!supplier.equals(other.supplier))
			return false;
		if (Double.doubleToLongBits(unitCost) != Double
				.doubleToLongBits(other.unitCost))
			return false;
		if (unitOfMeasure == null) {
			if (other.unitOfMeasure != null)
				return false;
		} else if (!unitOfMeasure.equals(other.unitOfMeasure))
			return false;
		if (viewable != other.viewable)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MaterialLeaf [materialSID=" + materialSID + ", materialUID="
				+ materialUID + ", partNumber=" + partNumber + ", description="
				+ description + ", manufacturer=" + manufacturer
				+ ", supplier=" + supplier + ", model=" + model
				+ ", minQuantity=" + minQuantity + ", unitCost=" + unitCost
				+ ", costType=" + costType + ", detail=" + detail
				+ ", unitOfMeasure=" + unitOfMeasure + ", auditInterval="
				+ auditInterval + ", defaultImgPath=" + defaultImgPath
				+ ", viewable=" + viewable + ", msrNumber=" + msrNumber
				+ ", psftFamilyField=" + psftFamilyField + "]";
	}

	public MaterialLeaf(int materialSID, String materialUID, String partNumber,
			String description, String manufacturer, String supplier,
			String model, int minQuantity, double unitCost, String costType,
			String detail, String unitOfMeasure, String auditInterval,
			String defaultImgPath, boolean viewable, double msrNumber,
			String psftFamilyField) {
		this.materialSID = materialSID;
		this.materialUID = materialUID;
		this.partNumber = partNumber;
		this.description = description;
		this.manufacturer = manufacturer;
		this.supplier = supplier;
		this.model = model;
		this.minQuantity = minQuantity;
		this.unitCost = unitCost;
		this.costType = costType;
		this.detail = detail;
		this.unitOfMeasure = unitOfMeasure;
		this.auditInterval = auditInterval;
		this.defaultImgPath = defaultImgPath;
		this.viewable = viewable;
		this.msrNumber = msrNumber;
		this.psftFamilyField = psftFamilyField;
	}

	public MaterialLeaf() {
	}
	
	
}

