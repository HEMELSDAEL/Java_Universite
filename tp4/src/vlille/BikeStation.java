package vlille;

public class BikeStation {

   /** array of slots for bikes in the station */
   private Bike[] bikes;
   /** name of the station */
   private String name;

   /**
    * Station with a specific capacity for bikes
    * @param name : name of the station
    * @param capacity : capacity of the station
    */
   public BikeStation(String name, int capacity) {
      this.name = name;
      this.bikes = new Bike[capacity];
      for(int i=0; i<this.bikes.length; i++){
         bikes[i]=null;
      }
   }

   /**
    * get the name of the station
    * @return the name of the station
    */
   public String getName() {
      return this.name;
   }

   /**
    * get the capacity of the station
    * @return the capacity of the station
    */
   public int getCapacity() {
      return this.bikes.length;
   }

   /**
    * get the number of bikes in the station
    * @return the number of bikes in the station
    */
   public int getNumberOfBikes() {
      int nbBikes = 0;
      for(Bike i : bikes){
         if (i!=null){
            nbBikes++;
         }
      }
      return nbBikes;
   }

   /**
    * indicates the index of the smallest free bicycle slot
    * @return the index of the smallest free bicyle slot
    */
   public int firstFreeSlot() {
      int free_space= -1;
      for (int i = bikes.length-1; i>=0; i--){
         if (bikes[i]==null){
            free_space= i;
         }
      }
      return free_space;
   }

   /**
    * drop off a bike in the station
    * @param bike : the bike was dropped off in the station
    * @return : true if the bike could be left in a free space otherwise false
    */
   public boolean dropBike(Bike bike) {
      if (this.firstFreeSlot()==-1){
         return false;
      }else{
         this.bikes[this.firstFreeSlot()] = bike;
         return true;
      }
   }

   /**
    * allows you to take a bike from a station 
    * @param i : position of the location where you try to take the bike
    * @return : the bike available at this location if it is available 
    * @throws BikeNotAvailableException : the exception that is raised if there is no bike at the requested location or the location does not exist
    */
   public Bike takeBike(int i) throws BikeNotAvailableException {
      if(i<0 || i>this.bikes.length || this.bikes[i]==null){
         throw new BikeNotAvailableException("error");
      }else{
         Bike free = this.bikes[i];
         this.bikes[i]=null;
         return free;
      }

   }

}
