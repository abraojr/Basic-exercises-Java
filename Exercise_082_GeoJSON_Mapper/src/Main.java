import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Interface Challenge: Geo JSON Mapper
            1.  Create a Mappable Interface.
            The interface should force classes to implement three methods.
                -   One method should return a label (how the item will be described on the map).
                -   One should return a geometry type (POINT or LINE) which is what the type will look like on the map.
                -   The last should return an icon type (sometimes called a map marker).

            In addition to the three methods described, the interface should also include:
                -   A constant String value called JSON_PROPERTY, which is equal to: "properties":{%s}.  A hint here, using a text block will help maintain quotation
                    marks in your output.
                -   Include a default method called toJSON() that prints out the type, label, and marker.  I'll show examples shortly.
                -   A static method, that takes a Mappable instance as an argument. This method should print out the properties for each mappable type, including
                    those mentioned above, but also any other fields on the business classes.

            2.  Create two classes that implement this interface, a Building and UtilityLine.
                -   One class, in this case the Building, should have a geometry type of POINT, and one class should have a geometry type of Line.
                    The UtilityLine class will be my example for a class that will be a LINE on a map.
                -   The Building will be shown on a city map, as a point with the icon and label specified and the Utility Line will be a line on the map.
        */

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House",
                UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }

    /* OUTPUT:
        "properties": {"type": "POINT", "label": "Sydney Town Hall (GOVERNMENT) ", "marker":"RED STAR"
        , "name": "Sydney Town Hall", "usage": "GOVERNMENT" }
        "properties": {"type": "POINT", "label": "Sydney Opera House (ENTERTAINMENT) ", "marker":"GREEN TRIANGLE"
        , "name": "Sydney Opera House", "usage": "ENTERTAINMENT" }
        "properties": {"type": "POINT", "label": "Stadium Australia (SPORTS) ", "marker":"ORANGE PUSH_PIN"
        , "name": "Stadium Australia", "usage": "SPORTS" }
        "properties": {"type": "LINE", "label": "College St (FIBER_OPTIC)", "marker":"GREEN DOTTED"
        , "name": "College St", "utility": "FIBER_OPTIC" }
        "properties": {"type": "LINE", "label": "Olympic Blvd (WATER)", "marker":"BLUE SOLID"
        , "name": "Olympic Blvd", "utility": "WATER" }
    */
}