package ko.co.company.a4_my_pragment;

//import  android.support.v4.app.*;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    MainActivity activity;

    @Override  //onAttach로 프래그먼트에 올라와야 동작을 함
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        getActivity();  //getActivity를 하면 main액티비티를 참조함
        activity = (MainActivity) getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();

        activity =null;  //왜 null..?
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.frgment_main,container,
                false);
//        getActivity는 이 프래그먼트가 동작하는 액티비티를 참조할 수 있다.(여기선main)
       // getActivity();

//        rootView가 최상위 레이아웃이라서 rootView.fin~로 찾아야 한다.
       Button button = (Button) rootView.findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
//               시스템이 아니라서 intent못함 메인액티비티에서 메소드만들어야함
                activity.onFragmentChanged(1);//메뉴프래그먼트가 보인다.
//               액티비티의 메소드를 호출한다는 뜻.
           }
       });

        return  rootView;
    }


}
