package com.example.group1_desicionbasedgame.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.group1_desicionbasedgame.DecisionActivity;
import com.example.group1_desicionbasedgame.R;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goDecisionActivity(View view){

        Intent decisionActivity = new Intent(this, DecisionActivity.class);
        startActivity(decisionActivity);
    }


}