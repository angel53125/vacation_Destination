package com.hfad.vacationdestination;

public class VacationDestiation {
    private String placeName;
    private int imageID;

    public VacationDestiation(String n, int id)
    {
       placeName = n;
       imageID = id;
    }


    public String getPlaceName() {
        return placeName;
    }


    public int getImageID() {
        return imageID;
    }
}
