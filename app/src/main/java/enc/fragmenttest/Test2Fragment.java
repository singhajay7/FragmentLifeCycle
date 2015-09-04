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
public class Test2Fragment  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("Test2Fragment", "onCreateView() called");
        return inflater.inflate(R.layout.testing_frag_layout,container,false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i("Test2Fragment","onCreate() called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("Test2Fragment","onActivityCreated() called");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        Log.i("Test2Fragment","onAttach() Context param");
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        Log.i("Test2Fragment","onDetach() called");
        super.onDetach();
    }

    @Override
    public void onPause() {
        Log.i("Test2Fragment","onPause() called");
        super.onPause();
    }

    @Override
    public void onResume() {
        Log.i("Test2Fragment","onResume() called");
        super.onResume();
    }

    @Override
    public void onDestroy() {
        Log.i("Test2Fragment","onDestroy() called");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.i("Test2Fragment","onDestroyView() called");
        super.onDestroyView();
    }

    @Override
    public void onAttach(Activity activity) {
        Log.i("Test2Fragment","onAttach() Activity param");
        super.onAttach(activity);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("Test2Fragment","onSaveInstanceState() called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        Log.i("Test2Fragment","onStart() called");
        super.onStart();
    }

    @Override
    public void onStop() {
        Log.i("Test2Fragment","onStop() called");
        super.onStop();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.i("Test2Fragment","onViewCreated() called");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        Log.i("Test2Fragment","onInflate() called");
        super.onInflate(activity, attrs, savedInstanceState);
    }

    /* Lifecycle events called after Test2Fragment is added from button click
    09-04 12:48:10.477  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onAttach() Context param
    09-04 12:48:10.477  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onAttach() Activity param
    09-04 12:48:10.477  14110-14110/enc.fragmenttest E/MainActivity﹕ onAttachFragment()
    09-04 12:48:10.477  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onCreate() called
    09-04 12:48:10.477  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onCreateView() called
    09-04 12:48:10.487  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onViewCreated() called
    09-04 12:48:10.487  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onActivityCreated() called
    09-04 12:48:10.487  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onStart() called
    09-04 12:48:10.487  14110-14110/enc.fragmenttest I/Test2Fragment﹕ onResume() called*/
}
