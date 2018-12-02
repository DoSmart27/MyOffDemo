package com.vvc.officerapp.presentation.login;

import android.content.Intent;
import android.view.View;

import com.vvc.officerapp.R;
import com.vvc.officerapp.common.BaseActivity;
import com.vvc.officerapp.presentation.home.HomeActivity;

public class LoginActivity extends BaseActivity {
    @Override
    public int setLayoutResource() {
        return R.layout.activity_login;
    }

    @Override
    public void initGUI() {

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            }
        });
    }

    @Override
    public void initData() {

    }
}
