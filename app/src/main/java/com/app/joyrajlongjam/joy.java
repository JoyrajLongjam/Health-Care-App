package com.app.joyrajlongjam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class joy<button33, Button34, button34> extends AppCompatActivity {
    private Button button32;
    Button button33;
    Button button34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joy);
        button32 = (Button) findViewById(R.id.button32);

        button32.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage();

            }
        });
        button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("");
            }
        });
        Button button63 = (Button) findViewById(R.id.button63);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage29();
            }



        });
    }

    private void openpage() {
        Intent intent = new Intent(this, miki.class);
        startActivity(intent);


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri.parse("https://mohfw.gov.in/")));
    }


    public void donation(View view){
        openUrl("https://www.google.com/aclk?sa=L&ai=DChcSEwjwi5nzhsHwAhX8nUsFHRw0BNwYABAJGgJzZg&ae=2&sig=AOD64_1AHeNJLmlw7tcCWTsjq797Y4W-Fw&q&adurl&ved=2ahUKEwjCjJHzhsHwAhUFIbcAHY4XDyMQ0Qx6BAgIEAE");
    }
public void openUrl(String url){
       Uri uri=Uri.parse(url);
       Intent launchWeb=new Intent(Intent.ACTION_VIEW,uri);
      startActivity(launchWeb);


}
    public void openpage29() {
        Intent intent = new Intent(this, medicine.class);
        startActivity(intent);
    }

    }




