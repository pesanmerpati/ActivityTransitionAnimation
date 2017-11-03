package com.dev.rohmts.activitytransitionanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_up, bt_down, bt_left, bt_right, bt_default;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        bt_up = findViewById(R.id.button_up);
        bt_down = findViewById(R.id.button_down);
        bt_left = findViewById(R.id.button_left);
        bt_right = findViewById(R.id.button_right);
        bt_default = findViewById(R.id.button);

        bt_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_to_up, R.anim.slide_out_up);
            }
        });

        bt_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_to_down, R.anim.slide_out_down);
            }
        });

        bt_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_to_left, R.anim.slide_from_right);
            }
        });

        bt_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_to_right, R.anim.slide_from_left);
            }
        });

        bt_default.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }


}
