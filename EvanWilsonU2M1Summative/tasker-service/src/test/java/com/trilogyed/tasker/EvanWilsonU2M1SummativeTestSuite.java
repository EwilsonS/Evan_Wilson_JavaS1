package com.trilogyed.tasker;

import com.trilogyed.tasker.dao.TaskerDaoTest;
import com.trilogyed.tasker.service.TaskerServiceLayerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TaskerDaoTest.class,
        TaskerServiceLayerTest.class,
})
public class EvanWilsonU2M1SummativeTestSuite {
}
