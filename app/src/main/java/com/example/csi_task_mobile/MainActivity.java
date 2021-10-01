package com.example.csi_task_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ed_enterinr;
    private Button btn_converter;
    private TextView tv_usdollar;
    private TextView tv_britishpound;
    private TextView tv_canadiandollar;
    private TextView tv_japaneseyen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_enterinr=findViewById(R.id.ed_inrValue);
        btn_converter=findViewById(R.id.btn_convert);
        tv_usdollar=findViewById(R.id.tv_usdollar);
        tv_britishpound=findViewById(R.id.tv_britishpound);
        tv_canadiandollar=findViewById(R.id.tv_canadiandollar);
        tv_japaneseyen=findViewById(R.id.tv_japaneseyen);

        btn_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getinrvalue=ed_enterinr.getText().toString();
                int valueofinr=Integer.valueOf(getinrvalue);
                tv_usdollar.setText("US Dollar             "+String.format("%.2f",valueofinr*0.0136));
                tv_britishpound.setText("British Pound      "+String.format("%.2f",valueofinr*0.2139));//can use Double.toString(valueofinr*0.2139)
                tv_canadiandollar.setText("Canadian Dollar  "+String.format("%.2f",valueofinr*0.0172));
                tv_japaneseyen.setText("Japanese Yen     "+String.format("%.2f",valueofinr*1.4928));



            }
        });
    }
}