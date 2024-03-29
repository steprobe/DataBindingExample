package com.steoware.databindingexample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.steoware.databindingexample.BR;

public class User extends BaseObservable {

   public String firstName;
   public String lastName;

    public User(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
   }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}