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


public class status6 extends AppCompatActivity{
    ArrayList<String> full = new ArrayList<String>();
    ArrayList<String> text = new ArrayList<String>();
    URL url;
    TextView tmp;
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
    protected void onCreate(Bundle savedInstanceState){
        this.setTitle("Line G Status");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statusdetail2);
        new AsyncTaskData().execute();
        tmp = (TextView)findViewById(R.id.statusdetail2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_status_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refresh:
                finish();
                startActivity(getIntent());
                break;
            case R.id.goStatus:
                returnStatus();
                break;
        }
        return true;
    }



    private void returnStatus(){
        startActivity(new Intent("com.example.android.nycsubway.Status"));
    }



    private class AsyncTaskData extends AsyncTask<Void, Void, ArrayList<String>> {
        private ProgressDialog progDailog = new ProgressDialog(com.whiterabbit.simplemtaapp.status6.this);

        protected void onPreExecute(){
            super.onPreExecute();
            progDailog.setMessage("Loading...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(true);
            progDailog.show();
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
                deleteFile("status6");
            return text;}else{
                return ReadArrayListFromSD(com.whiterabbit.simplemtaapp.status6.this,"status6");
            }
        }

        protected void onPostExecute(ArrayList<String> text){
            if(text.size()==0){
                text.add("");
                text.add("");
                text.add("");
                text.add("");
                text.add("");
                text.add("No Internet Connection");
            }
            SaveArrayListToSD(com.whiterabbit.simplemtaapp.status6.this,"status6",text);
            String before = filterTags(text.get(5));
            String result = before.replaceAll("planned work","");
            result = result.replaceAll("\\s+"," ").trim();
            StringBuilder temp = new StringBuilder(result);
            for(int i = 0; i < temp.length();i++){
                if(temp.charAt(i)=='.'&&(temp.lastIndexOf(".")!=i)){
                    temp.setCharAt(i+2,Character.toUpperCase(result.charAt(i + 2)));
                }
            }
            for(int i = 0; i < temp.length();i++){
                if(temp.charAt(i)=='.'&&(temp.lastIndexOf(".")!=i)){
                    temp.replace(i,i+2,".+\n\n");
                }
            }
            for(int i = 0; i < temp.length();i++){
                if(temp.charAt(i)=='+'&&(temp.lastIndexOf(".")!=i)){
                    temp.deleteCharAt(i);
                }
            }

            String output = temp.toString();
            output = filterTags2(output);
            output = filterTags3(output);
            output = filterTags4(output);
            output = filterTags5(output);
            output = filterTags6(output);
            tmp.setText(output);

            progDailog.dismiss();
        }
    }


    public String filterTags(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            if(sb.charAt(i)=='<'){
                while(sb.charAt(i)!='>'){
                    sb.deleteCharAt(i);
                }
                i = i-1;
            }
            if(sb.charAt(i)=='>'){
                sb.deleteCharAt(i);
                i = i-1;
            }
            if(sb.length()==i){
                break;
            }
        }
        String filtered = sb.toString();
        return filtered;
    }
    public String filterTags2(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            if(sb.charAt(i)=='&'){
                while(sb.charAt(i)!=';'){
                    sb.deleteCharAt(i);
                }
                i = i-1;
            }
            if(sb.charAt(i)==';'){
                sb.deleteCharAt(i);
                i = i-1;
            }
            if(sb.length()==i){
                break;
            }
        }
        String filtered = sb.toString();
        return filtered;
    }

    public String filterTags3(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            if(sb.charAt(i)=='['&&sb.charAt(i+1)=='a'&&sb.charAt(i+2)=='d'){
                while(sb.charAt(i)!=']'){
                    sb.deleteCharAt(i);
                }
                if(sb.charAt(i)==']'){
                    sb.deleteCharAt(i);
                    i = i-1;
                }
                i = i-1;
            }
            if(sb.length()==i){
                break;
            }
        }
        String filtered = sb.toString();
        return filtered;
    }

    public String filterTags4(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            if(sb.charAt(i)=='N'&&sb.charAt(i+1)=='b'&&sb.charAt(i+2)=='s'){
                while(sb.charAt(i)!='p'){
                    sb.deleteCharAt(i);
                }
                if(sb.charAt(i)=='p'){
                    sb.deleteCharAt(i);
                    i = i-1;
                }
                i = i-1;
            }
            if(sb.length()==i){
                break;
            }
        }
        String filtered = sb.toString();
        return filtered;
    }

    public String filterTags5(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            if(sb.charAt(i)=='['&&sb.charAt(i+1)=='f'&&sb.charAt(i+2)=='f'){
                while(sb.charAt(i)!=']'){
                    sb.deleteCharAt(i);
                }
                if(sb.charAt(i)==']'){
                    sb.deleteCharAt(i);
                    i = i-1;
                }
                i = i-1;
            }
            if(sb.length()==i){
                break;
            }
        }
        String filtered = sb.toString();
        return filtered;
    }
    public String filterTags6(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            if(sb.charAt(i)=='['&&sb.charAt(i+1)=='t'&&sb.charAt(i+2)=='p'){
                while(sb.charAt(i)!=']'){
                    sb.deleteCharAt(i);
                }
                if(sb.charAt(i)==']'){
                    sb.deleteCharAt(i);
                    i = i-1;
                }
                i = i-1;
            }
            if(sb.length()==i){
                break;
            }
        }
        String filtered = sb.toString();
        return filtered;
    }

}
