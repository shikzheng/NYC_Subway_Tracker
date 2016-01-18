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
public class Line3 extends AppCompatActivity implements View.OnClickListener {

    public void onCreate(Bundle savedInstanceState) {
        this.setTitle("Line 3 Stations");
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.line3layout);


        Button l3s1button;
        l3s1button = (Button)findViewById(R.id.line3s1);
        l3s1button.setOnClickListener(this);

        Button l3s2button;
        l3s2button = (Button)findViewById(R.id.line3s2);
        l3s2button.setOnClickListener(this);

        Button l3s3button;
        l3s3button = (Button)findViewById(R.id.line3s3);
        l3s3button.setOnClickListener(this);

        Button l3s4button;
        l3s4button = (Button)findViewById(R.id.line3s4);
        l3s4button.setOnClickListener(this);

        Button l3s5button;
        l3s5button = (Button)findViewById(R.id.line3s5);
        l3s5button.setOnClickListener(this);

        Button l3s6button;
        l3s6button = (Button)findViewById(R.id.line3s6);
        l3s6button.setOnClickListener(this);

        Button l3s7button;
        l3s7button = (Button)findViewById(R.id.line3s7);
        l3s7button.setOnClickListener(this);

        Button l3s8button;
        l3s8button = (Button)findViewById(R.id.line3s8);
        l3s8button.setOnClickListener(this);

        Button l3s9button;
        l3s9button = (Button)findViewById(R.id.line3s9);
        l3s9button.setOnClickListener(this);

        Button l3s10button;
        l3s10button = (Button)findViewById(R.id.line3s10);
        l3s10button.setOnClickListener(this);

        Button l3s11button;
        l3s11button = (Button)findViewById(R.id.line3s11);
        l3s11button.setOnClickListener(this);

        Button l3s12button;
        l3s12button = (Button)findViewById(R.id.line3s12);
        l3s12button.setOnClickListener(this);

        Button l3s13button;
        l3s13button = (Button)findViewById(R.id.line3s13);
        l3s13button.setOnClickListener(this);

        Button l3s14button;
        l3s14button = (Button)findViewById(R.id.line3s14);
        l3s14button.setOnClickListener(this);

        Button l3s15button;
        l3s15button = (Button)findViewById(R.id.line3s15);
        l3s15button.setOnClickListener(this);

        Button l3s16button;
        l3s16button = (Button)findViewById(R.id.line3s16);
        l3s16button.setOnClickListener(this);

        Button l3s17button;
        l3s17button = (Button)findViewById(R.id.line3s17);
        l3s17button.setOnClickListener(this);

        Button l3s18button;
        l3s18button = (Button)findViewById(R.id.line3s18);
        l3s18button.setOnClickListener(this);

        Button l3s19button;
        l3s19button = (Button)findViewById(R.id.line3s19);
        l3s19button.setOnClickListener(this);

        Button l3s20button;
        l3s20button = (Button)findViewById(R.id.line3s20);
        l3s20button.setOnClickListener(this);

        Button l3s21button;
        l3s21button = (Button)findViewById(R.id.line3s21);
        l3s21button.setOnClickListener(this);

        Button l3s22button;
        l3s22button = (Button)findViewById(R.id.line3s22);
        l3s22button.setOnClickListener(this);

        Button l3s23button;
        l3s23button = (Button)findViewById(R.id.line3s23);
        l3s23button.setOnClickListener(this);

        Button l3s24button;
        l3s24button = (Button)findViewById(R.id.line3s24);
        l3s24button.setOnClickListener(this);

        Button l3s25button;
        l3s25button = (Button)findViewById(R.id.line3s25);
        l3s25button.setOnClickListener(this);

        Button l3s26button;
        l3s26button = (Button)findViewById(R.id.line3s26);
        l3s26button.setOnClickListener(this);

        Button l3s27button;
        l3s27button = (Button)findViewById(R.id.line3s27);
        l3s27button.setOnClickListener(this);

        Button l3s28button;
        l3s28button = (Button)findViewById(R.id.line3s28);
        l3s28button.setOnClickListener(this);

        Button l3s29button;
        l3s29button = (Button)findViewById(R.id.line3s29);
        l3s29button.setOnClickListener(this);

        Button l3s30button;
        l3s30button = (Button)findViewById(R.id.line3s30);
        l3s30button.setOnClickListener(this);

        Button l3s31button;
        l3s31button = (Button)findViewById(R.id.line3s31);
        l3s31button.setOnClickListener(this);

        Button l3s32button;
        l3s32button = (Button)findViewById(R.id.line3s32);
        l3s32button.setOnClickListener(this);

        Button l3s33button;
        l3s33button = (Button)findViewById(R.id.line3s33);
        l3s33button.setOnClickListener(this);

        Button l3s34button;
        l3s34button = (Button)findViewById(R.id.line3s34);
        l3s34button.setOnClickListener(this);

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

    private void l3s1Click(){
        startActivity(new Intent("com.example.android.nycsubway.L3S1"));
    }

    private void l3s2Click(){startActivity(new Intent("com.example.android.nycsubway.L3S2N"));}

    private void l3s3Click(){startActivity(new Intent("com.example.android.nycsubway.L3S3N"));}

    private void l3s4Click(){startActivity(new Intent("com.example.android.nycsubway.L3S4N"));}

    private void l3s5Click(){startActivity(new Intent("com.example.android.nycsubway.L3S5N"));}

    private void l3s6Click(){startActivity(new Intent("com.example.android.nycsubway.L3S6N"));}

    private void l3s7Click(){startActivity(new Intent("com.example.android.nycsubway.L3S7N"));}

    private void l3s8Click(){startActivity(new Intent("com.example.android.nycsubway.L3S8N"));}

    private void l3s9Click(){startActivity(new Intent("com.example.android.nycsubway.L3S9N"));}

    private void l3s10Click(){startActivity(new Intent("com.example.android.nycsubway.L3S10N"));}

    private void l3s11Click(){startActivity(new Intent("com.example.android.nycsubway.L3S11N"));}

    private void l3s12Click(){startActivity(new Intent("com.example.android.nycsubway.L3S12N"));}

    private void l3s13Click(){startActivity(new Intent("com.example.android.nycsubway.L3S13N"));}

    private void l3s14Click(){startActivity(new Intent("com.example.android.nycsubway.L3S14N"));}

    private void l3s15Click(){startActivity(new Intent("com.example.android.nycsubway.L3S15N"));}

    private void l3s16Click(){startActivity(new Intent("com.example.android.nycsubway.L3S16N"));}

    private void l3s17Click(){startActivity(new Intent("com.example.android.nycsubway.L3S17N"));}

    private void l3s18Click(){startActivity(new Intent("com.example.android.nycsubway.L3S18N"));}

    private void l3s19Click(){startActivity(new Intent("com.example.android.nycsubway.L3S19N"));}

    private void l3s20Click(){startActivity(new Intent("com.example.android.nycsubway.L3S20N"));}

    private void l3s21Click(){startActivity(new Intent("com.example.android.nycsubway.L3S21N"));}

    private void l3s22Click(){startActivity(new Intent("com.example.android.nycsubway.L3S22N"));}

    private void l3s23Click(){startActivity(new Intent("com.example.android.nycsubway.L3S23N"));}

    private void l3s24Click(){startActivity(new Intent("com.example.android.nycsubway.L3S24N"));}

    private void l3s25Click(){startActivity(new Intent("com.example.android.nycsubway.L3S25N"));}

    private void l3s26Click(){startActivity(new Intent("com.example.android.nycsubway.L3S26N"));}

    private void l3s27Click(){startActivity(new Intent("com.example.android.nycsubway.L3S27N"));}

    private void l3s28Click(){startActivity(new Intent("com.example.android.nycsubway.L3S28N"));}

    private void l3s29Click(){startActivity(new Intent("com.example.android.nycsubway.L3S29N"));}

    private void l3s30Click(){startActivity(new Intent("com.example.android.nycsubway.L3S30N"));}

    private void l3s31Click(){startActivity(new Intent("com.example.android.nycsubway.L3S31N"));}

    private void l3s32Click(){startActivity(new Intent("com.example.android.nycsubway.L3S32N"));}

    private void l3s33Click(){startActivity(new Intent("com.example.android.nycsubway.L3S33N"));}

    private void l3s34Click(){startActivity(new Intent("com.example.android.nycsubway.L3S34"));}

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.line3s1:
                l3s1Click();
                break;
            case R.id.line3s2:
                l3s2Click();
                break;
            case R.id.line3s3:
                l3s3Click();
                break;
            case R.id.line3s4:
                l3s4Click();
                break;
            case R.id.line3s5:
                l3s5Click();
                break;
            case R.id.line3s6:
                l3s6Click();
                break;
            case R.id.line3s7:
                l3s7Click();
                break;
            case R.id.line3s8:
                l3s8Click();
                break;
            case R.id.line3s9:
                l3s9Click();
                break;
            case R.id.line3s10:
                l3s10Click();
                break;
            case R.id.line3s11:
                l3s11Click();
                break;
            case R.id.line3s12:
                l3s12Click();
                break;
            case R.id.line3s13:
                l3s13Click();
                break;
            case R.id.line3s14:
                l3s14Click();
                break;
            case R.id.line3s15:
                l3s15Click();
                break;
            case R.id.line3s16:
                l3s16Click();
                break;
            case R.id.line3s17:
                l3s17Click();
                break;
            case R.id.line3s18:
                l3s18Click();
                break;
            case R.id.line3s19:
                l3s19Click();
                break;
            case R.id.line3s20:
                l3s20Click();
                break;
            case R.id.line3s21:
                l3s21Click();
                break;
            case R.id.line3s22:
                l3s22Click();
                break;
            case R.id.line3s23:
                l3s23Click();
                break;
            case R.id.line3s24:
                l3s24Click();
                break;
            case R.id.line3s25:
                l3s25Click();
                break;
            case R.id.line3s26:
                l3s26Click();
                break;
            case R.id.line3s27:
                l3s27Click();
                break;
            case R.id.line3s28:
                l3s28Click();
                break;
            case R.id.line3s29:
                l3s29Click();
                break;
            case R.id.line3s30:
                l3s30Click();
                break;
            case R.id.line3s31:
                l3s31Click();
                break;
            case R.id.line3s32:
                l3s32Click();
                break;
            case R.id.line3s33:
                l3s33Click();
                break;
            case R.id.line3s34:
                l3s34Click();
                break;
        }
    }
}
