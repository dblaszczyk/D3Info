package com.dblas.d3info.app;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity{

    //private String m_Text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new D3InfoListFragment())
                    .commit();
        }
    }

}
