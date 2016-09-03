package com.example.hasibuzzaman.fragment_viewpager;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    TextView bd1,bd2,bd3,sonar_bangla;
    ViewPager viewPager;MyAdatpter myAdatpter;
    SlidingTabLayout pagerSlidingTab ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bd1 = (TextView) findViewById(R.id.border1);
        bd2= (TextView) findViewById(R.id.border2);
        bd3 = (TextView) findViewById(R.id.border3);

        Typeface font= Typeface.createFromAsset(getAssets(), "kalpurush.ttf");
        bd1.setTypeface(font);

        bd3 = (TextView) findViewById(R.id.border3);
        bd2.setVisibility(View.INVISIBLE);
        bd3.setVisibility(View.INVISIBLE);

        viewPager = (ViewPager) findViewById(R.id.fragmentHolder);
        myAdatpter = new MyAdatpter(getSupportFragmentManager(),getLayoutInflater());
        viewPager.setAdapter(myAdatpter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch(position)
                {
                    case 0:
                        bd1.setVisibility(View.VISIBLE);
                        bd2.setVisibility(View.INVISIBLE);
                        bd3.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        bd2.setVisibility(View.VISIBLE);
                        bd1.setVisibility(View.INVISIBLE);
                        bd3.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        bd3.setVisibility(View.VISIBLE);
                        bd2.setVisibility(View.INVISIBLE);
                        bd1.setVisibility(View.INVISIBLE);
                        break;


                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        pagerSlidingTab = (SlidingTabLayout) findViewById(R.id.pagersliding);

        pagerSlidingTab.setDistributeEvenly(true);
        pagerSlidingTab.setViewPager(viewPager);


       /* pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.pagersliding);

        pagerSlidingTabStrip.setViewPager(viewPager);

        pagerSlidingTabStrip.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                TextView tv = (TextView) findViewById(pagerSlidingTabStrip.get);
                tv.setTextColor(Color.WHITE);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
*/

      /*  fragmentManager = getSupportFragmentManager();
        fragmentTransaction= fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragmentHolder,new BlankFragment());

        fragmentTransaction.commit();
*/
    }

    public void change(View view) {
        int id = view.getId();
      //  FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        switch (id)
        {
            case R.id.button:
                viewPager.setCurrentItem(0);
                Button btn = (Button) findViewById(R.id.button);
                bd1.setVisibility(View.VISIBLE);
                bd2.setVisibility(View.INVISIBLE);
                bd3.setVisibility(View.INVISIBLE);

                break;
            case R.id.button2:
              /*  fragmentTransaction.replace(R.id.fragmentHolder,new Fragment2());
                fragmentTransaction.commit();*/
                viewPager.setCurrentItem(1);
                Button btn2 = (Button) findViewById(R.id.button2);
                bd2.setVisibility(View.VISIBLE);
                bd1.setVisibility(View.INVISIBLE);
                bd3.setVisibility(View.INVISIBLE);
                break;
            case R.id.button3:
               /* fragmentTransaction.replace(R.id.fragmentHolder,new Fragment3());
                fragmentTransaction.commit();
                Button btn3 = (Button) findViewById(R.id.button3);*/
                viewPager.setCurrentItem(2);
                bd3.setVisibility(View.VISIBLE);
                bd2.setVisibility(View.INVISIBLE);
                bd1.setVisibility(View.INVISIBLE);
                break;
        }


    }
}
