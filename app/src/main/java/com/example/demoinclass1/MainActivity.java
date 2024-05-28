package com.example.demoinclass1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        MyGlobalSetting.MyExportedContext = (Context)this;
        super.onCreate(savedInstanceState);
        //Method2
//        Button button = (Button)findViewById(R.id.buttonWebsite);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // do something
//
//            }
//        });


//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // do something
//            }
//        };
//        Button button = (Button)findViewById(R.id.buttonWebsite);
//        button.setOnClickListener(listener);


//        Button button = (Button)findViewById(R.id.buttonWebsite);
//        button.setOnClickListener(this);
//        MyClass myClass = new MyClass();
//        button.setOnClickListener(myClass);
        setContentView(R.layout.activity_main);
    }

//    @Override
//    public void onConfigurationChanged(@NonNull Configuration newConfig) {
//        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
//            setContentView(R.layout.activity_main);
//        }
//        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            setContentView(R.layout.another_layout);
//        }
//        super.onConfigurationChanged(newConfig);
//    }

    public void onClickWebsiteUrl(View view) {
        // get the URL from the caption of the button
        String strUrl = ((Button)view).getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strUrl));
        startActivity(intent);
    }

    public void onClickTelephone(View view) {
        // dosth
        // text vs string
        String strPhone = ((Button)view).getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+strPhone));
        startActivity(intent);
    }

    public void onClickButton(View view) {
        if (view.getId()==R.id.buttonTelephone)
            onClickTelephone(view);
        else if (view.getId()==R.id.buttonWebsite)
            onClickWebsiteUrl(view);
    }

}

