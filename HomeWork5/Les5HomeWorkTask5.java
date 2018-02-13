/* Create class Car with fields type,
 * year of production and engine capacity.
 * Create and initialize four instances of class Car. 
 * Display cars certain model year  (enter year in the console);
ordered by the field year.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HomeWorkTask5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Give me numbers:");
        
        Car[] cars = new Car[4];
        cars[0] = new Car(CarType.GASOLINE, 1.2f);
        cars[1] = new Car(CarType.DIESEL, 2.0f);
        cars[2] = new Car(CarType.GASOLINE, 4.8f);
        cars[3] = new Car(CarType.DIESEL, 3.0f);
        
        for ( int i = 0; i < cars.length; i++) {
            cars[i].setYear(Integer.parseInt(br.readLine())); 
        }
        
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() < cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }

        for ( int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]); 
        }
             
    }

    enum CarType {
        DIESEL, GASOLINE;
    }

    public static class Car {
        private CarType type;
        private int year;
        private float engineCapacity;
        
        public Car(CarType type, float engineCapacity) {
            this.type = type;
            this.engineCapacity = engineCapacity;
        }
        
        public CarType getType() {
            return type;
        }

        public void setType(CarType type) {
            this.type = type;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public float getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(float engineCapacity) {
            this.engineCapacity = engineCapacity;
        }


        @Override
        public String toString() {
            return "Car " + getYear() + ", engine: " + getEngineCapacity() + ", " + getType();
        }
    }

}
