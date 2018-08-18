package peninlog.com.githubsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "coming soon", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "another new", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "local", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "another local", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "another local", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "another local", Toast.LENGTH_SHORT).show();
    }
}
