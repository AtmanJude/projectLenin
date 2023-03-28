package com.example.projectlenin;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements LocationListener{


    private boolean isAccesLocation;
    private TextView locationTextView;
    private Button buttonIsShareLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        buttonIsShareLocation = findViewById(R.id.is_share_location);
        locationTextView = findViewById(R.id.location_Text_View);
        setContentView(R.layout.activity_main);
    }

public void getLocation(View view)
    {
    if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            ==PackageManager.PERMISSION_GRANTED)
        {
        retrieveLocation();
        }
    else
        {
            ActivityCompat.requestPermissions(this, new String[]
                    {Manifest.permission.ACCESS_FINE_LOCATION}, 200);
        }
    }

    private void retrieveLocation() {
    }

    @Override
    public void onLocationChanged(@NonNull Location location)
    {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras)
    {
        LocationListener.super.onStatusChanged(provider, status, extras);
    }

    @Override
    public void onProviderEnabled(@NonNull String provider)
    {
        LocationListener.super.onProviderEnabled(provider);
    }

    @Override
    public void onProviderDisabled(@NonNull String provider)
    {
        LocationListener.super.onProviderDisabled(provider);
    }


}