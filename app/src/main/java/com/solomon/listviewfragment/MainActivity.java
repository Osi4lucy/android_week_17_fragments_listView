package com.solomon.listviewfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
FragmentOne fragmentOne;
FragmentTwo fragmentTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();

        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.framelayout, fragmentOne)
                .commit();

    }
    public void data1(String item){
        FragmentManager managerOne = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = managerOne.beginTransaction();
        FragmentTwo fragmentTwo = new FragmentTwo();
        Bundle bundle = new Bundle();
        bundle.putString("key", item);
        fragmentTwo.setArguments(bundle);
        fragmentTransaction.replace(R.id.framelayout, fragmentTwo);
        fragmentTransaction.commit();
    }


}
