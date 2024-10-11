package com.bolingcavalry.addsink;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author will
 * @email zq2599@gmail.com
 * @date 2020-03-14 22:08
 * @description kafka发送对象的sink
 */
public class KafkaObjSink {
    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        //并行度为1
        env.setParallelism(1);

        Properties properties = new Properties();
        //kafka的broker地址
        properties.setProperty("bootstrap.servers", "192.168.50.43:9092");

        String topic = "test006";
        FlinkKafkaProducer<Tuple2<String, Integer>> producer = new FlinkKafkaProducer<>(topic,
                new ObjSerializationSchema(topic),
                properties,
                FlinkKafkaProducer.Semantic.EXACTLY_ONCE);

        //创建一个List，里面有两个Tuple2元素
        List<Tuple2<String, Integer>> list = new ArrayList<>();
        list.add(new Tuple2("aaa", 1));
        list.add(new Tuple2("bbb", 1));
        list.add(new Tuple2("ccc", 1));
        list.add(new Tuple2("ddd", 1));
        list.add(new Tuple2("eee", 1));
        list.add(new Tuple2("fff", 1));
        list.add(new Tuple2("aaa", 1));


        //统计每个单词的数量
        env.fromCollection(list)
            .keyBy(0)
            .sum(1)
            .addSink(producer)
            .setParallelism(4);


        env.execute("sink demo : kafka obj");
    }
}
