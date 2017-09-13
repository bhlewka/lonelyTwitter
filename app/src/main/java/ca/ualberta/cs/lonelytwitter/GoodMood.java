package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bhlewka on 9/12/17.
 */

public class GoodMood extends Mood{



    public GoodMood(Date date) {
        super(date);
    }

    public GoodMood() {
        super();
    }

    public String returnMood(){
        return "This a good mood";
    }
}
