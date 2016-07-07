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
    TextView idView;

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

        vultureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picture.setImageResource(R.drawable.vulture);
            }
        });

        ostrichButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picture.setImageResource(R.drawable.ostrich);
            }
        });

        chameleonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Chameleon cha =new Chameleon();
                picture.setImageResource(R.drawable.chameleon);
            }
        });

        pythonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picture.setImageResource(R.drawable.python);
            }
        });

        dolphinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picture.setImageResource(R.drawable.dolphin);
            }
        });

        chimpanzeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picture.setImageResource(R.drawable.chimpanzee);
            }
        });



    }
}
