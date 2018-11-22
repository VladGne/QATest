package ObjectBasic.Task2;

class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private final int maxSecondsValue = 59;
    private final int minValue = 0;
    private final int maxHoursValue = 23;
    private final int defaultHoursValue = 12;
    private final int borderValue = 10;

    private int secondsToMinutesMultyplier = 60;
    private int secondsToHoursMultyplier = 3600;

    public Clock(){
        this.hours = defaultHoursValue;
        this.minutes = minValue;
        this.seconds = minValue;
    }

    public Clock(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int seconds){
        setClock(seconds);
    }

    public Clock addClock(Clock clock){

        int currentSeconds = this.seconds + this.minutes * secondsToMinutesMultyplier + this.hours * secondsToHoursMultyplier;
        int additionSeconds = clock.seconds + clock.minutes * secondsToMinutesMultyplier + clock.hours * secondsToHoursMultyplier;
        currentSeconds += additionSeconds;

        setClock(currentSeconds);

        return new Clock(this.hours, this.minutes, this.seconds);
    }

    public Clock subtractClock(Clock clock){

        int currentSeconds = this.seconds + this.minutes * secondsToMinutesMultyplier + this.hours * secondsToHoursMultyplier;
        int additionSeconds = clock.seconds + clock.minutes * secondsToMinutesMultyplier + clock.hours * secondsToHoursMultyplier;
        currentSeconds -= additionSeconds;

        setClock(currentSeconds);

        return new Clock(this.hours, this.minutes, this.seconds);
    }

    public void setClock(int seconds){
        this.hours = seconds / secondsToHoursMultyplier;
        this.minutes = seconds / secondsToMinutesMultyplier % secondsToMinutesMultyplier;
        this.seconds = seconds % secondsToMinutesMultyplier;
    }

    public void tick(){
        if(seconds > maxSecondsValue-1){
            seconds = minValue;

            if(minutes > maxSecondsValue-1){
                minutes = minValue;

                if(hours > maxHoursValue){
                    hours = minValue;
                    minutes = minValue;
                    seconds = minValue;
                }
                else{
                    hours++;
                }
            }
            else{
                minutes++;
            }
        }
        else{
            seconds++;
        }
    }

    public void tickDown(){
        if(seconds == minValue && (minutes > minValue || hours > minValue)){
            seconds = maxSecondsValue;

            if(minutes == minValue && hours > minValue){
                minutes = maxSecondsValue;
                hours--;
            }
            else{
                minutes--;
            }
        }

        else if (hours == minValue && minutes == minValue && seconds == minValue){
            hours = maxHoursValue;
            minutes = maxSecondsValue-1;
            seconds = maxSecondsValue-1;
        }
        else {
            seconds--;
        }
    }

    public String getTime(){
        String hours;
        String minutes;
        String seconds;

        if(this.hours < borderValue)
            hours = minValue + Integer.toString(this.hours);
        else
            hours = Integer.toString(this.hours);

        if(this.minutes < borderValue)
            minutes = minValue + Integer.toString(this.minutes);
        else
            minutes = Integer.toString(this.minutes);

        if(this.seconds < borderValue)
            seconds = minValue + Integer.toString(this.seconds);
        else
            seconds = Integer.toString(this.seconds);

        return String.format("%s:%s:%s", hours, minutes, seconds);
    }
}