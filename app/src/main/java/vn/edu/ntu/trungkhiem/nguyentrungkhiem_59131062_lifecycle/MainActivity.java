package vn.edu.ntu.trungkhiem.nguyentrungkhiem_59131062_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate callded");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);

        Toast.makeText(getApplicationContext(), "onCreate callded", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume callded");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart callded");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop callded");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy callded");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause callded");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart callded");
    }
}
