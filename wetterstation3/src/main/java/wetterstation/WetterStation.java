package wetterstation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.List;

class WetterStation {

    private List<Tag> tage;

    public WetterStation() {
        tage = new ArrayList<>();
    }

    public void addTag(int temperatur, Wetter wetter, String date) {
    	//TODO
    }

    public List<Tag> getTage() {
        return tage;
    }

    public double getDurchschnitt() {
    	//TODO
        return 0;
    }

    public int getMax() {
        //TODO
        return 0;
    }

    public int getMin() {
    	//TODO
        return 0;
    }

    public String toString() {
    	//TODO
    	return "TODO";
    }

}