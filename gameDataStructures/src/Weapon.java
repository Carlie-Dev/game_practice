import java.lang.*;

public class Weapon {
    private String type;
    private String action;

    public void setType(String type) {
        this.type = type;
    }
    public void setAction(String action){
        this.action = action;
    }
    public String getAction(){
        return this.action;
    }
    public String getType(){
        return this.type;
    }
    public String strike(){
        return this.type + " " + this.action;
    }

}
