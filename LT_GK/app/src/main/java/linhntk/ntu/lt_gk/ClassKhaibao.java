package linhntk.ntu.lt_gk;

public class ClassKhaibao {
    String Title, Content, Images;
    public ClassKhaibao(String T, String C,String I){
       Title = T;
       Content = C;
       Images = I;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getImages() {
        return Images;
    }

    public void setImages(String images) {
        Images = images;
    }
}
