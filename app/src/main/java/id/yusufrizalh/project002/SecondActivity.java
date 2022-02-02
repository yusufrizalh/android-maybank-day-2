package id.yusufrizalh.project002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button btn_back_to_main_activity, btn_to_third_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_back_to_main_activity = findViewById(R.id.btn_back_to_main_activity);
        btn_to_third_activity = findViewById(R.id.btn_to_third_activity);

        btn_back_to_main_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });

        btn_to_third_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });
    }
}