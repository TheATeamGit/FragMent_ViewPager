package com.example.hasibuzzaman.fragment_viewpager;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Hasibuzzaman on 9/3/2016.
 */
public class MyAdatpter extends FragmentPagerAdapter {
   LayoutInflater layoutInflater;
    View view;
    TextView  bd1,bd2,bd3,sonar_bangla;
    String [] tabs;
    public MyAdatpter(FragmentManager fm, LayoutInflater layoutInflater) {


        super(fm);
        tabs = new String[]{
                "First","Second", "Third"
        };
        this.layoutInflater= layoutInflater;
        view= layoutInflater.inflate(R.layout.activity_main,null);
        bd1 = (TextView) view.findViewById(R.id.border1);
        bd2= (TextView) view.findViewById(R.id.border2);
        bd3 = (TextView) view.findViewById(R.id.border3);
        bd1.setText("ghora");
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0 :
               /* bd1.setVisibility(View.VISIBLE);
                bd2.setVisibility(View.INVISIBLE);
                bd3.setVisibility(View.INVISIBLE);*/
                bd1.setBackgroundColor(Color.RED);
                return  new BlankFragment();


            case 1 :
                bd2.setVisibility(View.VISIBLE);
                bd1.setVisibility(View.INVISIBLE);
                bd3.setVisibility(View.INVISIBLE);
                return new Fragment2();

            case 2 :
                bd3.setVisibility(View.VISIBLE);
                bd2.setVisibility(View.INVISIBLE);
                bd1.setVisibility(View.INVISIBLE);
                return new Fragment3();

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
