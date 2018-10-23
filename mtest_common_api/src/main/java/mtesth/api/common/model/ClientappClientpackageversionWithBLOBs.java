package mtesth.api.common.model;

public class ClientappClientpackageversionWithBLOBs extends ClientappClientpackageversion {
    private String memorandum;

    private String whatsnew;

    public String getMemorandum() {
        return memorandum;
    }

    public void setMemorandum(String memorandum) {
        this.memorandum = memorandum == null ? null : memorandum.trim();
    }

    public String getWhatsnew() {
        return whatsnew;
    }

    public void setWhatsnew(String whatsnew) {
        this.whatsnew = whatsnew == null ? null : whatsnew.trim();
    }
}