package Project1;
/**
 * 
 * @author RBCA-21-132
 *  @version(1)
 *  
 * <p><b>This class stimulates the working of Car</b></p>
 * <p>It does the following </p>
 * It gets the speed and computes it,<br>
 * when it is incremented,decremented and when the car is stopped
 *
 */
public class Car {
   String model;
   int speed;
   int manuf_year;
   /**
    * <p> Constructorr Car is been used to initialise the two attributes that is<br>
    * model and speed
    * @param model- used to get the name of car model
    * @param speed-used to get the speed of the car
    */
    Car (String model,int speed,int manuf_year)
    {
    	this.model=model;
    	this.speed=speed;
    	this.manuf_year=manuf_year;
    }
  
    	/**
    	 * <p>The method go_faster() is used to calculate the speed by incrementing it</p>
    	 * @param increment-value is used to add to  the speed
    	 */
    void go_faster(int increment)
    {
    	speed=speed+increment;
    }
    /**
     * <p>The method go_slower() is used to calculate the speed by incrementing it</p>
     * @param decrement-value is used to minus to  the speed
     */
    void go_slower(int decrement)
    {
    	speed=speed- decrement;
    }
    /**
     * <p>In stop_car the speed is set to zero <br>when the car is stopped</p>
     */
    void stop_car()
    {
    	speed=0;
    }
    /**
     * <p>This function get_speed()</p>
     * @return -returns the speed of the car
     */
    int get_speed()
    {
    	return speed;
    }
    /**
     * <p>This the the main function from where,execution of the program takes place</p>
     * @param args -take the arguments
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car C1=new Car("HONDA",60,2002);
       C1.go_faster(10);
       C1.go_slower(10);
       C1.stop_car();
       	C1.get_speed();
	}

}
