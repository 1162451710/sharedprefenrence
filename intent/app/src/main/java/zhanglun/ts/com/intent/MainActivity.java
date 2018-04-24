package zhanglun.ts.com.intent;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    private void test(){
//        Log.wtf("tag","msg",new Throwable());
//    }

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager= getFragmentManager();
        mFragmentManager.beginTransaction()
                .add(R.id.container,new TestPerferenceFragment())
                .commit();



//        SharedPreferences sp = getSharedPreferences("sp1",MODE_PRIVATE);
//
//        SharedPreferences.Editor edit = sp.edit();


    }
}
