package com.komoriwu.one.me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.komoriwu.one.R;
import com.komoriwu.one.all.mvp.AllPresenter;
import com.komoriwu.one.base.MvpBaseFragment;

/**
 * Created by KomoriWu
 * on 2017/9/15.
 */

public class MeFragment extends MvpBaseFragment<AllPresenter>{
    @Override
    protected void initInject() {

    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me, null);
    }

    @Override
    public void init() {

    }
}
