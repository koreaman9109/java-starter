class Time {
    private int hour;
    private int minunte;
    private float second;
    
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour < 0  || hour > 23) return;
        this.hour = hour;
    }
    public int getMinunte() {
        return minunte;
    }
    public void setMinunte(int minunte) {
        if(minunte < 0 || minunte > 59) return;
        this.minunte = minunte;

    }
    public float getSecond() {
        return second;
    }
    public void setSecond(float second) {
        if(second < 0.0f || second > 59.99f)return;
        this.second = second;
    }

    

}

class Test{
    public static void main(String[] args) {

        Time time = new Time();
        time.setHour(24);
        time.setMinunte(22);
        
        System.out.println(time.getHour());
    }
}
