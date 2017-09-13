package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bhlewka on 9/12/17.
 */

public abstract class Mood {

    private Date date;

    // This is a constructor that takes the date and sets it
    public Mood(Date date) {
        this.date = date;
    }
    //This is a constructor that sets a default date
    // Use function to set default date, something like date.now()
    // or could be a hard default date assuming i could create a date type
    public Mood(){
        this.date = new Date();
    }

    public void setDate(Date newDate){
        this.date = newDate;
    }

    public Date getDate(){
        return this.date;
    }

}

