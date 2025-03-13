package linhntk.ntu.lt_listview_bts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtInputTK, txtInputMK;
    Button btnDN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtInputMK =findViewById(R.id.txtInputMK);
        txtInputTK =findViewById(R.id.txtInputTK);
        btnDN = findViewById(R.id.btnDN);
        //xu ly su kien lang nghe
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gettxtInputTK().equals("Khanh Linh") && gettxtInputMK().equals("1")){
                    Intent intent = new Intent(MainActivity.this, ManDN.class);
                    startActivity(intent);
                }
            }
        });
    }
    //lay gia tri nhap vao cua txtInputTK
    public String gettxtInputTK(){
        return txtInputTK.getText().toString();
    }
    public  String gettxtInputMK(){
        return  txtInputMK.getText().toString();
    }
}