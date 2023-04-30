import java.sql.Date;

import javax.xml.crypto.Data;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dataCreated;

    protected GeometricObject(){
        dataCreated = new Date(0);
    }
    protected GeometricObject(String color, boolean filled){
        dataCreated = new Date(0);
        this.color=color;
        this.filled=filled;
    }



    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public Data getDataCreated(){
        return (Data) dataCreated;
    }

    public String tosString(){
        return("created on " + dataCreated + "\n Color " + color + " and filled " + filled);
    }


}
