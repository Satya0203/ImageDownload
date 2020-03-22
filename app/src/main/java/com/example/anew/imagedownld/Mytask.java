package com.example.anew.imagedownld;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class Mytask extends AsyncTask
{
    InputStream ins;
    URL url;
    MainActivity mainActivity;

    public Mytask(MainActivity mainAct)
    {
        mainActivity=mainAct;
        //iv=mainActivity.findViewById(R.id.ig1);
    }

    @Override
    protected Object doInBackground(Object[] objects)
    {
        try
        {
             url=new URL("https://www.google.com/imgres?imgurl=http%3A%2F%2Fbdfjade.com%2Fdata%2Fout%2F114%2F6184464-wallpapers-for-desktop.jpg&imgrefurl=http%3A%2F%2Fbdfjade.com%2Fwallpapers-for-desktop.html&docid=f_QN1LQFXKqbjM&tbnid=9nRVZ9uEwkq73M%3A&vet=10ahUKEwiOx_7-0LzbAhVGWH0KHY-PCbEQMwiUAigQMBA..i&w=2119&h=1415&bih=615&biw=1280&q=desktop%20backgrounds&ved=0ahUKEwiOx_7-0LzbAhVGWH0KHY-PCbEQMwiUAigQMBA&iact=mrc&uact=8");
            ins=url.openStream();

            Bitmap bmp= BitmapFactory.decodeStream(ins);
            mainActivity.iv.setImageBitmap(bmp);
        }
        catch (Exception e)
        {
           // e.printStackTrace();
        }
        return null;
    }

}
