package com.apllication.myapplication_1301208552;

public class MobilList {
    String tittle,desc,content1,content2;
    int image;



    public MobilList(String tittle, String desc, String content1, String content2, int image) {
        this.tittle = tittle;
        this.desc = desc;
        this.content1 = content1;
        this.content2 = content2;
        this.image = image;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
