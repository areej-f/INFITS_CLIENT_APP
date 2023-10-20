package ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.infits.Todays_BreakFast_info;

import java.util.ArrayList;

public class SharedViewModel extends ViewModel {
//    private final MutableLiveData<Todays_BreakFast_info> selectedMeal = new MutableLiveData<>();
//
//    public void selectMeal(Todays_BreakFast_info meal) {
//        selectedMeal.setValue(meal);
//    }
//
//    public LiveData<Todays_BreakFast_info> getSelectedMeal() {
//        return selectedMeal;
//    }

    private ArrayList<Todays_BreakFast_info> mealInfo = new ArrayList<>();

    public void addMeal(Todays_BreakFast_info breakFast_info) {
        mealInfo.add(breakFast_info);
    }

    public ArrayList<Todays_BreakFast_info> getMealList() {
        return mealInfo;
    }
}
