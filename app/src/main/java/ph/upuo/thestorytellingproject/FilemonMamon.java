package ph.upuo.thestorytellingproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FilemonMamon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        setContentView(R.layout.story_filemon_mamon);

    }


    /**
     * OnClick Button Action Method
     * @param v
     */
    public void changeActivity(View v){

        final Context context = this;
        Class cLoad = TSP.class;

        if(v.getId() == R.id.btnKatambalFilemon){
            cLoad = FilemonMamonKatambalGame.class;
        }else if (v.getId() == R.id.btnMapanuringMataFilemon){
            cLoad = FilemonMamonMapanuringMataGame.class;
        }else if (v.getId() == R.id.btnMapanuringIsipFilemon){
            cLoad = FilemonMamonMapanuringIsipGame.class;
        }else if (v.getId() == R.id.btnPakikisamaFilemon){
            cLoad = FilemonMamonPakikisamaGame.class;
        }else if (v.getId() == R.id.btnHome){
            cLoad = TSP.class;
        }

        redirect(context, cLoad);
    }

    /**
     * Method to load specific page/activity
     * @param context
     * @param classLoad
     */
    public void redirect(Context context, Class classLoad){

        Intent intent = new Intent(context, classLoad);
        startActivity(intent);
    }
}



