package com.example.dice2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	TextView txt_result;
	ImageView img_me,img_ai;
	Button btn_start;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        txt_result = (TextView)findViewById(R.id.textView2);
        
        img_me = (ImageView)findViewById(R.id.imageView1);
        img_ai = (ImageView)findViewById(R.id.imageView2);
        
        btn_start =(Button)findViewById(R.id.button1);
        
        btn_start.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		int me_ran = (int)Math.round(Math.random()*5);
		int ai_ran = (int)Math.round(Math.random()*5);
		
		img_me.setImageResource(R.drawable.dice21 + me_ran);
		img_ai.setImageResource(R.drawable.dice21 + ai_ran);
		
		if (me_ran > ai_ran)
				txt_result.setText("당신이 이겼습니다.");
		else if(me_ran < ai_ran)
			txt_result.setText("당신이 졌습니다.");
		else
			txt_result.setText("비겼습니다.");
	}
}
