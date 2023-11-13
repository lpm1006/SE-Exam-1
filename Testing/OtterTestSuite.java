package Testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({OtterTestBeforeAfterAll.class, OtterTestBeforeAfterEach.class, OtterTestTrueFalse.class})

public class OtterTestSuite {

}
