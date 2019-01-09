/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClassHistory;

import java.util.Date;

/**
 *
 * @author zhangchi
 */
public class Piece {
    private int Classid;
    private Date StartDate;
    private Date EndDate;
    private String Times;
    private static int coun;
    private int PieceID;
    
    public Piece(){
        this.StartDate = new Date();
        this.EndDate = new Date();
        this.Times = new String();
        this.PieceID = coun;
        coun++;
    }

    public int getClassid() {
        return Classid;
    }

    public int getPieceID() {
        return PieceID;
    }

    public void setClassid(int Classid) {
        this.Classid = Classid;
    }
    
    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    public String getTimes() {
        return Times;
    }

    public void setTimes(String Times) {
        this.Times = Times;
    }

    public static int getCoun() {
        return coun;
    }

    public static void setCoun(int coun) {
        Piece.coun = coun;
    }
    

}