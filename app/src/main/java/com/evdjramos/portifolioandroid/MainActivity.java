package com.evdjramos.portifolioandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnAppClick(View view)
    {
        String strMessage = "";

        switch (view.getId())
        {
            case R.id.btnPopularMovies:
                strMessage = getString(R.string.popular_movies);
                break;
            case R.id.btnStockHawk:
                strMessage = getString(R.string.stock_hawk);
                break;
            case R.id.btnBuildItBigger:
                strMessage = getString(R.string.build_it_bigger);
                break;
            case R.id.btnMakeYourAppMaterial:
                strMessage = getString(R.string.make_your_app_material);
                break;
            case R.id.btnGoUbiquitous:
                strMessage =  getString(R.string.go_ubiquitous);
                break;
            case R.id.btnCapstone:
                strMessage = getString((R.string.capstone));
                break;
        }
        showToast(strMessage);
    }

    private void showToast(String appTitle) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my \""+ appTitle + "\" app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
