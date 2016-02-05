package test.nice.testproject;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import test.nice.testproject.activities.NavigationDrawerActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@RunWith (AndroidJUnit4.class)
public class NavigationDrawerActivityTests  {

	/** Launches {@link NavigationDrawerActivity} for every test */
	@Rule
	public ActivityTestRule<NavigationDrawerActivity> activityRule = new ActivityTestRule<>(NavigationDrawerActivity.class);
    /**
     * Test that clicking on a Navigation Drawer Item will open the correct fragment.
     * Espresso: openDrawer, onView, withText, perform, click, matches, check, isDisplayed
     */
    @Test
    public void testNavigationDrawerItemClick() {
        openDrawer(R.id.my_drawer_layout);
        onView(withText("Menu One")).perform(click());
        onView(allOf(withId(R.id.exampleFragmentText), withText("Menu One"))).check(matches(isDisplayed()));
    }

    /**
     * Test opening the Navigation Drawer and pressing the back button.
     * Espresso: openDrawer, pressBack
     */
	@Test
    public void testNavigationDrawerBackButton() {
        openDrawer(R.id.my_drawer_layout);
        pressBack();
    }

}