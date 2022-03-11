package com.houseapp.app;


import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class apartment13 extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    TextView view_name;
    TextView view_phone;
    TextView view_all;
    ImageButton call;
    CheckBox jan;
    CheckBox feb;
    CheckBox march;
    CheckBox april;
    CheckBox may;
    CheckBox june;
    CheckBox july;
    CheckBox aug;
    CheckBox sep;
    CheckBox oct;
    CheckBox nov;
    CheckBox dec;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment13);

        view_name = (TextView) findViewById(R.id.txt_name2);
        view_phone = (TextView) findViewById(R.id.txt_phone2);
        view_all = (TextView) findViewById(R.id.txt_all2);
        load_data();
        call = findViewById(R.id.call_btn2);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                load_phone();

            }
        });

        jan = (CheckBox) findViewById(R.id.checkBox1222);
        jan.setChecked(updatecheckbox("CHECK1"));
        jan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK1",b);

            }
        });
        feb = (CheckBox) findViewById(R.id.checkBox22);
        feb.setChecked(updatecheckbox("CHECK2"));
        feb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK2",b);

            }
        });
        march = (CheckBox) findViewById(R.id.checkBox32);
        march.setChecked(updatecheckbox("CHECK3"));
        march.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK3",b);

            }
        });
        april = (CheckBox) findViewById(R.id.checkBox42);
        april.setChecked(updatecheckbox("CHECK4"));
        april.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK4",b);

            }
        });
        may = (CheckBox) findViewById(R.id.checkBox52);
        may.setChecked(updatecheckbox("CHECK5"));
        may.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK5",b);

            }
        });
        june = (CheckBox) findViewById(R.id.checkBox62);
        june.setChecked(updatecheckbox("CHECK6"));
        june.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK6",b);

            }
        });
        july = (CheckBox) findViewById(R.id.checkBox72);
        july.setChecked(updatecheckbox("CHECK7"));
        july.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK7",b);

            }
        });
        aug = (CheckBox) findViewById(R.id.checkBox82);
        aug.setChecked(updatecheckbox("CHECK8"));
        aug.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK8",b);

            }
        });
        sep = (CheckBox) findViewById(R.id.checkBox92);
        sep.setChecked(updatecheckbox("CHECK9"));
        sep.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK9",b);

            }
        });
        oct = (CheckBox) findViewById(R.id.checkBox102);
        oct.setChecked(updatecheckbox("CHECK10"));
        oct.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK10",b);

            }
        });
        nov = (CheckBox) findViewById(R.id.checkBox112);
        nov.setChecked(updatecheckbox("CHECK11"));
        nov.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK11",b);

            }
        });
        dec = (CheckBox) findViewById(R.id.checkBox122);
        dec.setChecked(updatecheckbox("CHECK12"));
        dec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                SaveCheckbox("CHECK12",b);

            }
        });


    }

    private void SaveCheckbox(String key,boolean value)
    {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }
    private boolean updatecheckbox(String key)
    {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        return sp.getBoolean(key,false);
    }

    public void load_data()
    {
        FileInputStream fis = null;
        try {
            fis = openFileInput(apartment13_edit.FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();

            String name;

            while((name = br.readLine()) != null )
            {
                sb.append(name).append("\n");

           }
            view_all.setText(sb.toString());

        }
        catch(FileNotFoundException e)
        {

        } catch (IOException e) {

        }
        finally {
            if(fis != null)
            {
                try {
                    fis.close();
                }
                catch(IOException e)
                {

                }
            }
        }
    }

    public void load_phone()
    {
        FileInputStream fis = null;
        try {
            fis = openFileInput(apartment13_edit.FILE_PHONE);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();

            String phone;

            while((phone = br.readLine()) != null )
            {
                sb.append(phone).append("\n");

            }
            String phonenumber = sb.toString();
            if(ContextCompat.checkSelfPermission(apartment13.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(apartment13.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);

            }
            else
            {
                String dial = "tel:" + phonenumber;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }

            System.out.println(phonenumber);


        }
        catch(FileNotFoundException e)
        {

        } catch (IOException e) {

        }
        finally {
            if(fis != null)
            {
                try {
                    fis.close();
                }
                catch(IOException e)
                {

                }
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL)
        {
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                load_phone();
            }
            else
            {
                Toast.makeText(this,"No permission to call",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void btn_edit(View v)
    {
        Intent intent = new Intent(this,apartment13_edit.class);
        startActivity(intent);

    }




}