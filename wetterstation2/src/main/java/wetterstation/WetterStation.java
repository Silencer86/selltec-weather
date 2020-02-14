package wetterstation;

import java.util.ArrayList;
import java.util.List;

class WetterStation {

    private List<Tag> tage;

    public WetterStation() {
        tage = new ArrayList<>();
    }

    public void addTag(int temperatur, Wetter wetter) {
        tage.add(new Tag(tage.size() + 1, temperatur, wetter));
    }

    public List<Tag> getTage() {
        return tage;
    }

    public double getDurchschnitt() {
        double summe = 0;

        for (Tag tag : tage) {
            summe += tag.getTemperatur();
        }

        return summe / tage.size();
    }

    public int getMax() {
        Integer max = null;

        for (Tag tag : tage) {
            if (max == null) {
                max = tag.getTemperatur();
            } else {
                max = Math.max(max, tag.getTemperatur());
            }
        }

        return max;
    }

    public int getMin() {
        Integer min = null;

        for (Tag tag : tage) {
            if (min == null) {
                min = tag.getTemperatur();
            } else {
                min = Math.min(min, tag.getTemperatur());
            }
        }

        return min;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Temp:");

        for (Tag tag : tage) {
            sb.append("\t");
            sb.append(tag.getTemperatur());
        }

        sb.append("\nTag: ");

        for (Tag tag : tage) {
            sb.append("\t");
            sb.append(tag.getTagImMonat());
        }

        return sb.toString();
    }

}