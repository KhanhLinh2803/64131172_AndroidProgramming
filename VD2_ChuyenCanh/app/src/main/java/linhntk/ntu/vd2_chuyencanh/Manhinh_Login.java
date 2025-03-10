package linhntk.ntu.vd2_chuyencanh;

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

public class Manhinh_Login extends AppCompatActivity {
    public Button btnDn;
    public EditText edtInputUser, edtInputPass,edtInputMail;
    public String getedtInputUser(){
        return edtInputUser.getText().toString();
    }
    public String getedtInputPass(){
        return  edtInputPass.getText().toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_manhinh_login);
        btnDn = findViewById(R.id.btnDn);
        edtInputUser = findViewById(R.id.edtInputUser);
        edtInputPass = findViewById(R.id.edtInputPass);
        edtInputMail = findViewById(R.id.edtInputMail);
        btnDn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getedtInputUser().equals("khanhlinh") && getedtInputPass().equals("123")){
                    Intent intent = new Intent(Manhinh_Login.this, ManhinhChaomung.class);
                    intent.putExtra("123",getedtInputUser());
                    startActivity(intent);
                }
            }
        });
    }
}