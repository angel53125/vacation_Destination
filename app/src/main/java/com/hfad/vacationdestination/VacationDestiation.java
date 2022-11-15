package com.hfad.vacationdestination;

public class VacationDestiation {
    private String placeName;
    private int imageID;



    private boolean favorite;

    public VacationDestiation(String n, int id,boolean fave)
    {
       placeName = n;
       imageID = id;
       favorite = fave;
    }

    public boolean getFave() {
        return favorite;
    }

    public void setFave(boolean favorite) {
        this.favorite = favorite;
    }


    public String getPlaceName() {
        return placeName;
    }


    public int getImageID() {
        return imageID;
    }
}
