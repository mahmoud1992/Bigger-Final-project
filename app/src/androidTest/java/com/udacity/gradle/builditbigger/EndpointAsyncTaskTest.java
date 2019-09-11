package com.udacity.gradle.builditbigger;
import android.app.Application;
import android.test.ApplicationTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import java.util.concurrent.ExecutionException;

public class EndpointAsyncTaskTest extends ApplicationTestCase<Application> {

    public EndpointAsyncTaskTest() {
        super(Application.class);
    }

    public void testGetJokeTask() throws ExecutionException, InterruptedException {
        EndpointsAsyncTask testJoke = new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onFinished(String result) {

            }
        });
        testJoke.execute();
        String joke = testJoke.get();
        assertNotNull(joke);
    }
}