package com.udacity.gradle.builditbigger;


import android.util.Log;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


public class EndpointsAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception{
        try {
            MainActivity mainActivity = new MainActivity();
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivity);
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "testDoInBackground: Timed out");
        }
    }
}
