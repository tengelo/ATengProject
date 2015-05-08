import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
/**
 * The test class ClimbingClubTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClimbingClubTest
{
    ClimbingClub hikerClub, hikerClub2;
    
    /**
     * Default constructor for test class ClimbingClubTest
     */
    public ClimbingClubTest()
    {
         
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        hikerClub= new ClimbingClub();
        
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        
        hikerClub2= new ClimbingClub();
        hikerClub2.addClimbSorted("Monadnock", 274);
        hikerClub2.addClimbSorted("Whiteface", 301);
        hikerClub2.addClimbSorted("Algonquin", 225);
        hikerClub2.addClimbSorted("Monadnock", 344);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAddClimbNamesAsEntered()
    {
        List<ClimbInfo> climbList = hikerClub.getClimbList();
        String[] climbNames = new String[climbList.size()];
        for(int i=0;i< climbList.size();i++)
            climbNames[i]=climbList.get(i).getName();
        String[] expected ={"Monadnock","Whiteface","Algonquin","Monadnock"};
        assertArrayEquals(expected,climbNames);
    }
    
    @Test
    public void testAddClimbTimesAsEntered()
    {
        List<ClimbInfo> climbList = hikerClub.getClimbList();
        int[] climbTimes = new int[climbList.size()];
        for(int i=0;i< climbList.size();i++)
            climbTimes[i]=climbList.get(i).getTime();
        int[] expected ={274,301,225,344};
        assertArrayEquals(expected,climbTimes);
    }
    
    @Test
    public void testAddClimbSorted()
    {        
        List<ClimbInfo> climbList = hikerClub2.getClimbList();
        String[] climbNames = new String[climbList.size()];
        for(int i=0;i< climbList.size();i++)
            climbNames[i]=climbList.get(i).getName();
        String[] expected ={"Algonquin","Monadnock","Monadnock","Whiteface"};
        assertArrayEquals(expected,climbNames);
    }
    
    @Test
    public void testAddClimbTimesSorted()
    {
        List<ClimbInfo> climbList = hikerClub2.getClimbList();
        int[] climbTimes = new int[climbList.size()];
        for(int i=0;i< climbList.size();i++)
            climbTimes[i]=climbList.get(i).getTime();
        int[] expected ={225,344,274,301};
        assertArrayEquals(expected,climbTimes);
    }
    
    @Test
    public void testDistinctPeakNamesAsEntered()
    {
        int numNames = hikerClub.distinctPeakNames();
        assertEquals(3, hikerClub.distinctPeakNames());
    }

    @Test
    public void testDistinctPeakNamesSorted()
    {
        int numNames = hikerClub2.distinctPeakNames();
        assertEquals(3, hikerClub2.distinctPeakNames());
    }

    
}




