package com.example.group1_desicionbasedgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class DecisionActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4;
    TextView text;
    int decision = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_decision);

        //buttons
        btn1=findViewById(R.id.btnChoice1);
        btn2=findViewById(R.id.btnChoice2);
        btn3=findViewById(R.id.btnChoice3);
        btn4=findViewById(R.id.btnChoice4);

        text=findViewById(R.id.textView);



        String setting =

                "You wake up in inside a dark room. \n" + " “Where am I?” \n"
                        + "As your eyesight adjusts to the darkness of the room, you see that you are inside a dungeon. You see four openings in front of you. \n" +
                        " “I won’t be able to survive if I stay here” \n" + "Due to your curiosity, you decided to explore the dungeon. \n" +
                        "You decided to explore the dungeon and check where the openings will lead you. \n" +
                        "Where will you go\n" +
                        "\n1. Enter room in the far left." +
                        "\n2. Follow hallway on the left" +
                        "\n3. Follow hallway on the right" +
                        "\n4. Enter room in the far right";

        //set listeners
        text.setText(setting);
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);


    }
@Override
    public void onClick(View v){

        String choice = "";

        int decision=0;
        decision = 1;


        switch(v.getId()){
            case R.id.btnChoice1:
                decision = 1;

                if(decision==1) {
                    //condition 1 is found here
                    choice = "You decided to enter the room in the far left. \n" +
                            "\n" +
                            "Upon entering, you see a sleeping man in the distance. \n" +
                            "\n" +
                            "What will you do? \n" +
                            "\n" +
                            "1.Steal his items \n" +
                            "\n" +
                            "2.Ignore him and explore the room\n" +
                            "\n" +
                            "3.Wake him up \n" +
                            "\n" +
                            "4.Observe him ";

                    if (decision==1.1);
                        //condition 1.1 is found here
                    choice = "You approached the man and decided to steal his things that were scattered on the floor. Because of the noise you were making, he woke up.  \n" +
                            "\n" +
                            "What will you do? \n" + "1.Continue to steal his items \n" + "2.Ask why you are inside the dungeon\n" +
                            "3.Help him get up\n" + "4.Attack man";




                }


                text.setText(choice);


                break;
            case R.id.btnChoice2:
                decision = 2;


                if(decision==2) {
                    //condition 2 is found here
                    choice = "Follow hallway on the left";
                }

                text.setText(choice);

                break;
            case R.id.btnChoice3:
                decision = 3;

                if(decision==3){
                    //condition 3 is found here
                    choice = "Follow hallway on the right";
                }

                text.setText(choice);

                break;
            case R.id.btnChoice4:
                decision = 4;


                if(decision==4){
                    //condition 4 is found here
                    choice = "Enter room in the far right";
                }
                else{
                    //choices catches all the that conditions were not written for
                    choice = "choice not acknowledged. try again";

                }
                text.setText(choice);
                break;


        }

    }
}










