/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Session;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Jyoti
 */
public class SessionHistory {

    private LinkedList<Long> sessionList = null;
  
    
    public SessionHistory(){
        sessionList = new LinkedList<>();
    }

    public LinkedList<Long> getSessionList() {
        return sessionList;
    }

//    public void setSessionList(LinkedList<Long> sessionList) {
//        this.sessionList = sessionList;
//    }
//    public static void main(String args[]){
//        
//          LinkedList<Long> sessionListl = new LinkedList();  
//         sessionListl.add(1L);
//         sessionListl.add(2L);
//         sessionListl.add(3L);
//         
//         System.out.println(sessionListl.getFirst().toString()
//                 
//         +sessionListl.getLast()
//         );
//         
//         
//         
//    }   
}
