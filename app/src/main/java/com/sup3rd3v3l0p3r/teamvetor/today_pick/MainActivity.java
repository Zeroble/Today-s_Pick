package com.sup3rd3v3l0p3r.teamvetor.today_pick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
   public void decideButton (View v) {

       EditText editText = (EditText) findViewById(R.id.editText);
       TextView numView = (TextView) findViewById(R.id.numOfIndex);
       TextView resultView = (TextView) findViewById(R.id.result);

        String index = editText.getText().toString(); //받아옴


       char[] charIndex = index.toCharArray();
       int strlen = index.length();//문자열의 길이
       int numOfIndex=0; //갯수를저장하는 함수
       for(int i=0;i<strlen;i++){
           if(charIndex[i] == '/')
               numOfIndex++;
       }

       numOfIndex++;//갯수를 구하기위해 /의 갯수에 1을 더함
       numView.setText(""+numOfIndex);//갯수출력
    }
}
