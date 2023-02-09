package com.savevideos.allvideodownloader;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.WindowManager;
import com.rd.PageIndicatorView;

public class HomeSceenActivity extends FragmentActivity {
    PageIndicatorView pageIndicatorView;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sceen);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        pager = findViewById(R.id.viewpager);
        pageIndicatorView = findViewById(R.id.pageIndicatorView);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

    }
    public class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }
        @NonNull
        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new FirstFragment();
            }else if (position == 1)
                return new SecondFragment();
            return new FirstFragment();
        }
        @Override
        public int getCount() {
            return 2;
        }
    }
}
