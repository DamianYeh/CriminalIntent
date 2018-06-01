package com.damianyeh.android.criminalintent; /**
 * Created by Usuario on 16/04/2018.
 */
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private Boolean mSolved;

        public Crime(){

            mId = UUID.randomUUID();
            mDate = new Date();
        }


        public UUID getId(){

            return mId;
        }

        public void setmId (UUID mId) {this.mId = mId; }

        public String getTitle() {return mTitle;}

        public void setTitle (String Title) {this.mTitle = Title;}

        public Date getDate() {return mDate;}

        public void setDate(Date date) {this.mDate = date;}

        public Boolean isSolved() {return mSolved;}

        public void setSolved (Boolean solved) {this.mSolved = solved;}
}
