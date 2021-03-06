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

    @Test
    public void tesKlikButtonTambah() {
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("7")));
    }

    @Test
    public void tesKlikButtonKurang() {
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1")));
    }

    @Test
    public void tesKlikButtonBagi() {
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }

    @Test
    public void tesKlikButtonKali() {
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("32")));
    }

    @Test
    public void tesKlikButtonMod() {
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
    }
    @Test
    public void tesKlikButtonClear(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("5")));
    }
    @Test
    public void tesKlikButtonTitikKoma() {
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("8.2")));
    }
    @Test
    public void tesKlikButtonKurangDuaOperasi() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3")));
    }
    @Test
    public void tesKlikButtonTambahDuaOperasi() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("8")));
    }
    @Test
    public void tesKlikButtonBagiDuaOperasi() {
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
    }
    @Test
    public void tesKlikButtonKaliDuaOperasi() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
    }
    @Test
    public void tesKlikButtonTitikKomaDua() {
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("9.5")));
    }
    @Test
    public void tesKlikButtonPersen() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
    }

    @Test
    public void tesKlikButtonPara2() {
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-8")));
    }
}
