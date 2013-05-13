package com.example.todolist;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	//private EditText edittext;
	private Button startButt;
	private Person me;
	//private 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*Intent intent = new Intent();
		 intent.setClass(this,LoginActivity.class);
		 startActivity(intent);*/
		//addKeyListener();
		me = new Person ("asdf1234","jy4ny@virginia.edu","Devin Lee");
		
		addButtonListener();
	}
	public void addButtonListener (){
		startButt = (Button)findViewById(R.id.button1);
		startButt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            	startActivity(i);
            }
        });
		
	}
	/*public void addKeyListener() {
		 
		// get edittext component
		edittext = (EditText) findViewById(R.id.editText);
	 
		// add a keylistener to keep track user input
		edittext.setOnKeyListener(new OnKeyListener() {
		public boolean onKey(View v, int keyCode, KeyEvent event) {
	 
			// if keydown and "enter" is pressed
			if ((event.getAction() == KeyEvent.ACTION_DOWN)
				&& (keyCode == KeyEvent.KEYCODE_ENTER)) {
	 
				// display a floating message
				Toast.makeText(MainActivity.this,
					edittext.getText(), Toast.LENGTH_LONG).show();
				return true;
	 
			} else if ((event.getAction() == KeyEvent.ACTION_DOWN)
				&& (keyCode == KeyEvent.KEYCODE_9)) {
	 
				// display a floating message
				Toast.makeText(MainActivity.this,
					"Number 9 is pressed!", Toast.LENGTH_LONG).show();
				return true;
			}
	 
			return false;
		}
	 });
	}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
