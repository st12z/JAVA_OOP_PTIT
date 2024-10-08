/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07084;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author T
 */
public class TimeOnl implements Comparable<TimeOnl>{
    private String ten;
    private Date timeStart,timeEnd;
    private long totalTime;

    public TimeOnl(String ten, Date timeStart, Date timeEnd) {
        this.ten = ten;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.totalTime =(timeEnd.getTime()- timeStart.getTime())/(1000*60);
    }

    @Override
    public int compareTo(TimeOnl o) {
        if(this.totalTime<o.totalTime){
            return 1;
        }
        if(this.totalTime>o.totalTime){
            return -1;
        }
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ten+" "+totalTime;
    }
    
}
