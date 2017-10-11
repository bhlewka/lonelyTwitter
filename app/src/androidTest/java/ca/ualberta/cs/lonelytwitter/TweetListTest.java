package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by bhlewka on 10/10/17.
 */

// Every method should start with test, otherwise they will not run lol
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweets(myTweet));

    }

    public void testDeleteTweet(){

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweets(myTweet));
    }

    public void testHasTweet(){

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse("Has the tweet", tweets.hasTweets(myTweet));

        tweets.addTweet(myTweet);

        assertTrue("Does not have the tweet", tweets.hasTweets(myTweet));

    }

    public void testGetTweet(){

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), myTweet.getMessage());

        assertEquals(returnedTweet.getDate(), myTweet.getDate());
        //Get tweet returns a tweet;

    }
}
