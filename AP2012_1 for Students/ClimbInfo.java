public class ClimbInfo
{
    String name;
    int time;

    /**
     * Creates <code>ClimbInfo</code> object with name <code>peakName</code> and time <code>climbTime</code>.
     * @param peakName the name of the mountain peak
     * @param climbTime the number of minutes taken to complete the climb
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        name = peakName;
        time = climbTime;
    }

    /** @return the name of the mountain peak
     */
    public String getName()
    {
        return name;
    }
    
    /** @return the number of minutes taken to complete the climb
     */
    public int getTime()
    {
        return time;
    }
    
}
