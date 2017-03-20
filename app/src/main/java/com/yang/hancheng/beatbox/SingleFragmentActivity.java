package com.yang.hancheng.beatbox;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Project : BeatBox
 * Created by Hancheng Yang ( hancheng.yang@eptender.com )
 * Date : 20/03/2017, 15:33
 * Description :
 **/
public abstract class SingleFragmentActivity extends AppCompatActivity {

    private FragmentManager fm;
    private Fragment mFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_single);
        fm = getSupportFragmentManager();
        mFragment = fm.findFragmentById(R.id.fragment_container);
        if(mFragment == null) {
            mFragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, mFragment).commit();
        }
    }

    protected abstract Fragment createFragment();
}
