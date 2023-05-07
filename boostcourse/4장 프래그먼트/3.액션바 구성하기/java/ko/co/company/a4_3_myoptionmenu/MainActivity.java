package ko.co.company.a4_3_myoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActionBar abar = getSupportActionBar(); //액션바 숨기기
//        abar.hide();
    }



//generate -> 오버라이딩 -> onCreatOptionsMenu찾아서 오버라이딩하기
//    이게 안드로이드의 기본 메뉴임
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_xml,menu);
        return true;
    }


    //generate -> 오버라이딩 -> onOptionsItemSelected찾아서 오버라이딩하기
//    옵션메뉴가 선택됐을때 호출되는 메소드 둘다 콜백 메소드임
//    메뉴가 클릭됐을때 호출됌
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curID = item.getItemId();
        switch (curID){
            case R.id.menu_refresh:
                Toast.makeText(this,"새로고침 메뉴 클릭됌", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_search:
                Toast.makeText(this,"검색 메뉴 클릭됌", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_settings:
                Toast.makeText(this,"설정 메뉴 클릭됌", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}