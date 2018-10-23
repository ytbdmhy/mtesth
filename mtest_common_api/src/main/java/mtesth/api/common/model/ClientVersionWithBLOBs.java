package mtesth.api.common.model;

public class ClientVersionWithBLOBs extends ClientVersion {
    private String whatsnew;

    private String memorandum;

    public String getWhatsnew() {
        return whatsnew;
    }

    public void setWhatsnew(String whatsnew) {
        this.whatsnew = whatsnew == null ? null : whatsnew.trim();
    }

    public String getMemorandum() {
        return memorandum;
    }

    public void setMemorandum(String memorandum) {
        this.memorandum = memorandum == null ? null : memorandum.trim();
    }
}