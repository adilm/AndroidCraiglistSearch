package com.androidapp.CLApp;


//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicNameValuePair;
import com.androidapp.CLApp.R;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;

public class MyTesterActivity extends Activity {	
	TextView textView;
	EditText et;
	private String textSearch;
	
    /** Called when the activity is first created. */
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout1);
        TextView tv = new TextView(this); 
        tv.setText(R.string.Joe);
        ll.addView(tv);
        
        setContentView(R.layout.main);
        registerForContextMenu(tv);
    }
    
    public void onGetClick(View v) 
    {
    	TextView textView = (TextView)findViewById(R.id.viewText1);
    	textView.setText("");
        et = (EditText) findViewById(R.id.editText1);
        textSearch=et.getText().toString();
    	MyHttpGet http =  new MyHttpGet();
    	MyHttpGet1 http1 =  new MyHttpGet1();
    	http1.setUrl(textSearch);
    	http1.execute(textView);
    	http.setUrl(textSearch);
    	http.execute(textView);
    }    

    
}