package com.steoware.databindingexample;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.steoware.databindingexample.databinding.FragmentMainBinding;
import com.steoware.databindingexample.model.User;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        FragmentMainBinding binding = DataBindingUtil.setContentView(getActivity(), R.layout.fragment_main);
        User user = new User("Test", "User");
        binding.setTestUser(user);

        Button btn = (Button) view.findViewById(R.id.btn);
        btn.setOnClickListener(v -> user.setFirstName("New FirstName"));

        return view;
    }
}
