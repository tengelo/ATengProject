
import java.util.*;

public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
     * Guaranteed not to be <code>null</code>.  Contains only non-<code>null</code> references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new <code>ClimbingClub</code> object. */  
    public ClimbingClub()
    {  climbList = new ArrayList<ClimbInfo>();}

    /**added for testing */
    public List<ClimbInfo> getClimbList(){
        return climbList;
    }

    /** Adds a new climb with <code>peakName</code> and time <code>climbTime</code> to the list of climbs.
     * @param  peakName the name of the mountain peak climbed
     * @param  climbTime the number of minutes taken to complet the climb 
     */
    public void addClimb(String peakName, int climbTime)
    {
        ClimbInfo newClimb=new ClimbInfo(peakName, climbTime);
        climbList.add(newClimb);

    }

    public void addClimbSorted(String peakName, int climbTime)
    {
        ClimbInfo newClimb=new ClimbInfo(peakName, climbTime);
        for(int i=0; i<climbList.size(); i++){
            if(peakName.compareTo(climbList.get(i).getName())<=0){
                climbList.add(i,newClimb);
                return;
            }
        }
        climbList.add(newClimb);

    }
    public int distinctPeakNames()
    {
        if(climbList.size() == 0)
        {
            return 0;
        }

        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;

        for (int k = 1; k < climbList.size(); k++)
        {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0)
            {
                numNames++;
                prevName = currName;
            }

        }
        return numNames;
    }

    public ClimbInfo getClimbInfo(int pos)
    {
        return climbList.get(pos);  
    }
}
