package zhanglun.ts.com.intent;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

/**
 * Created by zhanglun on 4/24/18.
 */

public class TestPerferenceFragment extends PreferenceFragment {

    private EditTextPreference eName;
    private SharedPreferences mSp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.test);

        mSp= PreferenceManager.getDefaultSharedPreferences(getActivity());
        mSp.getString("name","默认name");
        mSp.getString("ID","默认id");


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        addPreferencesFromResource(R.xml.test);

        eName= (EditTextPreference) findPreference("name");
        eName.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {

                if(preference == eName) {
                    String name = mSp.getString("name","默认");
                    eName.setText(name);
                    eName.setSummary(name);
                }

                return true;
            }
        });

    }
}
