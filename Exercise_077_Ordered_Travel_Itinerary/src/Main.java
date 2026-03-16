import java.util.LinkedList;
import java.util.Scanner;


record Place(String name, int distance) {

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {

        /* Ordered Travel Itinerary
        Create a list of places, ordered by distance from the starting point.
        Use a ListIterator to move both backwards and forwards through this ordered itinerary of places.

        Create a type that has a field for a town or place name and a field for storing the distance from the start.
        Next, create an itinerary of places or towns to visit.

        Create a LinkedList of your place or town type.
        Here, there is a list of a few places in Australia and their distances from Sydney.

            Town	        Distance from Sydney (in km)
            Adelaide	    1374
            Alice Springs	2771
            Brisbane	    917
            Darwin	        3972
            Melbourne	    877
            Perth	        3923

       Create a LinkedList ordered by the distance from the starting point, in this case, Sydney.
       Sydney should be the first element in your list.
       Don't allow duplicate places to be in your list for this data set.
       In addition, you'll create an interactive program with the following menu item options:

            Available actions (select word or letter):
            (F)orward
            (B)ackward
            (L)ist Places
            (M)enu
            (Q)uit
       */

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {

            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }

            if (!iterator.hasNext()) {
                System.out.println("Originating: " + iterator.previous());
                forward = false;
            }

            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");

                    if (!forward) {      // Reversing direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next(); // Adjust position forward
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    break;
                case "B":
                    System.out.println("User wants to go backwards");

                    if (forward) {      // Reversing direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous(); // Adjust position backwards
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }

                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place) {

        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;

        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    public static void printMenu() {

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}