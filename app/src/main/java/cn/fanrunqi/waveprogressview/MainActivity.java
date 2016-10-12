package cn.fanrunqi.waveprogressview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.InjectView;import cn.fanrunqi.waveprogress.WaveProgressView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.waveProgressbar3)
    WaveProgressView waveProgressbar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        Init();
    }
    private void Init() {
        waveProgressbar3.setWaveColor("#E53935");
        waveProgressbar3.setCurrent(30,"hello");
    }
}
