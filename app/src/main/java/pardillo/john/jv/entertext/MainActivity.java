package pardillo.john.jv.entertext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtEntered;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtEntered = this.findViewById(R.id.editText);
        this.btnSubmit = this.findViewById(R.id.button);

        this.btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = this.txtEntered.getText().toString();
        this.txtEntered.setText("");

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}