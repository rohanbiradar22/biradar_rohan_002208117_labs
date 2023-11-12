/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author harshalneelkamal
 */

import data.DataStore;
import java.util.Map;
import model.Comment;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    public void getMaxLikeCommentPost(){
        DataStore data = DataStore.getInstance();
        Comment commentWithMaxLikes = null;
        
        for(Comment c : data.getComments().values()){
            if(commentWithMaxLikes =  null){
                commentWithMaxLikes - c;
            }
        }
    }
    
    
    
}
