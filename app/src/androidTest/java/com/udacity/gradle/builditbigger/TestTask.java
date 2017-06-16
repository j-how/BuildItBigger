package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static android.support.test.InstrumentationRegistry.getTargetContext;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by django on 2017/6/15.
 */

@RunWith(AndroidJUnit4.class)
public class TestTask{
    public TestTask() {
    }

    @Test
    public void test(){
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(new Pair<Context, String>(getTargetContext(), "Manfred"));
        String result = null;

        try {
            result = task.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
