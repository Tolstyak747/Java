import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> st;

    @Override
    protected void setUp() throws Exception {
        st = new ArrayList<>();

        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        st.add(new Station("Морская", line));
        st.add(new Station("Речная", line));
        st.add(new Station("Чебуречная", line2));
        st.add(new Station("Лавашная", line2));
        st.add(new Station("Футбольная", line3));
        st.add(new Station("Баскетбольная", line3));

    }

    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(st);
        double expected = 14.5;
        assertEquals(expected, actual);
    }

    public void testGetShortestRoute(){

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


}
