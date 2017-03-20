package com.yang.hancheng.beatbox;

/**
 * Project : BeatBox
 * Created by Hancheng Yang ( hancheng.yang@eptender.com )
 * Date : 20/03/2017, 17:42
 * Description :
 **/
public class Sound {

    private String mAssetPath;
    private String mName;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

}
