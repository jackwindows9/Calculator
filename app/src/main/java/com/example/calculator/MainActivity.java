package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView1;
    private TextView textView2;
    private Double num1;
    private Double num2;
    private Double result;
    private String op;
    private String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textview1);
        textView1.setCursorVisible(false);
        textView1.setGravity(Gravity.RIGHT | Gravity.CENTER);
        textView2=(TextView) findViewById(R.id.textview2);
        textView2.setCursorVisible(false);
        textView2.setGravity(Gravity.RIGHT | Gravity.CENTER);

        Button num0= (Button) findViewById(R.id.num0);
        num0.setOnClickListener(this);
        Button num1= (Button) findViewById(R.id.num1);
        num1.setOnClickListener(this);
        Button num2= (Button) findViewById(R.id.num2);
        num2.setOnClickListener(this);
        Button num3= (Button) findViewById(R.id.num3);
        num3.setOnClickListener(this);
        Button num4= (Button) findViewById(R.id.num4);
        num4.setOnClickListener(this);
        Button num5= (Button) findViewById(R.id.num5);
        num5.setOnClickListener(this);
        Button num6= (Button) findViewById(R.id.num6);
        num6.setOnClickListener(this);
        Button num7= (Button) findViewById(R.id.num7);
        num7.setOnClickListener(this);
        Button num8= (Button) findViewById(R.id.num8);
        num8.setOnClickListener(this);
        Button num9= (Button) findViewById(R.id.num9);
        num9.setOnClickListener(this);
        Button op0=(Button) findViewById(R.id.op0);
        op0.setOnClickListener(this);
        Button op1=(Button)findViewById(R.id.op1);
        op1.setOnClickListener(this);
        Button op2=(Button)findViewById(R.id.op2);
        op2.setOnClickListener(this);
        Button op3=(Button)findViewById(R.id.op3);
        op3.setOnClickListener(this);
        Button op4=(Button)findViewById(R.id.op4);
        op4.setOnClickListener(this);
        Button dot=(Button)findViewById(R.id.chardot);
        dot.setOnClickListener(this);
        Button del=(Button)findViewById(R.id.chardel);
        del.setOnClickListener(this);
        Button delAll=(Button)findViewById(R.id.charc);
        delAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num0:
                s+="0";
                textView2.setText(s);
                break;
            case R.id.num1:
                s+="1";
                textView2.setText(s);
                break;
            case R.id.num2:
                s+="2";
                textView2.setText(s);
                break;
            case R.id.num3:
                s+="3";
                textView2.setText(s);
                break;
            case R.id.num4:
                s+="4";
                textView2.setText(s);
                break;
            case R.id.num5:
                s+="5";
                textView2.setText(s);
                break;
            case R.id.num6:
                s+="6";
                textView2.setText(s);
                break;
            case R.id.num7:
                s+="7";
                textView2.setText(s);
                break;
            case R.id.num8:
                s+="8";
                textView2.setText(s);
                break;
            case R.id.num9:
                s+="9";
                textView2.setText(s);
                break;
            case R.id.op0:
                int opNumber=1;
                if(s.indexOf("+")!=-1) {
                    opNumber = s.indexOf("+");
                    num2=Double.parseDouble(s.substring(opNumber+1,s.length()));
                    result=num1+num2;
                }
                if(s.indexOf("-")!=-1) {
                    opNumber = s.indexOf("-");
                    num2=Double.parseDouble(s.substring(opNumber+1,s.length()));
                    result=num1-num2;
                }
                if(s.indexOf("*")!=-1) {
                    opNumber = s.indexOf("*");
                    num2=Double.parseDouble(s.substring(opNumber+1,s.length()));
                    result=num1*num2;
                }
                if(s.indexOf("/")!=-1) {
                    opNumber = s.indexOf("/");
                    num2=Double.parseDouble(s.substring(opNumber+1,s.length()));
                    if(num1!=1) {
                        result = num1 / num2;
                    }
                }
                textView1.setText(s);
                textView2.setText(result+"");
                s="";
                break;
            case R.id.op1:
                op="+";
                if(s.length()>=1){
                    if(s.substring(s.length()-1,s.length()).equals(".")){
                        s=s.substring(0,s.length()-1);
                    }
                }
                if(s.length()>=1){
                    num1=Double.parseDouble(s);
                }
                if(s.length()>=1){
                    String lastChar=s.substring(s.length()-1,s.length());
                    if(lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("*")||lastChar.equals("/")){
                        s=s.substring(0,s.length()-1);
                        s+="+";
                        textView2.setText(s);
                    }
                    else{
                        s+="+";
                        textView2.setText(s);
                    }
                }
                break;
            case R.id.op2:
                op="-";
                if(s.length()>=1){
                    if(s.substring(s.length()-1,s.length()).equals(".")){
                        s=s.substring(0,s.length()-1);
                    }
                }
                if(s.length()>=1){
                    num1=Double.parseDouble(s);
                }
                if(s.length()>=1){
                    String lastChar=s.substring(s.length()-1,s.length());
                    if(lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("*")||lastChar.equals("/")){
                        s=s.substring(0,s.length()-1);
                        s+="-";
                        textView2.setText(s);
                    }
                    else{
                        s+="-";
                        textView2.setText(s);
                    }
                }
                break;
            case R.id.op3:
                op="*";
                if(s.length()>=1){
                    if(s.substring(s.length()-1,s.length()).equals(".")){
                        s=s.substring(0,s.length()-1);
                    }
                }
                if(s.length()>=1){
                    String lastChar=s.substring(s.length()-1,s.length());
                    if(lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("*")||lastChar.equals("/")){
                        s=s.substring(0,s.length()-1);
                        s+="*";
                        textView2.setText(s);
                    }
                    else{
                        num1=Double.parseDouble(s);
                        s+="*";
                        textView2.setText(s);
                    }
                }
                break;
            case R.id.op4:
                op="/";
                if(s.length()>=1){
                    if(s.substring(s.length()-1,s.length()).equals(".")){
                        s=s.substring(0,s.length()-1);
                    }
                }
                if(s.length()>=1){
                    num1=Double.parseDouble(s);
                }
                if(s.length()>=1){
                    String lastChar=s.substring(s.length()-1,s.length());
                    if(lastChar.equals("+")||lastChar.equals("-")||lastChar.equals("*")||lastChar.equals("/")){
                        s=s.substring(0,s.length()-1);
                        s+="/";
                        textView2.setText(s);
                    }
                    else{
                        s+="/";
                        textView2.setText(s);
                    }
                }
                break;
            case R.id.chardel:
                if(s.length()>=1){
                    s=s.substring(0,s.length()-1);
                    textView2.setText(s);
                }
                break;
            case R.id.chardot:
                s+=".";
                textView2.setText(s);
                break;
            case R.id.charc:
                s="";
                textView1.setText(s);
                textView2.setText(s);
                break;
        }
    }
}
