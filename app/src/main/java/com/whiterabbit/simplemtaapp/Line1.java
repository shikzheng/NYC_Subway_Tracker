package com.whiterabbit.simplemtaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.transit.realtime.GtfsRealtime;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrator on 8/6/2015.
 */
public class Line1 extends AppCompatActivity implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        this.setTitle("Line 1 Stations");
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.line1layout);

        Button l1s1button;
        l1s1button = (Button)findViewById(R.id.line1s1);
        l1s1button.setOnClickListener(this);

        Button l1s2button;
        l1s2button = (Button)findViewById(R.id.line1s2);
        l1s2button.setOnClickListener(this);

        Button l1s3button;
        l1s3button = (Button)findViewById(R.id.line1s3);
        l1s3button.setOnClickListener(this);

        Button l1s4button;
        l1s4button = (Button)findViewById(R.id.line1s4);
        l1s4button.setOnClickListener(this);

        Button l1s5button;
        l1s5button = (Button)findViewById(R.id.line1s5);
        l1s5button.setOnClickListener(this);

        Button l1s6button;
        l1s6button = (Button)findViewById(R.id.line1s6);
        l1s6button.setOnClickListener(this);

        Button l1s7button;
        l1s7button = (Button)findViewById(R.id.line1s7);
        l1s7button.setOnClickListener(this);

        Button l1s8button;
        l1s8button = (Button)findViewById(R.id.line1s8);
        l1s8button.setOnClickListener(this);

        Button l1s9button;
        l1s9button = (Button)findViewById(R.id.line1s9);
        l1s9button.setOnClickListener(this);

        Button l1s10button;
        l1s10button = (Button)findViewById(R.id.line1s10);
        l1s10button.setOnClickListener(this);

        Button l1s11button;
        l1s11button = (Button)findViewById(R.id.line1s11);
        l1s11button.setOnClickListener(this);

        Button l1s12button;
        l1s12button = (Button)findViewById(R.id.line1s12);
        l1s12button.setOnClickListener(this);

        Button l1s13button;
        l1s13button = (Button)findViewById(R.id.line1s13);
        l1s13button.setOnClickListener(this);

        Button l1s14button;
        l1s14button = (Button)findViewById(R.id.line1s14);
        l1s14button.setOnClickListener(this);

        Button l1s15button;
        l1s15button = (Button)findViewById(R.id.line1s15);
        l1s15button.setOnClickListener(this);

        Button l1s16button;
        l1s16button = (Button)findViewById(R.id.line1s16);
        l1s16button.setOnClickListener(this);

        Button l1s17button;
        l1s17button = (Button)findViewById(R.id.line1s17);
        l1s17button.setOnClickListener(this);

        Button l1s18button;
        l1s18button = (Button)findViewById(R.id.line1s18);
        l1s18button.setOnClickListener(this);

        Button l1s19button;
        l1s19button = (Button)findViewById(R.id.line1s19);
        l1s19button.setOnClickListener(this);

        Button l1s20button;
        l1s20button = (Button)findViewById(R.id.line1s20);
        l1s20button.setOnClickListener(this);

        Button l1s21button;
        l1s21button = (Button)findViewById(R.id.line1s21);
        l1s21button.setOnClickListener(this);

        Button l1s22button;
        l1s22button = (Button)findViewById(R.id.line1s22);
        l1s22button.setOnClickListener(this);

        Button l1s23button;
        l1s23button = (Button)findViewById(R.id.line1s23);
        l1s23button.setOnClickListener(this);

        Button l1s24button;
        l1s24button = (Button)findViewById(R.id.line1s24);
        l1s24button.setOnClickListener(this);

        Button l1s25button;
        l1s25button = (Button)findViewById(R.id.line1s25);
        l1s25button.setOnClickListener(this);

        Button l1s26button;
        l1s26button = (Button)findViewById(R.id.line1s26);
        l1s26button.setOnClickListener(this);

        Button l1s27button;
        l1s27button = (Button)findViewById(R.id.line1s27);
        l1s27button.setOnClickListener(this);

        Button l1s28button;
        l1s28button = (Button)findViewById(R.id.line1s28);
        l1s28button.setOnClickListener(this);

        Button l1s29button;
        l1s29button = (Button)findViewById(R.id.line1s29);
        l1s29button.setOnClickListener(this);

        Button l1s30button;
        l1s30button = (Button)findViewById(R.id.line1s30);
        l1s30button.setOnClickListener(this);

        Button l1s31button;
        l1s31button = (Button)findViewById(R.id.line1s31);
        l1s31button.setOnClickListener(this);

        Button l1s32button;
        l1s32button = (Button)findViewById(R.id.line1s32);
        l1s32button.setOnClickListener(this);

        Button l1s33button;
        l1s33button = (Button)findViewById(R.id.line1s33);
        l1s33button.setOnClickListener(this);

        Button l1s34button;
        l1s34button = (Button)findViewById(R.id.line1s34);
        l1s34button.setOnClickListener(this);

        Button l1s35button;
        l1s35button = (Button)findViewById(R.id.line1s35);
        l1s35button.setOnClickListener(this);

        Button l1s36button;
        l1s36button = (Button)findViewById(R.id.line1s36);
        l1s36button.setOnClickListener(this);

        Button l1s37button;
        l1s37button = (Button)findViewById(R.id.line1s37);
        l1s37button.setOnClickListener(this);
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


    private void l1s1Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S1"));
    }

    private void l1s2Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S2"));
    }

    private void l13Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S3N"));
    }

    private void l14Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S4N"));
    }

    private void l15Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S5N"));
    }

    private void l16Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S6N"));
    }

    private void l17Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S7N"));
    }

    private void l18Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S8N"));
    }

    private void l19Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S9N"));
    }

    private void l110Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S10N"));
    }
    private void l111Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S11N"));
    }
    private void l112Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S12N"));
    }
    private void l113Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S13N"));
    }
    private void l114Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S14N"));
    }
    private void l115Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S15N"));
    }
    private void l116Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S16N"));
    }
    private void l117Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S17N"));
    }
    private void l118Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S18N"));
    }
    private void l119Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S19N"));
    }
    private void l120Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S20N"));
    }
    private void l121Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S21N"));
    }
    private void l122Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S22N"));
    }
    private void l123Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S23N"));
    }
    private void l124Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S24N"));
    }
    private void l125Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S25N"));
    }
    private void l126Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S26N"));
    }
    private void l127Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S27N"));
    }
    private void l128Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S28N"));
    }
    private void l129Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S29N"));
    }
    private void l130Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S30N"));
    }
    private void l131Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S31N"));
    }
    private void l132Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S32N"));
    }
    private void l133Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S33N"));
    }
    private void l134Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S34N"));
    }
    private void l135Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S35N"));
    }
    private void l136Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S36N"));
    }
    private void l137Click(){
        startActivity(new Intent("com.example.android.nycsubway.L1S37"));
    }


    public void onClick(View v){
        switch(v.getId()){
            case R.id.line1s1:
                l1s1Click();
                break;
            case R.id.line1s2:
                l1s2Click();
                break;
            case R.id.line1s3:
                l13Click();
                break;
            case R.id.line1s4:
                l14Click();
                break;
            case R.id.line1s5:
                l15Click();
                break;
            case R.id.line1s6:
                l16Click();
                break;
            case R.id.line1s7:
                l17Click();
                break;
            case R.id.line1s8:
                l18Click();
                break;
            case R.id.line1s9:
                l19Click();
                break;
            case R.id.line1s10:
                l110Click();
                break;
            case R.id.line1s11:
                l111Click();
                break;
            case R.id.line1s12:
                l112Click();
                break;
            case R.id.line1s13:
                l113Click();
                break;
            case R.id.line1s14:
                l114Click();
                break;
            case R.id.line1s15:
                l115Click();
                break;
            case R.id.line1s16:
                l116Click();
                break;
            case R.id.line1s17:
                l117Click();
                break;
            case R.id.line1s18:
                l118Click();
                break;
            case R.id.line1s19:
                l119Click();
                break;
            case R.id.line1s20:
                l120Click();
                break;
            case R.id.line1s21:
                l121Click();
                break;
            case R.id.line1s22:
                l122Click();
                break;
            case R.id.line1s23:
                l123Click();
                break;
            case R.id.line1s24:
                l124Click();
                break;
            case R.id.line1s25:
                l125Click();
                break;
            case R.id.line1s26:
                l126Click();
                break;
            case R.id.line1s27:
                l127Click();
                break;
            case R.id.line1s28:
                l128Click();
                break;
            case R.id.line1s29:
                l129Click();
                break;
            case R.id.line1s30:
                l130Click();
                break;
            case R.id.line1s31:
                l131Click();
                break;
            case R.id.line1s32:
                l132Click();
                break;
            case R.id.line1s33:
                l133Click();
                break;
            case R.id.line1s34:
                l134Click();
                break;
            case R.id.line1s35:
                l135Click();
                break;
            case R.id.line1s36:
                l136Click();
                break;
            case R.id.line1s37:
                l137Click();
                break;
        }
    }

}