package test.nice.testproject;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Runs all instrumentation tests from one place
 */
@RunWith (Suite.class)
@Suite.SuiteClasses ({
		HierarchyActivityTests.class,
		MainActivityTests.class,
		NavigationDrawerActivityTests.class,
		PositionActivityTests.class,
		SwitchActivityTests.class,
		ViewPagerActivityTests.class
})
public class AllTestsSuite {
}
