package id.yusufrizalh.project002;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast myToast = null;  // diberi nilai awal

    // Lifecycle Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToast = Toast.makeText(MainActivity.this, "onCreate Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        myToast = Toast.makeText(MainActivity.this, "onStart Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        myToast = Toast.makeText(MainActivity.this, "onResume Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        myToast = Toast.makeText(MainActivity.this, "onPause Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myToast = Toast.makeText(MainActivity.this, "onStop Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // menyisipkan kode untuk reconnect ke database
        myToast = Toast.makeText(MainActivity.this, "onRestart Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myToast = Toast.makeText(MainActivity.this, "onDestroy Activity",
                Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0, 0);
        myToast.show();
    }
}