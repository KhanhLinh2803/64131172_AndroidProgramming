package linhntk.ntu.copy;

public class Item {
    String Tieude;
    String Linkhinh;

    public Item(String tieude, String linkhinh) {
        Tieude = tieude;
        Linkhinh = linkhinh;
    }

    public String getTieude() {
        return Tieude;
    }

    public void setTieude(String tieude) {
        Tieude = tieude;
    }

    public String getLinkhinh() {
        return Linkhinh;
    }

    public void setLinkhinh(String linkhinh) {
        Linkhinh = linkhinh;
    }
}
