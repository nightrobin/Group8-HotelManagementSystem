import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class hotel {
    private final int noOfRooms = 30;
    private rooms rooms[] = new rooms[noOfRooms];

            public void reserveRoom(){
                    int roomType;
                    String cIdate;
                    String cOdate;

                    System.out.print("Room Type: ");
                    Scanner scanner = new Scanner(System.in);
                    int roomType = scanner.nextInt();

                    System.out.print("Check-in Date and Time?");
                    Scanner scanner = new Scanner(System.in);
                    String cIdate =new SimpleDateFormat("yyyy/mm/dd HH:mm:ss").parse(date);
                    System.out.println(cIdate);

                    System.out.print("Check-out Date and Time?");
                    Scanner scanner = new Scanner(System.in);
                    String cOdate =new SimpleDateFormat("yyyy/mm/dd").parse(date);
                    System.out.println(cOdate);

            }
            public void checkIn(){

            }
            public void checkOut(){

            }
            public void guestProfile(){

            }
            public void roomManagement(){;

                            for (int ctr = 0; ctr < noOfRooms; ctr++){
                                    String roomType;
                                    int roomNo;
                                    float price;
                                    int quantity;

                                    System.out.print("Room Type: ");
                                    Scanner scanner = new Scanner(System.in);
                                    roomType = scanner.nextLine();

                                    System.out.print("Room No.: ");
                                    roomNo = scanner.nextInt();

                                    System.out.print("Price: ");
                                    price = scanner.nextFloat();

                                    System.out.print("Quantity: ");
                                    quantity = scanner.nextInt();

                                    rooms[ctr] = new Room();
                                    rooms[ctr].roomType = roomType;
                                    rooms[ctr].roomNo = roomNo;
                                    rooms[ctr].price = price;
                                    rooms[ctr].quantity = quantity;
                                    rooms[ctr].isActive = true;

                                    System.out.println("=========================");
                            }

                    }
            }
