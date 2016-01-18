package com.whiterabbit.simplemtaapp;

import android.app.Activity;
import android.app.ListActivity;
import android.app.LoaderManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.transit.realtime.GtfsRealtime;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.parse.ParseObject;
/**
 * Created by Administrator on 8/6/2015.
 */
public class L3S33S extends AppCompatActivity {

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
    public void onCreate(Bundle savedInstanceState){
        this.setTitle("Van Siclen Avenue");
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.l1s1layout);
        new AsyncTaskData().execute();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_mainns, menu);
        return true;
    }
    private void North(){
        startActivity(new Intent("com.example.android.nycsubway.L3S33N"));
    }
    private void Station1(){
        startActivity(new Intent("com.example.android.nycsubway.line3"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.refresh:
                finish();
                startActivity(getIntent());
                break;
            case R.id.north:
                North();
                break;
            case R.id.south:
                finish();
                startActivity(getIntent());
                break;
            case R.id.station1:
                Station1();
                break;
        }
        return true;
    }

    private class AsyncTaskData extends AsyncTask<Void, Void, ArrayList<String>> {
        private ProgressDialog progDailog = new ProgressDialog(L3S33S.this);

        protected void onPreExecute() {
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
            ArrayList<String> datalist = new ArrayList<String>();
            URL url = null;
            GtfsRealtime.FeedMessage feed;
            try {
                url = new URL("http://datamine.mta.info/mta_esi.php?key=efcec9a1d8e6d2aeab4bbbbb43df37da&feed_id=1");
                feed = GtfsRealtime.FeedMessage.parseFrom(url.openStream());
                for (GtfsRealtime.FeedEntity entity : feed.getEntityList()) {
                    if (entity.getTripUpdate().getTrip().getRouteId().equals("3")) {
                        for (GtfsRealtime.TripUpdate.StopTimeUpdate stu : entity.getTripUpdate().getStopTimeUpdateList()) {
                            if (stu.getStopId().equals("256S")) {
                                Date date = new Date(stu.getArrival().getTime() * 1000);
                                Date phonedate = new Date(System.currentTimeMillis());
                                if (date.equals(phonedate) || date.after(phonedate)) {
                                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy  hh:mm:ss a");
                                    datalist.add(sdf.format(date));  //String
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
                if(datalist.size()==0){
                    datalist.add("No downtown times are available");
                }
                deleteFile("L3S33S");	//Downtown
            return datalist;}else{
                return ReadArrayListFromSD(L3S33S.this,"L3S33S");
            }
        }

        protected void onPostExecute(ArrayList<String> list1) {SaveArrayListToSD(L3S33S.this,"L3S33S",list1);
            ListView lv;
            progDailog.dismiss();
            lv = (ListView) findViewById(R.id.l1s1list);
            TextView tv;
            tv = new TextView(L3S33S.this);
            tv.setText("Arrival Time(Downtown)");
            tv.setTextColor(Color.WHITE);
            tv.setTypeface(null, Typeface.BOLD);
            tv.setGravity(Gravity.CENTER);
            tv.setTextSize(20);
            tv.setBackgroundResource(R.drawable.btn_blue23);
            lv.addHeaderView(tv);
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(L3S33S.this, R.layout.listviewlayout, list1);
            lv.setAdapter(arrayAdapter);
        }
    }



}