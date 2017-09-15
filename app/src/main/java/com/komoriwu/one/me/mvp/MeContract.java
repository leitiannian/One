package com.komoriwu.one.me.mvp;

import com.komoriwu.one.base.BasePresenter;
import com.komoriwu.one.base.BaseView;


/**
 * Created by KomoriWu
 *  on 2017/9/15.
 */

public interface MeContract {
    interface View extends BaseView {
    }

    interface Presenter extends BasePresenter<View> {
    }

}
