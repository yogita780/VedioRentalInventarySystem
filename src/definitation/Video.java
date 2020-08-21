/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 21-08-2020
 *   Time: 19:07
 *   File: Video.java
 */

package definitation;

public class Video {
    //member variables=fields or variable of class.
    //creating definition class in java.
    //rules for creating fields.
    //1. set the visibility modifier to private unless otherwise specified.
    //2. set the access modifier to private unless otherwise specified.
    private String videoName;
    private boolean checkOut;
    private int rating;

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /*
     * public <am:sameAsTheField> void set<NameOfTheField>(<sameAsTheField>){}
     */
    public String getVideoName() {
        return videoName;
    }

    // we can create special types of method to access these fields outside the class.
    //1. Getter method/observer methods/accessor methods.
    //we can use the getter methods to access the fields i.e read it.
    //2.setter method/transformer method/mutator method.
    // we can use the setter method to set the values of fields.i.e write it.
    //3.constructor methods:
    //we can use the constructor method to initailize the attributes of an object.
    // two types of programmer defined constructor.
    //1.non-parameterized:it as no parameter
    public Video() {
        this.videoName = "Siva G:THE BOSS";
        this.rating = 5;
        this.checkOut = true;
    }

    //2.parameterized:it would have some parameter.
    public Video(String videoName, int rating) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = true;
    }

    /*
     *public <noAccessModifier> <noReturnType> <NameOfTheClass>(){}
     *
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName;

    }

    public int getRating() {
        return rating;
    }

    //exception for booleans:the getter method starts with is instead od get.
    public boolean isCheckOut() {
        return checkOut;
    }
    /*
     *
     * public <am:sameAsTheFields> <rt:sameAsTheFields> get<NameOfTheField>(){}
     */
}
