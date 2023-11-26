package com.example.designpatten.struct.hook;

import android.view.View;
import android.widget.Toast;

/**
 * create by apple
 * create on 2021/6/27
 * description
 */
class MyClickListener implements View.OnClickListener {
    private View.OnClickListener onClickListener;

    public MyClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "系统OnClickListener已经被我替换啦", Toast.LENGTH_SHORT).show();

        onClickListener.onClick(v);
    }
}
