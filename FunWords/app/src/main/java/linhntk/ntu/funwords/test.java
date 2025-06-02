package linhntk.ntu.funwords;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.view.LayoutInflater;



public class test extends AppCompatActivity {
    Button btnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_test);

        btnt = findViewById(R.id.btnn);

        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_custom, null);
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();

            }
        });
    }
}