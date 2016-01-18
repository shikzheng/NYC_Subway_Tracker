package com.whiterabbit.simplemtaapp;

import android.os.AsyncTask;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class ServiceStatus extends AsyncTask {

    URL url;
    ArrayList<String> name = new ArrayList();
    ArrayList<String> status = new ArrayList();
    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            url = new URL("http://web.mta.info/status/serviceStatus.txt");

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(false);
            XmlPullParser xpp = factory.newPullParser();

            xpp.setInput(getInputStream(url), "UTF_8");
            boolean insideLine = false;

            int eventType = xpp.getEventType();
            int check = 0;  //used to limit number of subway lines I want to display
            while (eventType != XmlPullParser.END_DOCUMENT) {
                if (eventType == XmlPullParser.START_TAG) {

                    if (xpp.getName().equalsIgnoreCase("<line>")) {
                        insideLine = true;
                    } else if (xpp.getName().equalsIgnoreCase("<name>")){
                        if (insideLine)
                            name.add(xpp.nextText());
                        //check = check + 1;
                    } else if (xpp.getName().equalsIgnoreCase("<status>")) {
                        if (insideLine)
                            status.add(xpp.nextText());
                    }
                } else if (eventType == XmlPullParser.END_TAG && xpp.getName().equalsIgnoreCase("line")) {
                    insideLine = false;
                }

                eventType = xpp.next();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }


    public InputStream getInputStream(URL url) {
        try {
            return url.openConnection().getInputStream();
        } catch (IOException e) {
            return null;
        }
    }

    public ArrayList<String> name()
    {
        return name;
    }

    public ArrayList<String> status()
    {
        return status;
    }
}
