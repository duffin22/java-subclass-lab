package com.hfad.javaanimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button vultureButton,ostrichButton,chameleonButton,pythonButton,dolphinButton,chimpanzeeButton;
    ImageView picture;
    TextView idView,nameView;
    String lastClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vultureButton=(Button) findViewById(R.id.vultureBut);
        ostrichButton=(Button) findViewById(R.id.ostrichBut);
        chameleonButton=(Button) findViewById(R.id.chameleonBut);
        pythonButton=(Button) findViewById(R.id.pythonBut);
        dolphinButton=(Button) findViewById(R.id.dolphinBut);
        chimpanzeeButton=(Button) findViewById(R.id.chimpanzeeBut);

        picture=(ImageView) findViewById(R.id.imageView);

        idView=(TextView) findViewById(R.id.idView);

        nameView=(TextView) findViewById(R.id.nameView);

        lastClicked="nothing";

        vultureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("vulture")) {
                    Vulture vul = new Vulture();
                    picture.setImageResource(R.drawable.vulture);
                    idView.setText(vul.getAnimalID());
                    nameView.setText(vul.getAnimalSpecies());
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "vulture";
                } else {
                    //put code for toaster here
                }
            }
        });

        ostrichButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("ostrich")) {
                    Ostrich ost = new Ostrich();
                    picture.setImageResource(R.drawable.ostrich);
                    idView.setText(ost.getAnimalID());
                    nameView.setText(ost.getAnimalSpecies());
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "ostrich";
                } else {
                    //put code for toaster here
                }
            }
        });

        chameleonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("chameleon")) {
                    Chameleon cha = new Chameleon();
                    picture.setImageResource(R.drawable.chameleon);
                    idView.setText(cha.getAnimalID());
                    nameView.setText(cha.getAnimalSpecies());
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "chameleon";
                } else {
                    //toaster code
                }
            }
        });

        pythonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("python")) {
                    Python pyt = new Python();
                    picture.setImageResource(R.drawable.python);
                    idView.setText(pyt.getAnimalID());
                    nameView.setText(pyt.getAnimalSpecies());
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "python";
                } else {
                    //toaster code
                }
            }
        });

        dolphinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("dolphin")) {
                    Dolphin dol = new Dolphin();
                    picture.setImageResource(R.drawable.dolphin);
                    idView.setText(dol.getAnimalID());
                    nameView.setText(dol.getAnimalSpecies());
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "dolphin";
                } else {
                    //toaster code
                }
            }
        });

        chimpanzeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("chimpanzee")) {
                    Chimpanzee chi = new Chimpanzee();
                    idView.setText(chi.getAnimalID());
                    nameView.setText(chi.getAnimalSpecies());
                    picture.setImageResource(R.drawable.chimpanzee);
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "chimpanzee";
                } else {
                    //toaster code
                }
            }
        });



    }
}
