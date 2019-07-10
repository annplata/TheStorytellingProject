package ph.upuo.thestorytellingproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TSP extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView(R.layout.tsp);
    }

    /**
     * OnClick Button Action Method
     * @param v
     */
    public void changeActivity(View v){
        Log.d("here","HERE");
        final Context context = this;
        Class cLoad = TSP.class;

        if(v.getId() == R.id.btnFilemonMamon){
            cLoad = FilemonMamon.class;
        }else if (v.getId() == R.id.btnPambihirangSumbrero){
            cLoad = PambihirangSumbrero.class;
        }else if (v.getId() == R.id.btnMadyikSilya){
            cLoad = MadyikSilyaNiTitoy.class;
        }else if (v.getId() == R.id.btnMamemimumu){
            cLoad = Mamemimumu.class;
        }else if (v.getId() == R.id.btnMisterBeetle){
            cLoad = MisterBeetleManyRooms.class;
        }

        redirect(context, cLoad);
    }

    /**
     * Method to load specific page/activity
     * @param context
     * @param classLoad
     */
    public void redirect(Context context, Class classLoad){
        Log.d("hey","HEY");
        Intent intent = new Intent(context, classLoad);
        startActivity(intent);
    }
}


