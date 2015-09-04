package enc.fragmenttest;

import android.app.FragmentTransaction;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("MainActivity", "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAddButton = (Button) findViewById(R.id.button);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction trans = manager.beginTransaction();
                trans.add(R.id.container2, new Test2Fragment(), "Test2Frag");
                trans.commit();
            }
        });
        FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction trans = manager.beginTransaction();
        trans.add(R.id.container1, new TestFragment(), "TestFrag");
        trans.commit();
    }

    @Override
    protected void onStart() {
        Log.e("MainActivity", "onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("MainActivity", "onResume()");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("MainActivity", "onRestart()");
        super.onRestart();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        Log.e("MainActivity", "onAttachFragment()");
        super.onAttachFragment(fragment);
    }

    @Override
    protected void onPause() {
        Log.e("MainActivity", "onPause()");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.e("MainActivity", "onSaveInstanceState()");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onDestroy() {
        Log.e("MainActivity", "onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.e("MainActivity", "onStop()");
        super.onStop();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.e("MainActivity", "onRestoreInstanceState()");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*09-04 11:49:26.897  23009-23009/enc.fragmenttest E/MainActivity﹕ onCreate()
    09-04 11:49:26.917  23009-23009/enc.fragmenttest E/MainActivity﹕ onStart()
    09-04 11:49:26.917  23009-23009/enc.fragmenttest I/TestFragment﹕ onAttach() Context param
    09-04 11:49:26.917  23009-23009/enc.fragmenttest I/TestFragment﹕ onAttach() Activity param
    09-04 11:49:26.917  23009-23009/enc.fragmenttest E/MainActivity﹕ onAttachFragment()
    09-04 11:49:26.917  23009-23009/enc.fragmenttest I/TestFragment﹕ onCreate() called
    09-04 11:49:26.917  23009-23009/enc.fragmenttest I/TestFragment﹕ onCreateView() called
    09-04 11:49:26.927  23009-23009/enc.fragmenttest I/TestFragment﹕ onViewCreated() called
    09-04 11:49:26.927  23009-23009/enc.fragmenttest I/TestFragment﹕ onActivityCreated() called
    09-04 11:49:26.927  23009-23009/enc.fragmenttest I/TestFragment﹕ onStart() called
    09-04 11:49:26.927  23009-23009/enc.fragmenttest E/MainActivity﹕ onResume()
    09-04 11:49:26.927  23009-23009/enc.fragmenttest I/TestFragment﹕ onResume() called
/////////////////////On Back Pressed///////////////////////////////////
    09-04 11:49:53.707  23009-23009/enc.fragmenttest E/MainActivity﹕ onPause()
    09-04 11:49:53.707  23009-23009/enc.fragmenttest I/TestFragment﹕ onPause() called
    09-04 11:49:54.267  23009-23009/enc.fragmenttest E/MainActivity﹕ onStop()
    09-04 11:49:54.267  23009-23009/enc.fragmenttest I/TestFragment﹕ onStop() called
    09-04 11:49:54.267  23009-23009/enc.fragmenttest E/MainActivity﹕ onDestroy()
    09-04 11:49:54.267  23009-23009/enc.fragmenttest I/TestFragment﹕ onDestroyView() called
    09-04 11:49:54.267  23009-23009/enc.fragmenttest I/TestFragment﹕ onDestroy() called
    09-04 11:49:54.267  23009-23009/enc.fragmenttest I/TestFragment﹕ onDetach() called*/
}
