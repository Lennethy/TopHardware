package pooa20181.iff.edu.br.tophardware;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.*;
import android.view.View;
import android.widget.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import entities.*;
import adapters.*;

public class ActGpu extends AppCompatActivity {

    private ListView lvGpus;
    private List<Gpus> gpus;
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_gpu);

        btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainit = new Intent(ActGpu.this, ActMain.class);
                startActivity(mainit);
            }
        });

        gpus = new ArrayList<Gpus>();
        gpus.add(new Gpus("p01", "GTX 1070TI", "8GB GDDR5", R.drawable.gtx1070ti, BigDecimal.valueOf(449)));
        gpus.add(new Gpus("p02", "GTX 1080TI", "11GB GDDR5", R.drawable.gtx1080ti, BigDecimal.valueOf(699)));
        gpus.add(new Gpus("p03", "Radeon RX570", "7GB GDDR5", R.drawable.rx570, BigDecimal.valueOf(190)));
        gpus.add(new Gpus("p04", "Radeon RX580", "8GB GDDR5", R.drawable.rx580, BigDecimal.valueOf(368)));
        this.lvGpus = (ListView) findViewById(R.id.lvGpus);
        this.lvGpus.setAdapter(new GpuListAdapter(this, gpus));
    }
}
