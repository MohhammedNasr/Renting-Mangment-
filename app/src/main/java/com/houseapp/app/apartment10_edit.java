package com.houseapp.app;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class apartment10_edit extends AppCompatActivity {

    public static final String FILE_NAME = "data10.txt";
    public static final String FILE_PHONE = "dataphone10.txt";
    EditText input_name;
    EditText input_phone;
    EditText input_rent;
    EditText input_insurance;
    EditText input_starting;
    EditText input_Ending;
    EditText input_Notes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment10_edit);
        input_name = (EditText) findViewById(R.id.inp_name);
        input_phone = (EditText) findViewById(R.id.inp_phone);
        input_rent = (EditText) findViewById(R.id.inp_rent);
        input_insurance = (EditText) findViewById(R.id.inp_insurance);
        input_starting = (EditText) findViewById(R.id.inp_start);
        input_Ending = (EditText) findViewById(R.id.inp_end);
        input_Notes = (EditText) findViewById(R.id.inp_notes);

    }



    public void btn_done(View f) throws FileNotFoundException
    {
        if(!input_name.getText().toString().isEmpty() && !input_phone.getText().toString().isEmpty()&& !input_rent.getText().toString().isEmpty()&& !input_insurance.getText().toString().isEmpty()&& !input_starting.getText().toString().isEmpty()&& !input_Ending.getText().toString().isEmpty()) {
            String name = input_name.getText().toString();
            String phone = input_phone.getText().toString();
            String rent = input_rent.getText().toString() + " EGP";
            String insurance = input_insurance.getText().toString() + " EGP";
            String starting = input_starting.getText().toString();
            String ending = input_Ending.getText().toString();
            String note = input_Notes.getText().toString();
            String space = "\n";
            FileOutputStream fos = null;
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            try {
                fos.write(name.getBytes());
                fos.write(space.getBytes());
                fos.write(phone.getBytes());
                fos.write(space.getBytes());
                fos.write(rent.getBytes());
                fos.write(space.getBytes());
                fos.write(insurance.getBytes());
                fos.write(space.getBytes());
                fos.write(starting.getBytes());
                fos.write(space.getBytes());
                fos.write(ending.getBytes());
                fos.write(space.getBytes());
                fos.write(space.getBytes());
                fos.write(note.getBytes());
                fos.write(space.getBytes());
                input_name.getText().clear();
                input_phone.getText().clear();
                input_rent.getText().clear();
                input_insurance.getText().clear();
                input_starting.getText().clear();
                input_Ending.getText().clear();
                input_Notes.getText().clear();
                Toast.makeText(this, "data saved", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {

                    }
                }
            }


            FileOutputStream foss = null;
            foss = openFileOutput(FILE_PHONE, MODE_PRIVATE);
            try {

                foss.write(phone.getBytes());


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (foss != null) {
                    try {
                        foss.close();
                    } catch (IOException e) {

                    }
                }
            }
        }
        else
        {
            Toast.makeText(this, "must input all data", Toast.LENGTH_SHORT).show();
        }

    }




}