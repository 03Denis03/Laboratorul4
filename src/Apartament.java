public class Apartament extends Construction{
    public Apartament(){
        Construction building = new Construction();
    }
    public void setNoOfRooms(int noOfRooms1){
        this.noOfRoom = noOfRooms1;
    }
    public int getNoOfRooms(){
        return noOfRoom;
    }
    public void setNoOfFloors(int noOfFloors1){
        this.noOfFloor = noOfFloors1;
    }
    public int getNoOfFloors(){
        return noOfFloor;
    }
}
