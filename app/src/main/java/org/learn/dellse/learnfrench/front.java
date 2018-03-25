package org.learn.dellse.learnfrench;

/**
 * Created by DellSe on 07-11-2016.
 */
public class front {

    private String cont;
    private int mimageId;
    front(String c,int imageId)
    {
        cont=c;
        mimageId=imageId;
    }
    public String getcont()
    {
        return cont;
    }

    public int getMImageId()
    {
        return mimageId;
    }
}
