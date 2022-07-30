package AdvancedJava.OOP.Abstraction.TrafficLights;

public class TrafficLight {
    private LightsColor currentColor;

    public TrafficLight(LightsColor currentColor) {
        this.currentColor = currentColor;
    }

    public LightsColor getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(LightsColor currentColor) {
        this.currentColor = currentColor;
    }

    public void changeColor() {
        if (getCurrentColor().equals(LightsColor.RED)) {
            this.currentColor = LightsColor.GREEN;
        } else if (getCurrentColor().equals(LightsColor.GREEN)) {
            this.currentColor = LightsColor.YELLOW;
        } else if (getCurrentColor().equals(LightsColor.YELLOW)) {
            this.currentColor = LightsColor.RED;
        }
    }
}
