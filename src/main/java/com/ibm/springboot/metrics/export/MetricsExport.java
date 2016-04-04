package com.ibm.springboot.metrics.export;

import java.io.OutputStream;
import java.io.PrintWriter;

import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.boot.actuate.metrics.reader.MetricReader;

public class MetricsExport {

    private MetricReader repository;
    
    public MetricsExport(MetricReader repository)
    {
    	this.repository = repository;
    }
    
    public void exportMetrics() {
        repository.findAll().forEach(this::saveMetric);
    }

    private void saveMetric(Metric<?> m) {
        System.out.println(String.format("%s = %s", m.getName(), m.getValue()));

        try {
            //Socket socket = new Socket("104.236.218.223", 2003);
            //OutputStream stream = socket.getOutputStream();
        	/*OutputStream stream = System.out;
            PrintWriter out = new PrintWriter(stream, true);
            out.printf("%s %d %d%n", m.getName(), m.getValue().intValue(), System.currentTimeMillis() / 1000);
            out.close();*/
            //socket.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       // repository.reset(m.getName());
    }

}
