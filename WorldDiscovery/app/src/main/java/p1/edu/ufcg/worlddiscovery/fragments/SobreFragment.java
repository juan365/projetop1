package p1.edu.ufcg.worlddiscovery.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import p1.edu.ufcg.worlddiscovery.R;


public class SobreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View mView = inflater.inflate(R.layout.fragment_sobre, container, false);

        return mView;
    }
}
