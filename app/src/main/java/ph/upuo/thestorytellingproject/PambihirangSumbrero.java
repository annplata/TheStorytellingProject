package ph.upuo.thestorytellingproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PambihirangSumbrero extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        setContentView(R.layout.story_ang_pambihirang_sumbrero);
    }


    /**
     * OnClick Button Action Method
     * @param v
     */
    public void changeActivity(View v){

        final Context context = this;
        Class cLoad = TSP.class;

        if(v.getId() == R.id.btnKatambalSumbrero){
            cLoad = PambihirangSumbreroKatambalGame.class;
        }else if (v.getId() == R.id.btnMapanuringMataSumbrero){
            cLoad = PambihirangSumbreroMapanuringMataGame.class;
        }else if (v.getId() == R.id.btnMapanuringIsipSumbrero){
            cLoad = PambihirangSumbreroMapanuringIsipGame.class;
        }else if (v.getId() == R.id.btnPakikisamaSumbrero){
            cLoad = PambihirangSumbreroPakikisamaGame.class;
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


