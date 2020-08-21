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

    // we can create special types of method to access these fields outside the class.
    //1. Getter method/observer methods/accessor methods.
    //we can use the getter methods to access the fields i.e read it.
    public String getVideoName() {
        return videoName;
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
