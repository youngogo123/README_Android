package ko.co.company.a2_myfragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ViewerFragment extends Fragment {
    ImageView imageView;

//    인플레이션(inflater)은 onCreat에서 한다.
//    오른쪽 클릭-> Generation->override method-> onCreatView생성

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragmet_viewer,container,false);

     imageView = (ImageView) rootView.findViewById(R.id.imageView);


        return rootView;
    }

    public void setImage(int index){
        if (index ==0){
            imageView.setImageResource(R.drawable.iconpi1);
        } else if (index==1) {
            imageView.setImageResource(R.drawable.iconpi2);

        } else if (index==2) {
            imageView.setImageResource(R.drawable.iconpi1);

        }
    }

}
