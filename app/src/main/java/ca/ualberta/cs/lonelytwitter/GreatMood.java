package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bhlewka on 9/12/17.
 */

public class GreatMood extends Mood {

    public GreatMood(Date date) {
        super(date);
    }

    public GreatMood() {
        super();
    }

    public String returnMood(){
        return "This a great mood";
    }
}
