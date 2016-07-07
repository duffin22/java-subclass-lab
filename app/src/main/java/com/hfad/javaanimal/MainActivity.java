package com.hfad.javaanimal;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button vultureButton,ostrichButton,chameleonButton,pythonButton,dolphinButton,chimpanzeeButton;
    ImageView picture;
    TextView idView,nameView,footer;
    String lastClicked;
    View overall;
    boolean isColorful=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


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

        footer=(TextView) findViewById(R.id.footer);

        overall=findViewById(R.id.overall);

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
                    Vulture vul=new Vulture();
                    Toast.makeText(getBaseContext(),vul.getAnimalCall(), Toast.LENGTH_SHORT).show();
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
                    Ostrich ost = new Ostrich();
                    Toast.makeText(getBaseContext(),ost.getAnimalCall(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        chameleonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!lastClicked.equals("chameleon")) {
                    Chameleon cha = new Chameleon();
                    picture.setImageResource(cha.getDrawable());
                    idView.setText(cha.getAnimalID());
                    nameView.setText(cha.getAnimalSpecies());
                    if (lastClicked.equals("nothing")) {
                        idView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                        nameView.setBackgroundColor(getResources().getColor(R.color.halfBlack));
                    }
                    lastClicked = "chameleon";
                } else {
                    Chameleon cha = new Chameleon();
                    Toast.makeText(getBaseContext(),cha.getAnimalCall(), Toast.LENGTH_SHORT).show();
                    if (lastClicked.equals("chameleon") && !isColorful) {
                        overall.setBackgroundColor(getResources().getColor(R.color.purple));
                        picture.setBackgroundColor(getResources().getColor(R.color.pink));
                        footer.setTextColor(getResources().getColor(R.color.white));
                        isColorful=true;
                    } else if (lastClicked.equals("chameleon") && isColorful) {
                        overall.setBackgroundColor(getResources().getColor(R.color.background));
                        picture.setBackgroundColor(getResources().getColor(R.color.black));
                        footer.setTextColor(getResources().getColor(R.color.grey));
                        footer.setText("What does the Fox say?!");
                        footer.setOnClickListener(new TextView.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getBaseContext(),R.string.foxNoise, Toast.LENGTH_LONG).show();
                                Intent intent = getIntent();
                                finish();
                                startActivity(intent);
                            }
                        });
                        isColorful=false;
                    }
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
                    Python pyt = new Python();
                    Toast.makeText(getBaseContext(),pyt.getAnimalCall(), Toast.LENGTH_SHORT).show();
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
                    Dolphin dol = new Dolphin();
                    Toast.makeText(getBaseContext(),dol.getAnimalCall(), Toast.LENGTH_SHORT).show();
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
                    Chimpanzee chi = new Chimpanzee();
                    Toast.makeText(getBaseContext(),chi.getAnimalCall(), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
