package com.example.addtownumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button next,reset;
    private TextView Pimport,cName,Obrackets,mainMethod,openMainMethod,ScannerText,firstNumber,secondNumber,result,sumOfNumber,num1Text,num2Text,showNum1,showNum2,plus,addition
            ,closeMethod,closeClass;
    private ImageView mainImage;
    private EditText num1,num2;
    int count  = 1;
    private Animation side,left;
    String n1;
    String n2;
    int res;

    private TextView line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,line14,line15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window  window = this.getWindow();
        setContentView(R.layout.activity_main);
        window.setStatusBarColor(this.getResources().getColor(R.color.start));

        next = findViewById(R.id.nextBnt);
        reset = findViewById(R.id.resetBtn);
        Pimport = findViewById(R.id.pImport);
        cName = findViewById(R.id.className);
        Obrackets = findViewById(R.id.openBrackets);
        mainImage = findViewById(R.id.mainImage);
        mainMethod = findViewById(R.id.mainMethod);
        ScannerText = findViewById(R.id.ScannerObj);
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        num1 = findViewById(R.id.input1);
        num2 = findViewById(R.id.input2);
        result = findViewById(R.id.result);
        openMainMethod = findViewById(R.id.openMainMethod);
        addition = findViewById(R.id.Addition);
        closeMethod = findViewById(R.id.close_method);
        closeClass = findViewById(R.id.close_class);

        sumOfNumber = findViewById(R.id.sumOfNumber);
        num1Text = findViewById(R.id.textView5);
        num2Text = findViewById(R.id.textView6);
        showNum1 = findViewById(R.id.showNum1);
        showNum2 = findViewById(R.id.showNum2);
        plus = findViewById(R.id.plus);

        line1 = findViewById(R.id.line1);
        line2 = findViewById(R.id.line2);
        line3 = findViewById(R.id.line3);
        line4 = findViewById(R.id.line4);
        line5 = findViewById(R.id.line5);
        line6 = findViewById(R.id.line6);
        line7 = findViewById(R.id.line7);
        line8 = findViewById(R.id.line8);
        line9 = findViewById(R.id.line9);
        line10 = findViewById(R.id.line10);
        line11 = findViewById(R.id.line11);
        line12 = findViewById(R.id.line12);
        line13 = findViewById(R.id.line13);
        line14 = findViewById(R.id.line14);
        line15 = findViewById(R.id.line15);






        side = AnimationUtils.loadAnimation(this,R.anim.text_anim);
        left = AnimationUtils.loadAnimation(this,R.anim.left);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count==1) {
                    Pimport.setVisibility(View.VISIBLE);
                    Pimport.setAnimation(side);
                    line1.setTextSize(24);
                    line1.setTextColor(getResources().getColor(R.color.red));

                }
                else if(count==2){
                    cName.setVisibility(View.VISIBLE);
                    cName.setAnimation(left);
                    Pimport.setVisibility(View.GONE);

                    line1.setTextSize(16);
                    line1.setTextColor(getResources().getColor(R.color.black));

                    line2.setTextSize(24);
                    line2.setTextColor(getResources().getColor(R.color.red));

                }

                else if(count == 3){
                    Obrackets.setVisibility(View.VISIBLE);
                    Obrackets.setAnimation(side);
                    cName.setVisibility(View.GONE);

                    line2.setTextSize(16);
                    line2.setTextColor(getResources().getColor(R.color.black));

                    line3.setTextSize(24);
                    line3.setTextColor(getResources().getColor(R.color.red));
                }
                else if(count ==4){
                    mainMethod.setVisibility(View.VISIBLE);
                    mainImage.setVisibility(View.VISIBLE);
                    mainMethod.setAnimation(left);
                    mainImage.setAnimation(side);
                    Obrackets.setVisibility(View.GONE);

                    line3.setTextSize(16);
                    line3.setTextColor(getResources().getColor(R.color.black));

                    line4.setTextSize(24);
                    line4.setTextColor(getResources().getColor(R.color.red));
                }

                else if (count == 5){
                    openMainMethod.setVisibility(View.VISIBLE);
                    openMainMethod.setAnimation(side);
                    mainImage.setVisibility(View.GONE);
                    mainMethod.setVisibility(View.GONE);

                    line4.setTextSize(16);
                    line4.setTextColor(getResources().getColor(R.color.black));

                    line5.setTextSize(24);
                    line5.setTextColor(getResources().getColor(R.color.red));
                }
                else if(count == 6){
                    ScannerText.setVisibility(View.VISIBLE);
                    ScannerText.setAnimation(side);
                    openMainMethod.setVisibility(View.GONE);

                    line5.setTextSize(16);
                    line5.setTextColor(getResources().getColor(R.color.black));

                    line6.setTextSize(24);
                    line6.setTextColor(getResources().getColor(R.color.red));
                }

                else if(count == 7){
                    firstNumber.setVisibility(View.VISIBLE);
                    firstNumber.setAnimation(left);
                    ScannerText.setVisibility(View.GONE);
                    line6.setTextSize(16);
                    line6.setTextColor(getResources().getColor(R.color.black));

                    line7.setTextSize(24);
                    line7.setTextColor(getResources().getColor(R.color.red));
                }
                else if(count == 8){

                    num1.setVisibility(View.VISIBLE);
                    num1.setAnimation(side);
                    firstNumber.setVisibility(View.GONE);

                    line7.setTextSize(16);
                    line7.setTextColor(getResources().getColor(R.color.black));

                    line8.setTextSize(24);
                    line8.setTextColor(getResources().getColor(R.color.red));

                     n1 = num1.getText().toString();
                    if (n1.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter value", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }



                else if(count == 9){
                    secondNumber.setVisibility(View.VISIBLE);
                    secondNumber.setAnimation(left);
                    num1.setVisibility(View.GONE);
                    line8.setTextSize(16);
                    line8.setTextColor(getResources().getColor(R.color.black));

                    line9.setTextSize(24);
                    line9.setTextColor(getResources().getColor(R.color.red));
                }
                else if(count==10){
                    num2.setVisibility(View.VISIBLE);
                    num2.setAnimation(side);
                    secondNumber.setVisibility(View.GONE);
                    line9.setTextSize(16);
                    line9.setTextColor(getResources().getColor(R.color.black));

                    line10.setTextSize(24);
                    line10.setTextColor(getResources().getColor(R.color.red));
                     n2 = num2.getText().toString();
                    if (n2.isEmpty()){
                        Toast.makeText(MainActivity.this, "Enter value", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }

               else if (count == 11){
                    result.setVisibility(View.VISIBLE);
                    result.setAnimation(side);
                    num2.setVisibility(View.GONE);
                    line10.setTextSize(16);
                    line10.setTextColor(getResources().getColor(R.color.black));

                    line11.setTextSize(24);
                    line11.setTextColor(getResources().getColor(R.color.red));
                }


               else  if(count == 12){
                   sumOfNumber.setVisibility(View.VISIBLE);
                   num1Text.setVisibility(View.VISIBLE);
                   num2Text.setVisibility(View.VISIBLE);
                   showNum1.setVisibility(View.VISIBLE);
                   showNum2.setVisibility(View.VISIBLE);
                   plus.setVisibility(View.VISIBLE);
                   showNum1.setText(n1);
                   showNum2.setText(n2);
                   result.setVisibility(View.GONE);

                    line11.setTextSize(16);
                    line11.setTextColor(getResources().getColor(R.color.black));

                    line12.setTextSize(24);
                    line12.setTextColor(getResources().getColor(R.color.red));

                }

               else if(count == 13){


                   res = Integer.parseInt(n1)+Integer.parseInt(n2);

                   addition.setText("SUM : "+Integer.toString(res));
                   addition.setVisibility(View.VISIBLE);
                   addition.setAnimation(side);

                    sumOfNumber.setVisibility(View.GONE);
                    num1Text.setVisibility(View.GONE);
                    num2Text.setVisibility(View.GONE);
                    showNum1.setVisibility(View.GONE);
                    showNum2.setVisibility(View.GONE);
                    plus.setVisibility(View.GONE);

                    line12.setTextSize(16);
                    line12.setTextColor(getResources().getColor(R.color.black));

                    line13.setTextSize(24);
                    line13.setTextColor(getResources().getColor(R.color.red));
                }

               else if(count == 14){

                   closeMethod.setVisibility(View.VISIBLE);
                   closeMethod.setAnimation(side);
                   addition.setVisibility(View.GONE);

                    line13.setTextSize(16);
                    line13.setTextColor(getResources().getColor(R.color.black));

                    line14.setTextSize(24);
                    line14.setTextColor(getResources().getColor(R.color.red));


                }
               else if(count == 15){

                    closeClass.setVisibility(View.VISIBLE);
                    closeClass.setAnimation(side);
                    closeMethod.setVisibility(View.GONE);
                    line14.setTextSize(16);
                    line14.setTextColor(getResources().getColor(R.color.black));

                    line15.setTextSize(24);
                    line15.setTextColor(getResources().getColor(R.color.red));
                }
               else if(count == 16){
                   closeClass.setText("Thank You!");
                    line15.setTextSize(16);
                    line15.setTextColor(getResources().getColor(R.color.black));

                }


                count++;

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Reset", Toast.LENGTH_SHORT).show();

                Intent intent = getIntent();
                finish();
                startActivity(intent);

            }
        });


    }
}