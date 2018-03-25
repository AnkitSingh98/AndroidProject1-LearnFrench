package org.learn.dellse.learnfrench;

/**
 * Created by DellSe on 04-11-2016.
 */
public class contents {

    private String cont;
    private String mimageId;
    contents(String c,String imageId)
    {
        cont=c;
        mimageId=imageId;
    }
    public String getcont()
    {
        return cont;
    }

    public String getMImageId()
    {
        return mimageId;
    }
}
