package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by bhlewka on 10/10/17.
 */

//addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet || done
//getTweets() -- sould return a list of tweets in chronological order || done
//hasTweets() -- should return true if there is a tweet that equals() another tweet || done
//getCount() -- should accurately count up the tweets ||  done


public class TweetList {

    public TweetList(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // add tweet toa list of tweets
    public void addTweet(Tweet tweet){
        if (this.hasTweets(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
    }

    // delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public boolean hasTweets(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }
    public int getCount(){

        return tweets.size();
    }

    public TweetList getTweets(){

        ArrayList<Tweet> sorted = tweets;

        Collections.sort(sorted, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
                return lhs.getDate().compareTo(rhs.getDate());
            }
        });

        // From https://stackoverflow.com/questions/32160742/how-to-sort-arraylistobject-in-ascending-order-android


        return new TweetList(sorted);
    }
}
