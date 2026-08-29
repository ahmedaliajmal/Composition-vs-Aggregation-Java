//A Composition Cotains ( HAS-A ) Relationship where the Part cannot Exist independently

public class Main {
    public static void main( String[] args){
        Car Car1 = new Car();
        Car Car2 = new Car(2008,19000, "V8");

        System.out.println(Car1);
        System.out.println(Car2);

        //EXPECTED OUTPUT 
        //The Model Year is ( 0 ) and the price is ( 0 ) and the eninge is null
        //The Model Year is ( 2008 ) and the price is ( 19000 ) and the eninge is V8
    }
}
