package com.damianyeh.android.criminalintent;
import android.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return new CrimeListFragment();
    }
}