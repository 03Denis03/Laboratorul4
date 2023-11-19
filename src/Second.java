public class Second {
    public static void main(String[] args) {
        Apartament myApart = new Apartament();
        House myHouse = new House();
        myHouse.setNoOfRooms(5);
        myHouse.setNoOfFloors(2);
        int houseR = myHouse.getNoOfRooms();
        int houseF = myHouse.getNoOfFloors();
        int apartR = myApart.getNoOfRooms();
        int apartF = myApart.getNoOfFloors();
        System.out.println("Number Of Rooms(House): " + houseR + " Number of Floor(House): " + houseF);
        System.out.println("Number Of Rooms(apart): " + apartR + " Number of Floor(apart): " + apartF);
    }
}
