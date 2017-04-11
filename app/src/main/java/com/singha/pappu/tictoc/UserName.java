package com.singha.pappu.tictoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserName extends AppCompatActivity {
    EditText xUser;
    EditText oUser;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_name);

        xUser=(EditText)findViewById(R.id.xplayerName);
        oUser=(EditText)findViewById(R.id.oplayerName);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getstart();
            }
        });
    }

    private void getstart() {
        String xUserName=xUser.getText().toString().trim();
        String oUserName=oUser.getText().toString().trim();
        if(!TextUtils.isEmpty(xUserName)&& !TextUtils.isEmpty(oUserName))
        {

        }


    }
}
