public class Car{ 
    private int modelyear; 
    private int price;
    private Engine enginetype; //Compostion (CAR CLASS HAS ENGINE OBJECT)

    Car(){
        //Null Constructor
    }

    Car(int modelyear , int price, String enginetype ){
        this.modelyear = modelyear;
        this.price = price;
        this.enginetype = new Engine(enginetype); // Here Composition is Done 
    }

    public String toString(){
        String s = "The Model Year is ( "+ this.modelyear+ " ) and the price is ( "+this.price+" ) and the eninge is "+this.enginetype;
        return s;
    }
}