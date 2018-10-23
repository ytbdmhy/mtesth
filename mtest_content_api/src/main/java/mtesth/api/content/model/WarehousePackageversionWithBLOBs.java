package mtesth.api.content.model;

public class WarehousePackageversionWithBLOBs extends WarehousePackageversion {
    private String whatsnew;

    private String description;

    public String getWhatsnew() {
        return whatsnew;
    }

    public void setWhatsnew(String whatsnew) {
        this.whatsnew = whatsnew == null ? null : whatsnew.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}