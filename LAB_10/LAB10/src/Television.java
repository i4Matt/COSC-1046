// THE PURPOSE OF THIS CLASS IS TO MODEL A TELEVISION.
// MATTHEW HOULE on NOVEMBER 18, 2024

public class Television {
    // --- TASK 1 START --- //
    final String MANUFACTURER; // MANUFACTURER OF THE TV.
    final int SCREEN_SIZE; // SCREEN SIZE OF THE TV.

    boolean powerOn; // POWER OF THE TV.
    int channel, volume; // WHAT CHANNEL IS THE TV ON AND HOW LOUD IS IT.

    // --- TASK 1 FINISH --- //



    // --- TASK 2 START --- //
    // CONSTRUCTOR METHOD | WHEN CLASS IS CALLED THIS IS TO INITIALIZE
    public Television(String brand, int size){
        // SETS THE MANUFACTURER AND SIZE TO WHAT IS REQUESTED. 
        MANUFACTURER = brand;
        SCREEN_SIZE = size;

        // SETS THE DEFAULT FOR POWER VOLUME AND CHANNEL.
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    // --- TASK 2 FINISH --- //



    // --- TASK 3 START --- //

    // GETS THE CHANNEL WHEN CALLED
    public int getChannel(){
        return channel;
    }

    // GETS THE VOLUME WHEN CALLED
    public int getVolume(){
        return volume;
    }

    // GETS THE MANUFACTURER WHEN CALLED
    public String getManufacturer(){
        return MANUFACTURER;
    }

    // GETS THE SCREEN SIZE WHEN CALLED
    public int getScreenSize(){
        return SCREEN_SIZE;
    }

    // CHANGES THE CHANNEL TO WHAT IS REQUESTED
    public void setChannel(int station){
        channel = station;
    }

    // TURNS ON/OFF THE POWER BASED ON WHAT STATE IT'S IN
    public void power(){
        powerOn = !powerOn;
    }

    // INCREASES VOLUME BY ONE
    public void increaseVolume(){
        volume += 1;
    }

    // DECREASES VOLUME BY ONE
    public void decreaseVolume(){
        volume -= 1;
    }

    // --- TASK 3 FINISH --- //


    
}
