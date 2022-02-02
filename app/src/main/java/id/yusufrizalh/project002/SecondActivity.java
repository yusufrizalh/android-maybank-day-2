package id.yusufrizalh.project002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button btn_back_to_main_activity, btn_to_third_activity;
    private TextView txt_display_fullname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_back_to_main_activity = findViewById(R.id.btn_back_to_main_activity);
        btn_to_third_activity = findViewById(R.id.btn_to_third_activity);
        txt_display_fullname = findViewById(R.id.txt_display_fullname);

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

        // menerima data dari MainActivity
        Intent receiveIntent = getIntent();
        String display_fullname = receiveIntent.getStringExtra("fullname");

        // menampilkan data yang diterima
        txt_display_fullname.setText(display_fullname);
    }
}