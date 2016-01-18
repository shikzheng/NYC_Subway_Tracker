package com.whiterabbit.simplemtaapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.AsyncTask;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;


public class MainActivity extends Activity implements OnClickListener{
    Button Line1Button;
    Button Line2Button;
    Button Line3Button;
    Button Line4Button;
    Button Line5Button;
    Button Line6Button;
    Button StatusButton;
    Button MapButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //new AsyncTaskExample().execute();

        Line1Button = (Button)findViewById(R.id.Line1);
        Line1Button.setOnClickListener(this);


        Line2Button = (Button)findViewById(R.id.Line2);
        Line2Button.setOnClickListener(this);

        Line3Button = (Button)findViewById(R.id.Line3);
        Line3Button.setOnClickListener(this);

        Line4Button = (Button)findViewById(R.id.Line4);
        Line4Button.setOnClickListener(this);

        Line5Button = (Button)findViewById(R.id.Line5);
        Line5Button.setOnClickListener(this);

        Line6Button = (Button)findViewById(R.id.Line6);
        Line6Button.setOnClickListener(this);

        StatusButton = (Button)findViewById(R.id.status);
        StatusButton.setOnClickListener(this);

        MapButton = (Button)findViewById(R.id.map);
        MapButton.setOnClickListener(this);
    }


    private void line1Click(){

        startActivity(new Intent("com.example.android.nycsubway.line1"));
    }

    private void line2Click(){

        startActivity(new Intent("com.example.android.nycsubway.line2"));
    }

    private void line3Click(){
        startActivity(new Intent("com.example.android.nycsubway.line3"));
    }

    private void line4Click(){
        startActivity(new Intent("com.example.android.nycsubway.line4"));
    }

    private void line5Click(){
        startActivity(new Intent("com.example.android.nycsubway.line5"));
    }

    private void line6Click(){
        startActivity(new Intent("com.example.android.nycsubway.line6"));
    }
/*
    private void statusClick(){
        Uri uri = Uri.parse("http://service.mta.info/ServiceStatus/status.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
*/
private void statusClick() {
    startActivity(new Intent("com.example.android.nycsubway.Status"));
}

    private void line7Click(){
        startActivity(new Intent("com.example.android.nycsubway.Subwaymap"));
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.Line1:
                line1Click();
                break;
            case R.id.Line2:
                line2Click();
                break;
            case R.id.Line3:
                line3Click();
                break;
            case R.id.Line4:
                line4Click();
                break;
            case R.id.Line5:
                line5Click();
                break;
            case R.id.Line6:
                line6Click();
                break;
            case R.id.status:
                statusClick();
                break;
            case R.id.map:
                line7Click();
                break;
        }
    }


}
