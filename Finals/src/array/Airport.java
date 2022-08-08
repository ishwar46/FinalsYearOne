package array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of departure and arrival airports, find the itinerary in order. It may be assumed that departure
// is scheduled from every airport except the final destination, and each airport is visited only once,
// i.e., there are no cycles in the route.
public class Airport {
    // Function to print the itinerary starting from a given source `src`
    private static void printItinerary(Map<String, String> map, String src)
    {
        String dest = map.get(src);
        if (dest == null) {
            return;
        }

        System.out.println(src + " —> " + dest);
        printItinerary(map, dest);
    }

    // Function to find the itinerary from the given list of departure
    // and arrival airports
    private static void findItinerary(String[][] input)
    {
        // construct a map from the given list of tickets (departure —> arrival)
        Map<String, String> tickets = Stream.of(input)
                .collect(Collectors.toMap(p -> p[0], p -> p[1]));

        // construct a set of destination airports
        Set<String> destinations = new HashSet<>(tickets.values());

        // consider each departure airport to find the source airport
        for (String airport: tickets.keySet())
        {
            // source airport will not be present in the list of destination airports
            if (!destinations.contains(airport))
            {
                // when the source airport is found, print the itinerary
                printItinerary(tickets, airport);
                return;
            }
        }
    }

    public static void main(String[] args)
    {
        // input: list of tickets
        String[][] input = new String[][]{
                {"LAX", "DXB"},
                {"DFW", "JFK"},
                {"LHR", "DFW"},
                {"JFK", "LAX"}
        };

        findItinerary(input);
    }
}
