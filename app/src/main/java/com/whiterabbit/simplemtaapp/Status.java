package com.whiterabbit.simplemtaapp;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import com.google.transit.realtime.GtfsRealtime;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class Status extends AppCompatActivity implements OnClickListener{
    ArrayList<String> status = new ArrayList<String>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<String> full = new ArrayList<String>();
    ArrayList<String> text = new ArrayList<String>();
    private final static String TAG = Status.class.getSimpleName();
    ArrayList<String> items = new ArrayList<String>();
    URL url;
    Button StatusButton1;
    Button StatusButton2;
    Button StatusButton3;
    Button StatusButton4;
    Button StatusButton5;
    Button StatusButton6;
    Button StatusButton7;
    Button StatusButton8;
    Button StatusButton9;
    Button StatusButton10;

    public static <E> void SaveArrayListToSD(Context mContext, String filename, ArrayList<String> list){
        try {
            FileOutputStream fos = mContext.openFileOutput(filename + ".dat", mContext.MODE_PRIVATE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> ReadArrayListFromSD(Context mContext,String filename){
        try {
            FileInputStream fis = mContext.openFileInput(filename + ".dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<String> obj= (ArrayList<String>) ois.readObject();
            fis.close();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<String>();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Service Status");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newstatus);
        new AsyncTaskData().execute();
        StatusButton1 = (Button)findViewById(R.id.status1);
        StatusButton1.setOnClickListener(this);
        StatusButton2 = (Button)findViewById(R.id.status2);
        StatusButton2.setOnClickListener(this);
        StatusButton3 = (Button)findViewById(R.id.status3);
        StatusButton3.setOnClickListener(this);
        StatusButton4 = (Button)findViewById(R.id.status4);
        StatusButton4.setOnClickListener(this);
        StatusButton5 = (Button)findViewById(R.id.status5);
        StatusButton5.setOnClickListener(this);
        StatusButton6 = (Button)findViewById(R.id.status6);
        StatusButton6.setOnClickListener(this);
        StatusButton7 = (Button)findViewById(R.id.status7);
        StatusButton7.setOnClickListener(this);
        StatusButton8 = (Button)findViewById(R.id.status8);
        StatusButton8.setOnClickListener(this);
        StatusButton9 = (Button)findViewById(R.id.status9);
        StatusButton9.setOnClickListener(this);
        StatusButton10 = (Button)findViewById(R.id.status10);
        StatusButton10.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_status, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refresh:
                finish();
                startActivity(getIntent());
                break;
            case R.id.goLines:
                finish();
                Intent a = new Intent(this, MainActivity.class);
                startActivity(a.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                break;
        }
        return true;
    }



    private void statusClick1(){
        startActivity(new Intent("com.example.android.nycsubway.status1"));
    }
    private void statusClick2(){
        startActivity(new Intent("com.example.android.nycsubway.status2"));
    }
    private void statusClick3(){
        startActivity(new Intent("com.example.android.nycsubway.status3"));
    }
    private void statusClick4(){
        startActivity(new Intent("com.example.android.nycsubway.status4"));
    }
    private void statusClick5(){
        startActivity(new Intent("com.example.android.nycsubway.status5"));
    }
    private void statusClick6(){
        startActivity(new Intent("com.example.android.nycsubway.status6"));
    }
    private void statusClick7(){
        startActivity(new Intent("com.example.android.nycsubway.status7"));
    }
    private void statusClick8(){
        startActivity(new Intent("com.example.android.nycsubway.status8"));
    }
    private void statusClick9(){
        startActivity(new Intent("com.example.android.nycsubway.status9"));
    }
    private void statusClick10(){
        startActivity(new Intent("com.example.android.nycsubway.status10"));
    }




    public void onClick(View v){
        switch(v.getId()){
            case R.id.status1:
                statusClick1();
                break;
            case R.id.status2:
                statusClick2();
                break;
            case R.id.status3:
                statusClick3();
                break;
            case R.id.status4:
                statusClick4();
                break;
            case R.id.status5:
                statusClick5();
                break;
            case R.id.status6:
                statusClick6();
                break;
            case R.id.status7:
                statusClick7();
                break;
            case R.id.status8:
                statusClick8();
                break;
            case R.id.status9:
                statusClick9();
                break;
            case R.id.status10:
                statusClick10();
                break;
        }
    }
    private class AsyncTaskData extends AsyncTask<Void, Void, ArrayList<String>> {
        private ProgressDialog progDailog = new ProgressDialog(com.whiterabbit.simplemtaapp.Status.this);

        protected void onPreExecute(){
        }
        protected ArrayList<String> doInBackground(Void... arg0) {
            ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mWifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (mWifi.isConnected()) {
            try {
                URL url = new URL("http://web.mta.info/status/serviceStatus.txt");
                URLConnection conn = url.openConnection();

                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(conn.getInputStream());

                NodeList nodes = doc.getElementsByTagName("line");
                for (int i = 0; i < 10; i++) {
                    Element element = (Element) nodes.item(i);
                    NodeList title = element.getElementsByTagName("name");
                    Element line = (Element) title.item(0);
                    name.add(line.getTextContent());
                }

                NodeList nodes1 = doc.getElementsByTagName("line");
                for (int i = 0; i < 10; i++) {
                    Element element1 = (Element) nodes1.item(i);
                    NodeList title1 = element1.getElementsByTagName("status");
                    Element line1 = (Element) title1.item(0);
                    status.add(line1.getTextContent().toLowerCase());
                }

                NodeList nodes2 = doc.getElementsByTagName("line");
                for (int i = 0; i < 10; i++) {
                    Element element2 = (Element) nodes2.item(i);
                    NodeList title2 = element2.getElementsByTagName("text");
                    Element line2 = (Element) title2.item(0);
                    text.add(line2.getTextContent().toLowerCase());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }



            for (int i = 0; i < name.size(); i++) {
                if(i == 0||i==1||i==3||i==4||i==6||i==8) {
                    String complete = "Lines " + commas(name.get(i)) + " has " + status.get(i);
                    full.add(complete);
                }
                else if(i==2||i==5||i==7||i==9){
                    String complete = "Line " + commas(name.get(i)) + " has " + status.get(i);
                    full.add(complete);
                }
            }

                deleteFile("Status");
            return full;}
            else{
                return ReadArrayListFromSD(com.whiterabbit.simplemtaapp.Status.this,"Status");
            }
        }

        protected void onPostExecute(ArrayList<String> full){
            SaveArrayListToSD(com.whiterabbit.simplemtaapp.Status.this,"Status",full);
            if(full.size()==10) {
                StatusButton1.setText(full.get(0));
                StatusButton2.setText(full.get(1));
                StatusButton3.setText(full.get(2));
                StatusButton4.setText(full.get(3));
                StatusButton5.setText(full.get(4));
                StatusButton6.setText(full.get(5));
                StatusButton7.setText(full.get(6));
                StatusButton8.setText(full.get(7));
                StatusButton9.setText(full.get(8));
                StatusButton10.setText(full.get(9));
            }else{
                StatusButton1.setText("Lines 1,2,3 has ");
                StatusButton2.setText("Lines 4,5,6 has ");
                StatusButton3.setText("Line 7 has ");
                StatusButton4.setText("Lines A,C,E has ");
                StatusButton5.setText("Lines B,D,F,M has ");
                StatusButton6.setText("Line G has ");
                StatusButton7.setText("Lines J,Z has ");
                StatusButton8.setText("Line L has ");
                StatusButton9.setText("Lines N,Q,R has ");
                StatusButton10.setText("Line S has ");
                StatusButton1.setClickable(false);
                StatusButton2.setClickable(false);
                StatusButton3.setClickable(false);
                StatusButton4.setClickable(false);
                StatusButton5.setClickable(false);
                StatusButton6.setClickable(false);
                StatusButton7.setClickable(false);
                StatusButton8.setClickable(false);
                StatusButton9.setClickable(false);
                StatusButton10.setClickable(false);
                return;
            }
                String search = "good";
                if(full.get(0).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton1.setClickable(false);
                }else{
                    StatusButton1.setBackgroundColor(Color.rgb(183, 28, 28));
                }
                if(full.get(1).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton2.setClickable(false);
                }else{
                    StatusButton2.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(2).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton3.setClickable(false);
                }else{
                    StatusButton3.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(3).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton4.setClickable(false);
                }else{
                    StatusButton4.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(4).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton5.setClickable(false);
                }else{
                    StatusButton5.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(5).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton6.setClickable(false);
                }else{
                    StatusButton6.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(6).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton7.setClickable(false);
                }else{
                    StatusButton7.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(7).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton8.setClickable(false);
                }else{
                    StatusButton8.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(8).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton9.setClickable(false);
                }else{
                    StatusButton9.setBackgroundColor(Color.rgb(183,28,28));
                }
                if(full.get(9).toLowerCase().indexOf(search.toLowerCase()) != -1){
                    StatusButton10.setClickable(false);
            }else{
                    StatusButton10.setBackgroundColor(Color.rgb(183,28,28));
                }
        }
    }

    public String commas(String s){
        if(s.charAt(0)=='1'){
            return "1,2,3";
        }
        if(s.charAt(0)=='4'){
            return "4,5,6";
        }
        if(s.charAt(0)=='A'){
            return "A,C,E";
        }
        if(s.charAt(0)=='B'){
            return "B,D,F,M";
        }
        if(s.charAt(0)=='J'){
            return "J,Z";
        }
        if(s.charAt(0)=='N'){
            return "N,Q,R";
        }
        return s;
    }



}
