package com.yang.hancheng.beatbox;

import android.support.v4.app.Fragment;

/**
 * Project : BeatBox
 * Created by Hancheng Yang ( hancheng.yang@eptender.com )
 * Date : 20/03/2017, 15:42
 * Description :
 **/
public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
