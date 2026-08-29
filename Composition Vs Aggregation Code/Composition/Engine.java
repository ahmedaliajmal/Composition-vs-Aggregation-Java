public class Engine {
    private String Type;
    
    Engine(){
        //Null Constructor
    }  

    Engine(String type){
        this.Type = type;
    }

    public String toString(){
        String k = ""+this.Type;
        return k;
    }
}
