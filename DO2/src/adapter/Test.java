package adapter;

public class Test {

        public static void main(String[] args) {
          
          Vehicle car = new Car();
          Vehicle plane = new Plane();
          Vehicle train = new Train();
          Boat boat = new Boat();
          Vehicle boatAdapter = new BoatAdapter(boat);

          car.moveFaster();
          plane.moveFaster();
          train.moveFaster();
          boatAdapter.moveFaster();

        }

}
