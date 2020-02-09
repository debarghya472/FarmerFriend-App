package com.example.farmerfriendapp.ui.home;

public class Image {
    private int himageid;
    private String hdes;
    public Image(int imageid,String des)
    {
        himageid=imageid;
        hdes=des;
    }

    public int getImageid( ) {
        return himageid;
    }
    public String getHdes()
    {
        return  hdes;
    }
}
