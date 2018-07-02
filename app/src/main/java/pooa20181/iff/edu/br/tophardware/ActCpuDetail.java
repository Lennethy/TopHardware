package pooa20181.iff.edu.br.tophardware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import entities.*;
import android.content.*;
import android.view.View;
import android.widget.*;

public class ActCpuDetail extends AppCompatActivity {

    private Button btnRet;
    private TextView textViewModelCPU;
    private TextView textViewFrequency;
    private TextView textViewPriceCPU;
    private ImageView imageViewCPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cpu_detail);
        Intent intent = getIntent();
        Cpus cpus = (Cpus) intent.getSerializableExtra("CPUS");
        this.btnRet = findViewById(R.id.btnRet);
        this.btnRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActCpuDetail.this, ActCpu.class );
                startActivity(intent);
            }
        });
        this.textViewModelCPU = findViewById(R.id.txModelCPU);
        this.textViewModelCPU.setText(cpus.getModelo());
        this.textViewFrequency = findViewById(R.id.txFrequency);
        this.textViewFrequency.setText(cpus.getFrequencia());
        this.textViewPriceCPU = findViewById(R.id.txPriceCPU);
        this.textViewPriceCPU.setText(String.valueOf(cpus.getPreco()));
        this.imageViewCPU = findViewById((R.id.imageViewCPU));
        this.imageViewCPU.setImageResource(cpus.getFoto());
    }
}