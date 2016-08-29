package practice.generics;

public class DVD {
    private String dvdTitle;
    private String rate;

    public DVD(String dvdTitle, String rate) {
        this.dvdTitle = dvdTitle;
        this.rate = rate;
    }

    public String getDvdTitle() {
        return dvdTitle;
    }

    public void setDvdTitle(String dvdTitle) {
        this.dvdTitle = dvdTitle;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
