package com.whiterabbit.simplemtaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 8/6/2015.
 */
public class Line6 extends AppCompatActivity implements View.OnClickListener{

    public void onCreate(Bundle savedInstanceState) {
        this.setTitle("Line 6 Stations");
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.line6layout);

        Button l6s1button;
        l6s1button = (Button)findViewById(R.id.line6s1);
        l6s1button.setOnClickListener(this);

        Button l6s2button;
        l6s2button = (Button)findViewById(R.id.line6s2);
        l6s2button.setOnClickListener(this);

        Button l6s3button;
        l6s3button = (Button)findViewById(R.id.line6s3);
        l6s3button.setOnClickListener(this);

        Button l6s4button;
        l6s4button = (Button)findViewById(R.id.line6s4);
        l6s4button.setOnClickListener(this);

        Button l6s5button;
        l6s5button = (Button)findViewById(R.id.line6s5);
        l6s5button.setOnClickListener(this);

        Button l6s6button;
        l6s6button = (Button)findViewById(R.id.line6s6);
        l6s6button.setOnClickListener(this);

        Button l6s7button;
        l6s7button = (Button)findViewById(R.id.line6s7);
        l6s7button.setOnClickListener(this);

        Button l6s8button;
        l6s8button = (Button)findViewById(R.id.line6s8);
        l6s8button.setOnClickListener(this);

        Button l6s9button;
        l6s9button = (Button)findViewById(R.id.line6s9);
        l6s9button.setOnClickListener(this);

        Button l6s10button;
        l6s10button = (Button)findViewById(R.id.line6s10);
        l6s10button.setOnClickListener(this);

        Button l6s11button;
        l6s11button = (Button)findViewById(R.id.line6s11);
        l6s11button.setOnClickListener(this);

        Button l6s12button;
        l6s12button = (Button)findViewById(R.id.line6s12);
        l6s12button.setOnClickListener(this);

        Button l6s13button;
        l6s13button = (Button)findViewById(R.id.line6s13);
        l6s13button.setOnClickListener(this);

        Button l6s14button;
        l6s14button = (Button)findViewById(R.id.line6s14);
        l6s14button.setOnClickListener(this);

        Button l6s15button;
        l6s15button = (Button)findViewById(R.id.line6s15);
        l6s15button.setOnClickListener(this);

        Button l6s16button;
        l6s16button = (Button)findViewById(R.id.line6s16);
        l6s16button.setOnClickListener(this);

        Button l6s17button;
        l6s17button = (Button)findViewById(R.id.line6s17);
        l6s17button.setOnClickListener(this);

        Button l6s18button;
        l6s18button = (Button)findViewById(R.id.line6s18);
        l6s18button.setOnClickListener(this);

        Button l6s19button;
        l6s19button = (Button)findViewById(R.id.line6s19);
        l6s19button.setOnClickListener(this);

        Button l6s20button;
        l6s20button = (Button)findViewById(R.id.line6s20);
        l6s20button.setOnClickListener(this);

        Button l6s21button;
        l6s21button = (Button)findViewById(R.id.line6s21);
        l6s21button.setOnClickListener(this);

        Button l6s22button;
        l6s22button = (Button)findViewById(R.id.line6s22);
        l6s22button.setOnClickListener(this);

        Button l6s23button;
        l6s23button = (Button)findViewById(R.id.line6s23);
        l6s23button.setOnClickListener(this);

        Button l6s24button;
        l6s24button = (Button)findViewById(R.id.line6s24);
        l6s24button.setOnClickListener(this);

        Button l6s25button;
        l6s25button = (Button)findViewById(R.id.line6s25);
        l6s25button.setOnClickListener(this);

        Button l6s26button;
        l6s26button = (Button)findViewById(R.id.line6s26);
        l6s26button.setOnClickListener(this);

        Button l6s27button;
        l6s27button = (Button)findViewById(R.id.line6s27);
        l6s27button.setOnClickListener(this);

        Button l6s28button;
        l6s28button = (Button)findViewById(R.id.line6s28);
        l6s28button.setOnClickListener(this);

        Button l6s29button;
        l6s29button = (Button)findViewById(R.id.line6s29);
        l6s29button.setOnClickListener(this);

        Button l6s30button;
        l6s30button = (Button)findViewById(R.id.line6s30);
        l6s30button.setOnClickListener(this);

        Button l6s31button;
        l6s31button = (Button)findViewById(R.id.line6s31);
        l6s31button.setOnClickListener(this);

        Button l6s32button;
        l6s32button = (Button)findViewById(R.id.line6s32);
        l6s32button.setOnClickListener(this);

        Button l6s33button;
        l6s33button = (Button)findViewById(R.id.line6s33);
        l6s33button.setOnClickListener(this);

        Button l6s34button;
        l6s34button = (Button)findViewById(R.id.line6s34);
        l6s34button.setOnClickListener(this);

        Button l6s35button;
        l6s35button = (Button)findViewById(R.id.line6s35);
        l6s35button.setOnClickListener(this);

        Button l6s36button;
        l6s36button = (Button)findViewById(R.id.line6s36);
        l6s36button.setOnClickListener(this);

        Button l6s37button;
        l6s37button = (Button)findViewById(R.id.line6s37);
        l6s37button.setOnClickListener(this);

        Button l6s38button;
        l6s38button = (Button)findViewById(R.id.line6s38);
        l6s38button.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_mainlines, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.goLines:
                finish();
                Intent a = new Intent(this,MainActivity.class);
                startActivity(a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                break;
        }
        return true;
    }


    private void l6s1Click(){
        startActivity(new Intent("com.example.android.nycsubway.L6S1"));
    }
    private void l6s2Click(){startActivity(new Intent("com.example.android.nycsubway.L6S2N"));}
    private void l6s3Click(){startActivity(new Intent("com.example.android.nycsubway.L6S3N"));}
    private void l6s4Click(){startActivity(new Intent("com.example.android.nycsubway.L6S4N"));}
    private void l6s5Click(){startActivity(new Intent("com.example.android.nycsubway.L6S5N"));}
    private void l6s6Click(){startActivity(new Intent("com.example.android.nycsubway.L6S6N"));}
    private void l6s7Click(){startActivity(new Intent("com.example.android.nycsubway.L6S7N"));}
    private void l6s8Click(){startActivity(new Intent("com.example.android.nycsubway.L6S8N"));}
    private void l6s9Click(){startActivity(new Intent("com.example.android.nycsubway.L6S9N"));}
    private void l6s10Click(){startActivity(new Intent("com.example.android.nycsubway.L6S10N"));}
    private void l6s11Click(){startActivity(new Intent("com.example.android.nycsubway.L6S11N"));}
    private void l6s12Click(){startActivity(new Intent("com.example.android.nycsubway.L6S12N"));}
    private void l6s13Click(){startActivity(new Intent("com.example.android.nycsubway.L6S13N"));}
    private void l6s14Click(){startActivity(new Intent("com.example.android.nycsubway.L6S14N"));}
    private void l6s15Click(){startActivity(new Intent("com.example.android.nycsubway.L6S15N"));}
    private void l6s16Click(){startActivity(new Intent("com.example.android.nycsubway.L6S16N"));}
    private void l6s17Click(){startActivity(new Intent("com.example.android.nycsubway.L6S17N"));}
    private void l6s18Click(){startActivity(new Intent("com.example.android.nycsubway.L6S18N"));}
    private void l6s19Click(){startActivity(new Intent("com.example.android.nycsubway.L6S19N"));}
    private void l6s20Click(){startActivity(new Intent("com.example.android.nycsubway.L6S20N"));}
    private void l6s21Click(){startActivity(new Intent("com.example.android.nycsubway.L6S21N"));}
    private void l6s22Click(){startActivity(new Intent("com.example.android.nycsubway.L6S22N"));}
    private void l6s23Click(){startActivity(new Intent("com.example.android.nycsubway.L6S23N"));}
    private void l6s24Click(){startActivity(new Intent("com.example.android.nycsubway.L6S24N"));}
    private void l6s25Click(){startActivity(new Intent("com.example.android.nycsubway.L6S25N"));}
    private void l6s26Click(){startActivity(new Intent("com.example.android.nycsubway.L6S26N"));}
    private void l6s27Click(){startActivity(new Intent("com.example.android.nycsubway.L6S27N"));}
    private void l6s28Click(){startActivity(new Intent("com.example.android.nycsubway.L6S28N"));}
    private void l6s29Click(){startActivity(new Intent("com.example.android.nycsubway.L6S29N"));}
    private void l6s30Click(){startActivity(new Intent("com.example.android.nycsubway.L6S30N"));}
    private void l6s31Click(){startActivity(new Intent("com.example.android.nycsubway.L6S31N"));}
    private void l6s32Click(){startActivity(new Intent("com.example.android.nycsubway.L6S32N"));}
    private void l6s33Click(){startActivity(new Intent("com.example.android.nycsubway.L6S33N"));}
    private void l6s34Click(){startActivity(new Intent("com.example.android.nycsubway.L6S34N"));}
    private void l6s35Click(){startActivity(new Intent("com.example.android.nycsubway.L6S35N"));}
    private void l6s36Click(){startActivity(new Intent("com.example.android.nycsubway.L6S36N"));}
    private void l6s37Click(){startActivity(new Intent("com.example.android.nycsubway.L6S37N"));}
    private void l6s38Click(){startActivity(new Intent("com.example.android.nycsubway.L6S38"));}




    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.line6s1:
                l6s1Click();
                break;
            case R.id.line6s2:
                l6s2Click();
                break;
            case R.id.line6s3:
                l6s3Click();
                break;
            case R.id.line6s4:
                l6s4Click();
                break;
            case R.id.line6s5:
                l6s5Click();
                break;
            case R.id.line6s6:
                l6s6Click();
                break;
            case R.id.line6s7:
                l6s7Click();
                break;
            case R.id.line6s8:
                l6s8Click();
                break;
            case R.id.line6s9:
                l6s9Click();
                break;
            case R.id.line6s10:
                l6s10Click();
                break;
            case R.id.line6s11:
                l6s11Click();
                break;
            case R.id.line6s12:
                l6s12Click();
                break;
            case R.id.line6s13:
                l6s13Click();
                break;
            case R.id.line6s14:
                l6s14Click();
                break;
            case R.id.line6s15:
                l6s15Click();
                break;
            case R.id.line6s16:
                l6s16Click();
                break;
            case R.id.line6s17:
                l6s17Click();
                break;
            case R.id.line6s18:
                l6s18Click();
                break;
            case R.id.line6s19:
                l6s19Click();
                break;
            case R.id.line6s20:
                l6s20Click();
                break;
            case R.id.line6s21:
                l6s21Click();
                break;
            case R.id.line6s22:
                l6s22Click();
                break;
            case R.id.line6s23:
                l6s23Click();
                break;
            case R.id.line6s24:
                l6s24Click();
                break;
            case R.id.line6s25:
                l6s25Click();
                break;
            case R.id.line6s26:
                l6s26Click();
                break;
            case R.id.line6s27:
                l6s27Click();
                break;
            case R.id.line6s28:
                l6s28Click();
                break;
            case R.id.line6s29:
                l6s29Click();
                break;
            case R.id.line6s30:
                l6s30Click();
                break;
            case R.id.line6s31:
                l6s31Click();
                break;
            case R.id.line6s32:
                l6s32Click();
                break;
            case R.id.line6s33:
                l6s33Click();
                break;
            case R.id.line6s34:
                l6s34Click();
                break;
            case R.id.line6s35:
                l6s35Click();
                break;
            case R.id.line6s36:
                l6s36Click();
                break;
            case R.id.line6s37:
                l6s37Click();
                break;
            case R.id.line6s38:
                l6s38Click();
                break;
        }
    }
}
