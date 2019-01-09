/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClassHistory;

import java.util.ArrayList;

/**
 *
 * @author zhangchi
 */
public class ClassHistory {
    private ArrayList<Piece> classhistory;
    public ClassHistory(){
        this.classhistory = new ArrayList();
    }

    public ArrayList<Piece> getClasshistory() {
        return classhistory;
    }

    public void setClasshistory(ArrayList<Piece> classhistory) {
        this.classhistory = classhistory;
    }
    
    public Piece addPiece(int Classid){
        Piece piece = new Piece();
        piece.setClassid(Classid);
        classhistory.add(piece);
        return piece;
    }
            
}
