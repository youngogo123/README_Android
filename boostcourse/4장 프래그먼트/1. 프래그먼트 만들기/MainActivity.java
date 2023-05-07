package ko.co.company.a4_my_pragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MainFragment fragment1;
    MenuFragment fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         fragment2 = new MenuFragment();

        Button button = (Button)findViewById(R.id.button);

//        2.java에서 프래그먼트 추가하는 방법
//        프래그먼트 추가 : getSupportFragmentManager를 사용함
        button.setOnClickListener(new View.OnClickListener() {
            @Override// 버튼 클릭시 프래그먼트 추가됌
            public void onClick(View view) {
                MainFragment fragment1 = new MainFragment();
                getSupportFragmentManager().beginTransaction().add(R.id.container,
                        fragment1).commit();

            }
        });

        Button button2 = (Button)findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override// 버튼 클릭시 프래그먼트 추가됌
            public void onClick(View view) {
               // MenuFragment fragment2 = new MenuFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        fragment2).commit();  //commit꼭 붙여야함

            }
        });
    }


//    직접 만든 메소드
//    액티비티에서 메뉴 프래그먼트를 띄워준다
//    프래그먼트와 프래그먼트간의 직접접근x
    public void onFragmentChanged(int index){
        if (index == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    fragment1).commit();
        } else if (index == 1 ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    fragment2).commit();

        }
    }
}