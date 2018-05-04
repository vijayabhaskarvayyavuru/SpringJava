package com.ocatnner.controller;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class Execution {

    public static void main(String[] args) {



        JobDetail job = JobBuilder.newJob(SampleJobScheduler.class)
                .withIdentity("dummyJobName", "group1").build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("dummyTriggerName", "group1")
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(10).repeatForever())
                .build();

        // schedule it
        Scheduler scheduler;
        try {
            scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();
            scheduler.scheduleJob(job, trigger);
        } catch (SchedulerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}