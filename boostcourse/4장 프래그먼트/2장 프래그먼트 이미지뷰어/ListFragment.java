package ko.co.company.a2_myfragment2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

/////
//    버튼에서 어떤 액션을 취하기 위해 onAttach를 만들어둔다.
    //    오른쪽 클릭-> Generation->override method-> onAttach생성
//    onAttach : 프래그먼트가 액티비티로 올라오는 순간
   MainActivity activity;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getActivity();
       activity=(MainActivity) getActivity();
    }

 /////

//    인플레이션(inflater)은 onCreat에서 한다.
//    오른쪽 클릭-> Generation->override method-> onCreatView생성
    Button button,button2,button3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list,container,false);


      button = (Button) rootView.findViewById(R.id.button);
      button2 = (Button) rootView.findViewById(R.id.button2);
      button3 = (Button) rootView.findViewById(R.id.button3);


//     이 프래그먼트에선 다른프래그먼트(viewrfragmet)로 직접접근 못함
//        액티비트쪽으로 요청을 해야함(MainActivity.java)에서 메소드 작성을 해야함
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              activity.onImageChange(0);// 액티비티에서 인덱스값을 받아 viewrfagment로 전달한다
          }
      });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onImageChange(1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onImageChange(2);
            }
        });

        return rootView;



    }
}
