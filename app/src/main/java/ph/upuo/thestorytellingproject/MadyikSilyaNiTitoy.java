package ph.upuo.thestorytellingproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MadyikSilyaNiTitoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        setContentView(R.layout.story_ang_madyik_silya);

    }

    /**
     * OnClick Button Action Method
     * @param v
     */
    public void changeActivity(View v){

        final Context context = this;
        Class cLoad = TSP.class;

        if(v.getId() == R.id.btnKatambalSilya){
            cLoad = MadyikSilyaKatambalGame.class;
        }else if (v.getId() == R.id.btnMapanuringMataSilya){
            cLoad = MadyikSilyaMapanuringMataGame.class;
        }else if (v.getId() == R.id.btnMapanuringIsipSilya){
            cLoad = MadyikSilyaMapanuringIsipGame.class;
        }else if (v.getId() == R.id.btnPakikisamaSilya){
            cLoad = MadyikSilyaPakikisamaGame.class;
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


