/*   Created by IntelliJ IDEA.
 *   Author: Yogita Balyan(Yogita780)
 *   Date: 21-08-2020
 *   Time: 19:16
 *   File: Main.java
 */

package execution;

import definitation.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("I,Robot", 4);//default constructor:created by compiler.
        System.out.println(
                "Video Name:" + video.getVideoName() + "," +
                        "Video Rating:" + video.getRating() + "," +
                        "Video CheckOut:" + video.isCheckOut() + "."
        );
    }
}
