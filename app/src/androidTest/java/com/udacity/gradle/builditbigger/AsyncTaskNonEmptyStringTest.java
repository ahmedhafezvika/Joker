package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskNonEmptyStringTest {

    @Test
    public void testNonEmptyResponse() {
        Context context = InstrumentationRegistry.getTargetContext();
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(context);
        endpointsAsyncTask.execute();
        String result = "";
        try {
            result = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertNotEquals("", result);
    }
}