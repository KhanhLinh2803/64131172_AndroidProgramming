package linhntk.ntu.funwords;

public class item {
    String id_img;
    String id_button;

    public item(String id_button, String id_img) {
        this.id_button = id_button;
        this.id_img = id_img;
    }

    public String getId_img() {
        return id_img;
    }

    public void setId_img(String id_img) {
        this.id_img = id_img;
    }

    public String getId_button() {
        return id_button;
    }

    public void setId_button(String id_button) {
        this.id_button = id_button;
    }
}
