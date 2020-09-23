package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikSemuaButton() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1234567890")));
    }
}
//    public void tesKlikButtonSatu(){
//        //cari id button1 terus di klik
//        onView(withId(R.id.button1)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("1")));
//    }
//    @Test
//    //cari id button2 terus di klik
//    public void tesKlikButtonDua(){
//        onView(withId(R.id.button2)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("2")));
//    }
//    @Test
//    //cari id button3 terus di klik
//    public void tesKlikButtonTiga(){
//        onView(withId(R.id.button3)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("3")));
//    }
//    @Test
//    //cari id button4 terus di klik
//    public void tesKlikButtonEmpat(){
//        onView(withId(R.id.button4)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("4")));
//    }
//    @Test
//    //cari id button5 terus di klik
//    public void tesKlikButtonLima(){
//        onView(withId(R.id.button5)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("5")));
//    }
//    @Test
//    //cari id button6 terus di klik
//    public void tesKlikButtonEnam(){
//        onView(withId(R.id.button6)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("6")));
//    }
//    @Test
//    //cari id button7 terus di klik
//    public void tesKlikButtonTujuh(){
//        onView(withId(R.id.button7)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("7")));
//    }
//    @Test
//    //cari id button8 terus di klik
//    public void tesKlikButtonDelapan(){
//        onView(withId(R.id.button8)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("8")));
//    }
//    @Test
//    //cari id button9 terus di klik
//    public void tesKlikButtonSembilan(){
//        onView(withId(R.id.button9)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("9")));
//    }
//    @Test
//    //cari id button0 terus di klik
//    public void tesKlikButtonNol(){
//        onView(withId(R.id.button0)).perform(click());
//        onView(withId(R.id.input)).check(matches(withText("0")));
//    }
//}
