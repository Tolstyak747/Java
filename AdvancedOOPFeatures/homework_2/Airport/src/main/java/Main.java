import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        Calendar calendar=Calendar.getInstance();
        Date date = calendar.getTime();
        calendar.add(Calendar.HOUR, 2);

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream().filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE)))
                .filter(x -> x.getDate().after(date) && x.getDate().before(calendar.getTime()))
                .collect(Collectors.toList());


    }

}