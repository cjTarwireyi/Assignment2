/**
 * Created by student on 3/5/16.
 */
public class Hourly {
    public int getHrs(){
        return 40;
    }
    public double getRate(){

    return 25;
    }
    public double calcSal(){

        return getHrs()*getRate();
    }
}
