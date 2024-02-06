public class ParkingLot {

  private String[] spots;
  private int nextAvailableSpot;

  public ParkingLot(int amountOfSpots) {
    this.spots = new String[amountOfSpots];
    this.nextAvailableSpot = 0;
  }

  public void fillNextSpot(String nameOfCar) {
    if (!isFull()) {
      spots[nextAvailableSpot] = nameOfCar;
      nextAvailableSpot++;
    }
  }

  public void freeLastSpot() {
    if(!isEmpty()) {
      spots[nextAvailableSpot - 1] = null;
      nestAvailableSpot--; 
    }
  }

  public int getNextSpot() {
    return this.nextAvailableSpot;
  }

  public void viewCarsInLot() {
    for(int i = 0; i < spots.length; i++) {
      if (spots[i] != null) {
        System.out.println(spots[i]);
      }
    }
  }

  private boolean isEmpty() {
    return nextAvailableSpot == 0;
  }

  private boolean isFull() {
    return nextAvailableSpot == spots.length;
  }
}
