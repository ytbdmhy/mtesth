package mtesth.api.content.model;

public class WarehousePackageWithBLOBs extends WarehousePackage {
    private String description;

    private String adaptedInfomation;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAdaptedInfomation() {
        return adaptedInfomation;
    }

    public void setAdaptedInfomation(String adaptedInfomation) {
        this.adaptedInfomation = adaptedInfomation == null ? null : adaptedInfomation.trim();
    }
}