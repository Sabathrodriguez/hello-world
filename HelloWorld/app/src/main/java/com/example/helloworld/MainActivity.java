package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean isWorking = true;
    public void buttonIsClicked(View view) {
//        String t = String.valueOf(((TextView) findViewById(R.id.textView1)).getText());
//        Log.i("TAG", t);

        //this is the text information
        String t2 = String.valueOf(((EditText) findViewById(R.id.editName)).getText());
//        Log.i("TEXTINFO", t2);
//
//        //This is the phone-number information
        String t3 = String.valueOf(((EditText) findViewById(R.id.phone_number)).getText());
//        Log.i("PHONE_NUMBER", t3);

//        Toast.makeText(MainActivity.this,"name: " + t2 +  "\nphone number: " + t3, Toast.LENGTH_LONG).show();


        final ImageView imageView = findViewById(R.id.imageView);
        imageView.setTag(1);

        if (isWorking) isWorking = false;
        else isWorking = true;

        if (isWorking) {
            imageView.setImageResource(R.drawable.broken_dolphin);
            Toast.makeText(MainActivity.this,"I'm not working :(", Toast.LENGTH_LONG).show();
        } else {
            imageView.setImageResource(R.drawable.working_dolphin);
            Toast.makeText(MainActivity.this,"I'm working :-)", Toast.LENGTH_LONG).show();
        }
    }

}
