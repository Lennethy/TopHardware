package pooa20181.iff.edu.br.tophardware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ActMain extends AppCompatActivity {

    private Spinner spPeca;
    private Button btnListar;
    private String hardware;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        spPeca = findViewById(R.id.spPeca);
        btnListar = findViewById(R.id.btnListar);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.select,R.layout.support_simple_spinner_dropdown_item);
        spPeca.setAdapter(adapter);

        hardware = spPeca.getSelectedItem().toString();

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hardware.equals("CPU")){
                    Intent cpuit = new Intent(ActMain.this, ActCpu.class);
                    startActivity(cpuit);
                }if(hardware.equals("GPU")){
                    Intent gpuit = new Intent(ActMain.this, ActGpu.class);
                    startActivity(gpuit);
                }
            }
        });
    }
}
