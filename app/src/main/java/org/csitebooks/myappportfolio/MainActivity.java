package org.csitebooks.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatButton popularMovies;
    private AppCompatButton stockHawk;
    private AppCompatButton buildItBigger;
    private AppCompatButton makeYourAppMaterial;
    private AppCompatButton goUbiquitous;
    private AppCompatButton capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }


    public void showToast(String projectName){
        Toast.makeText(MainActivity.this ,"This button will launch my "+ projectName.toLowerCase() + " app!", Toast.LENGTH_LONG ).show();
    }

/**
 * Find the Views in the layout
 **/
    private void findViews() {
        popularMovies = (AppCompatButton)findViewById( R.id.popular_movies );
        stockHawk = (AppCompatButton)findViewById( R.id.stock_hawk );
        buildItBigger = (AppCompatButton)findViewById( R.id.build_it_bigger );
        makeYourAppMaterial = (AppCompatButton)findViewById( R.id.make_your_app_material );
        goUbiquitous = (AppCompatButton)findViewById( R.id.go_ubiquitous );
        capstone = (AppCompatButton)findViewById( R.id.capstone );

        popularMovies.setOnClickListener( this );
        stockHawk.setOnClickListener( this );
        buildItBigger.setOnClickListener( this );
        makeYourAppMaterial.setOnClickListener( this );
        goUbiquitous.setOnClickListener( this );
        capstone.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        if ( v == popularMovies ) {
            // Handle clicks for popularMovies
            showToast(popularMovies.getText().toString());

        } else if ( v == stockHawk ) {
            // Handle clicks for stockHawk
            showToast(stockHawk.getText().toString());

        } else if ( v == buildItBigger ) {
            // Handle clicks for buildItBigger
            showToast(buildItBigger.getText().toString());

        } else if ( v == makeYourAppMaterial ) {
            // Handle clicks for makeYourAppMaterial
            showToast(makeYourAppMaterial.getText().toString());

        } else if ( v == goUbiquitous ) {
            // Handle clicks for goUbiquitous
            showToast(goUbiquitous.getText().toString());

        } else if ( v == capstone ) {
            // Handle clicks for capstone
            showToast(capstone.getText().toString());
        }
    }

}
