package com.originalix.lix.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.map.MapView;

public class MapActivity extends AppCompatActivity {

    private BMapManager manager;
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        manager = new BMapManager(this);
//        manager.init("cG5Z3yZXY72VTStyZ01n2HRERwN9GQWW", null);
        setContentView(R.layout.activity_map);
//        mapView = (MapView) findViewById(R.id.map_view);
    }

}
