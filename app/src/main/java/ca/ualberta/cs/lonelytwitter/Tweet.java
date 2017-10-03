

/*
 * Tweet
 *
 * Version 1
 *
 *
 *
 * Copyright 2017 Team X. CMPUT 301 Blah Blah Blah the text is too small and I cannot read it
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 *
 * @author watts01
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweetable
 */

public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();


    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     *tweets a message
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();


    /**
     * sets tweet message
     *
     * @param message message
     * @throws TweetTooLongException tweet too long
     */


    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * returns message
     *
     * @return message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * get date
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the date
     *
     * @param date date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * returns the date
     *
     * @return date
     */

    @Override
    public String toString(){
        return date.toString();
    }
}
