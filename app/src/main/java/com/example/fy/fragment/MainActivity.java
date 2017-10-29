package com.example.fy.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        replaceFragment(new RightFragment());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new AnotherRightFragment());
            }

            private void replaceFragment(AnotherRightFragment anotherRightFragment) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction transaction=fragmentManager.beginTransaction();
           //     transaction.replace(R.id.right_layout,anotherRightFragment);
                transaction.addToBackStack(null);//返回栈
                transaction.commit();
            }
        });
    }

    private void replaceFragment(RightFragment rightFragment) {
    }
}
