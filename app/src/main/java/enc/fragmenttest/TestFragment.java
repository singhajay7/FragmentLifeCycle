package enc.fragmenttest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ajays on 9/4/2015.
 */
public class TestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("TestFragment","onCreateView() called");
        return inflater.inflate(R.layout.test_frag_layout,container,false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("TestFragment","onCreate() called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("TestFragment","onActivityCreated() called");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.i("TestFragment","onAttach() Context param");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.i("TestFragment","onDetach() called");
        super.onDetach();
    }

    @Override
    public void onPause() {
        Log.i("TestFragment","onPause() called");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.i("TestFragment","onResume() called");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.i("TestFragment","onDestroy() called");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.i("TestFragment","onDestroyView() called");
        super.onDestroyView();
    }

    @Override
    public void onAttach(Activity activity) {
        Log.i("TestFragment","onAttach() Activity param");
        super.onAttach(activity);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("TestFragment","onSaveInstanceState() called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        Log.i("TestFragment","onStart() called");
        super.onStart();
    }

    @Override
    public void onStop() {
        Log.i("TestFragment","onStop() called");
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.i("TestFragment","onViewCreated() called");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        Log.i("TestFragment","onInflate() called");
        super.onInflate(activity, attrs, savedInstanceState);
    }
}
