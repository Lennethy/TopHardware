package pooa20181.iff.edu.br.tophardware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import entities.*;
import android.content.*;
import android.view.View;
import android.widget.*;

public class ActGpuDetail extends AppCompatActivity {

    private Button btnRet;
    private TextView textViewModel;
    private TextView textViewMemory;
    private TextView textViewPrice;
    private ImageView imageViewGPU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_gpu_detail);
        Intent intent = getIntent();
        Gpus gpus = (Gpus) intent.getSerializableExtra("GPUS");
        this.btnRet = findViewById(R.id.btnRet);
        this.btnRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActGpuDetail.this, ActGpu.class );
                startActivity(intent);
            }
        });
        this.textViewModel = findViewById(R.id.txModel);
        this.textViewModel.setText(gpus.getModelo());
        this.textViewMemory = findViewById(R.id.txMemory);
        this.textViewMemory.setText(gpus.getMemoria());
        this.textViewPrice = findViewById(R.id.txPrice);
        this.textViewPrice.setText(String.valueOf(gpus.getPreco()));
        this.imageViewGPU = findViewById((R.id.imageViewGPU));
        this.imageViewGPU.setImageResource(gpus.getFoto());
    }
}
