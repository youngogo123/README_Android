package ko.co.company.a2_myfragment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.hardware.lights.LightState;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListFragment fragment1;
    ViewerFragment fragment2;

   FragmentManager manager; //이게 뭐임?



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        2개의 프래그먼트를 activity_main.xml에 추가할 예정

        manager = getSupportFragmentManager();

        fragment1 = (ListFragment) manager.findFragmentById(R.id.listFragment) ;
        fragment2 = (ViewerFragment) manager.findFragmentById(R.id.ViewerFragment);

    }

    public void onImageChange(int index){
//        이 안에서 listFragment로 호출해서 정보를 전달해야함.

        fragment2.setImage(index); //listFragment에서 얘를 호출해서 처리함


    }
}