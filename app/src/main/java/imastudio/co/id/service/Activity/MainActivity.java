package imastudio.co.id.service.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import imastudio.co.id.service.R;
import imastudio.co.id.service.Service.OriginService;
import imastudio.co.id.service.Service.OrigitnIntentService;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_start_service)
    Button btnStartService;
    @BindView(R.id.btn_start_intent_service)
    Button btnStartIntentService;
    @BindView(R.id.btn_start_bound_service)
    Button btnStartBoundService;
    @BindView(R.id.btn_stop_bound_service)
    Button btnStopBoundService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_start_service, R.id.btn_start_intent_service, R.id.btn_start_bound_service, R.id.btn_stop_bound_service})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_start_service:
                Intent mStartService = new Intent(this, OriginService.class);
                startService(mStartService);
                break;
            case R.id.btn_start_intent_service:
                Intent mStartStartIntentService = new Intent(this, OrigitnIntentService.class);
                mStartStartIntentService.putExtra(OrigitnIntentService.EXTRA_DURATION, 5000);
                startService(mStartStartIntentService);
                break;
        }

    }
}
