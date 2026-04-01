/**
 * ==========================================================
 * MAIN CLASS - UseCase3InventorySetup
 * ==========================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * @version 3.1
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        // Create inventory
        RoomInventory inventory = new RoomInventory();

        System.out.println("Hotel Room Inventory Status\n");

        // Display Single Room
        System.out.println("Single Room:");
        System.out.println("Beds: 1");
        System.out.println("Size: 250 sqft");
        System.out.println("Price per night: 1500.0");
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Single"));

        System.out.println();

        // Display Double Room
        System.out.println("Double Room:");
        System.out.println("Beds: 2");
        System.out.println("Size: 400 sqft");
        System.out.println("Price per night: 2500.0");
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Double"));

        System.out.println();

        // Display Suite Room
        System.out.println("Suite Room:");
        System.out.println("Beds: 3");
        System.out.println("Size: 750 sqft");
        System.out.println("Price per night: 5000.0");
        System.out.println("Available Rooms: " +
                inventory.getRoomAvailability().get("Suite"));
    }
}