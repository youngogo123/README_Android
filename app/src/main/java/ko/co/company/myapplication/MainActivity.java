package ko.co.company.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//각자 호출되는 순간이 다름

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("My","--OnCreat()--");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); //super관련된 코드는 삭제 x
        Log.i("My","--OnDestroy()--");
    }//onDestroy()

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My","--OnPause()--");

    }//onPause

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My","--OnRestart()--");
    }//onRestrart()

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My","--OnResume()--");
    }//onResume()

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My","--OnStrat()--");

    }//onStart()

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My","--OnStop()--");
    }//onStop


}