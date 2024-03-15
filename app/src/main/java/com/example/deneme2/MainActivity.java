package com.example.deneme2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected Button sil,tumsil,yuzde,bol;
    protected Button yedi,sekiz, dokuz, carp;
    protected Button dort,bes, alti,cikar;
    protected   Button bir,iki,uc,topla;
    protected Button eksi,sifir,nokta,esittir;
    protected TextView sonuc, islem;

    boolean bolme,carpma,cikarma,toplama;

    float s1,s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonuc=findViewById(R.id.sonuc);
        islem=findViewById(R.id.islem);

        sil=(Button) findViewById(R.id.sil);
        tumsil=(Button) findViewById(R.id.tumsil);
        yuzde=(Button) findViewById(R.id.yuzde);
        bol=(Button)findViewById(R.id.bol);
        yedi=(Button)findViewById(R.id.yedi);
        sekiz=(Button)findViewById(R.id.sekiz);
        dokuz=(Button)findViewById(R.id.dokuz);
        carp=(Button)findViewById(R.id.carp);
        dort=(Button)findViewById(R.id.dort);
        bes=(Button)findViewById(R.id.bes);
        alti=(Button)findViewById(R.id.alti);
        cikar=(Button)findViewById(R.id.cikar);
        bir=(Button)findViewById(R.id.bir);
        iki=(Button)findViewById(R.id.iki);
        uc=(Button)findViewById(R.id.uc);
        topla=(Button)findViewById(R.id.topla);
        eksi=(Button)findViewById(R.id.eksi);
        sifir=(Button)findViewById(R.id.sifir);
        nokta=(Button)findViewById(R.id.nokta);
        esittir=(Button)findViewById(R.id.esittir);



    bir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            sonuc.setText(sonuc.getText()+"1");
            islem.setText(sonuc.getText());
        }
    });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"2");
                islem.setText(sonuc.getText());
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"3");
                islem.setText(sonuc.getText());
            }
        });
        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"4");
                islem.setText(sonuc.getText());
            }
        });
        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"5");
                islem.setText(sonuc.getText());
            }
        });
        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"6");
                islem.setText(sonuc.getText());
            }
        });
        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"7");
                islem.setText(sonuc.getText());
            }
        });
        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"8");
                islem.setText(sonuc.getText());
            }
        });
        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"9");
                islem.setText(sonuc.getText());
            }
        });
        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"0");
                islem.setText(sonuc.getText());
            }
        });
        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+".");
                islem.setText(sonuc.getText());


            }
        });
        eksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"-");
                islem.setText(sonuc.getText());


            }
        });
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sonuc.getText().length() > 0) {

                    String currentText = sonuc.getText().toString();
                    String newText = currentText.substring(0, currentText.length() - 1);
                    sonuc.setText(newText);
                    islem.setText(newText);
                }
            }
        });
        tumsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText("");
            }
        });
        yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (sonuc.getText().length() > 0) {

                    s1 = Float.parseFloat(sonuc.getText()+(""));
                    sonuc.setText(s1/100+"");
                }
            }
        });
        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(sonuc==null){
                        sonuc.setText("");

                    }
                    else {
                        s1=Float.parseFloat(sonuc.getText()+(""));
                        toplama=true;
                        sonuc.setText(null);
                    }
                }
        });
        cikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sonuc==null){
                    sonuc.setText("");

                }
                else {
                    s1=Float.parseFloat(sonuc.getText()+"");
                    cikarma=true;
                    sonuc.setText(null);
                }
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sonuc==null){
                    sonuc.setText("");

                }
                else {
                    s1=Float.parseFloat(sonuc.getText()+"");
                    carpma=true;
                    sonuc.setText(null);
                }
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sonuc==null){
                    sonuc.setText("");

                }
                else {
                    s1=Float.parseFloat(sonuc.getText()+"");
                    bolme=true;
                    sonuc.setText(null);
                }
            }
        });
        esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s2=Float.parseFloat(sonuc.getText()+"");

                if(toplama==true){
                    sonuc.setText(s1+s2+"");
                    islem.setText(s1+"+"+s2);
                    toplama=false;

                }
                if(cikarma==true){
                    sonuc.setText(s1-s2+"");
                    islem.setText(s1+"-"+s2);
                    cikarma=false;

                }
                if(carpma==true){
                    sonuc.setText(s1*s2+"");
                    islem.setText(s1+"x"+s2);
                    carpma=false;

                }
                if(bolme==true){
                    sonuc.setText(s1/s2+"");
                    islem.setText(s1+"÷"+s2);
                    bolme=false;

                }

            }
        });




    }
}