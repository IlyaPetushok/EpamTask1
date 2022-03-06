package java.by.petushokilya.entity;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayParametrs {
    private OptionalInt max;
    private OptionalInt min;
    private int sum;
    private OptionalDouble average;

    public CustomArrayParametrs() {
    }

    public CustomArrayParametrs(OptionalInt max, OptionalInt min, int sum, OptionalDouble average) {
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.average = average;
    }

    public OptionalInt getMax() {
        return max;
    }

    public void setMax(OptionalInt max) {
        this.max = max;
    }

    public OptionalInt getMin() {
        return min;
    }

    public void setMin(OptionalInt min) {
        this.min = min;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public OptionalDouble getAverage() {
        return average;
    }

    public void setAverage(OptionalDouble average) {
        this.average = average;
    }
}
