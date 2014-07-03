package com.test.good;

/**
 * Created by Elena on 02.07.2014.
 */
public class Laptop extends Good {

    private String processor;
    private String videoCard;


    public Laptop() {
    }

    public Laptop(String processor, String videoCard) {
        this.processor = processor;
        this.videoCard = videoCard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " "
                + "\nPrice: " + getPrice() + " "
                + "\nProcessor: " + getProcessor() + " "
                + "\nVideo card: " + getVideoCard();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (processor != null ? !processor.equals(laptop.processor) : laptop.processor != null) return false;
        if (videoCard != null ? !videoCard.equals(laptop.videoCard) : laptop.videoCard != null) return false;

        return true;
    }
}
