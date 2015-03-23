package com.mystrokeguide.genius;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by israe_000 on 3/5/2015.
 */
public class GameActivity extends Activity{
    SessionManager session;
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ctx = getApplicationContext();
        session = new SessionManager(ctx);
    }

}
