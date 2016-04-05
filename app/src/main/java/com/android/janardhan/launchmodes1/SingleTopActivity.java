package com.android.janardhan.launchmodes1;



        import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class SingleTopActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.standardMode:
                startActivity(new Intent(this, StandardModeActivity.class));
                break;

            case R.id.singleTop:
                startActivity(new Intent(this, SingleTopActivity.class));
                break;

            case R.id.singleInstance:
                startActivity(new Intent(this, SingleInstanceActivity.class));
                break;

            case R.id.singleTask:
                startActivity(new Intent(this, SingleTaskActivity.class));
                break;
        }

    }
}
