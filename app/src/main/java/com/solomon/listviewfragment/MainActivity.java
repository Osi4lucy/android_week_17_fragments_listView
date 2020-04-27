package com.solomon.listviewfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
FragmentOne fragmentOne;
FragmentTwo fragmentTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();



    }
    public void fragment1(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.framelayout, fragmentOne)
                .commit();
    }
    public void data(String item){
        FragmentManager managerOne = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = managerOne.beginTransaction();
        FragmentTwo fragmentTwo = new FragmentTwo();
        Bundle bundle = new Bundle();
        bundle.putString("key", item);
        fragmentTwo.setArguments(bundle);
        fragmentTransaction.replace(R.id.framelayout, fragmentTwo);
        fragmentTransaction.commit();
        fragmentTransaction.addToBackStack(null);
    }


    public void fragment2(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .add(R.id.framelayout, fragmentTwo)
                .commit();
    }
}
