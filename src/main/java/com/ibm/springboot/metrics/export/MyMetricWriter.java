package com.ibm.springboot.metrics.export;

import org.springframework.boot.actuate.endpoint.SystemPublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.boot.actuate.metrics.writer.Delta;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;

public class MyMetricWriter implements MetricWriter {
	private final SystemPublicMetrics systemPublicMetrics;
	
	public MyMetricWriter(SystemPublicMetrics systemPublicMetrics) {
		// TODO Auto-generated constructor stub
		this.systemPublicMetrics = systemPublicMetrics;
	}

	@Override
	public void set(Metric<?> arg0) {
		// TODO Auto-generated method stub
		System.out.println("My Metric:" + arg0.getName());
		for(Metric m:systemPublicMetrics.metrics())
		{
			System.out.println("My System Metric:" + m.getName() + " value:" + m.getValue());
		}
	}

	@Override
	public void increment(Delta<?> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset(String arg0) {
		// TODO Auto-generated method stub

	}

}
