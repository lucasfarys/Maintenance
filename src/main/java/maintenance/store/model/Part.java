package maintenance.store.model;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long plant;
    @Column(name = "plant_name")
    private String plantName;
    @Column(name = "material_number")
    private Long materialNumber;
    @Column(name = "local_description")
    private String localDescription;
    @Column(name = "basic_data_text")
    private String basicDataText;
    @Column(name = "description")
    private String description;
    @Column(name = "storage_location")
    private Long storageLocation;
    @Column(name = "bin_number")
    private String binNumber;
    @Column(name = "mrp_type")
    private String MRPType;
    @Column(name = "critical_part_ind")
    private String criticalPartInd;
    @Column(name = "vendor_number")
    private Long vendorNumber;
    @Column(name = "vendor_name")
    private String vendorName;
    @Column(name = "manufacturer_name")
    private String manufacturerName;
    @Column(name = "manufacturer_part_number")
    private String manufacturerPartNumber;
    @Column(name = "min_lot_size")
    private Long minLotSize;
    @Column(name = "pdt_in_days")
    private Long pdtInDays;
    @Column(name = "reorder_point")
    private Long reorderPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlant() {
        return plant;
    }

    public void setPlant(Long plant) {
        this.plant = plant;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public Long getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(Long materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getLocalDescription() {
        return localDescription;
    }

    public void setLocalDescription(String localDescription) {
        this.localDescription = localDescription;
    }

    public String getBasicDataText() {
        return basicDataText;
    }

    public void setBasicDataText(String basicDataText) {
        this.basicDataText = basicDataText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(Long storageLocation) {
        this.storageLocation = storageLocation;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getMRPType() {
        return MRPType;
    }

    public void setMRPType(String MRPType) {
        this.MRPType = MRPType;
    }

    public String getCriticalPartInd() {
        return criticalPartInd;
    }

    public void setCriticalPartInd(String criticalPartInd) {
        this.criticalPartInd = criticalPartInd;
    }

    public Long getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(Long vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    public void setManufacturerPartNumber(String manufacturerPartNumber) {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    public Long getMinLotSize() {
        return minLotSize;
    }

    public void setMinLotSize(Long minLotSize) {
        this.minLotSize = minLotSize;
    }

    public Long getPdtInDays() {
        return pdtInDays;
    }

    public void setPdtInDays(Long pdtInDays) {
        this.pdtInDays = pdtInDays;
    }

    public Long getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(Long reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", plant=" + plant +
                ", plantName='" + plantName + '\'' +
                ", materialNumber=" + materialNumber +
                ", localDescription='" + localDescription + '\'' +
                ", basicDataText='" + basicDataText + '\'' +
                ", description='" + description + '\'' +
                ", storageLocation=" + storageLocation +
                ", binNumber='" + binNumber + '\'' +
                ", MRPType='" + MRPType + '\'' +
                ", criticalPartInd='" + criticalPartInd + '\'' +
                ", vendorNumber=" + vendorNumber +
                ", vendorName='" + vendorName + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerPartNumber='" + manufacturerPartNumber + '\'' +
                ", minLotSize=" + minLotSize +
                ", pdtInDays=" + pdtInDays +
                ", reorderPoint=" + reorderPoint +
                '}';
    }
}
