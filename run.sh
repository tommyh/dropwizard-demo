#!/bin/bash
curl -o /tmp/dropwizard-demo-0.0.1-SNAPSHOT.jar https://github.com/tommyh/dropwizard-demo/blob/master/target/dropwizard-demo-0.0.1-SNAPSHOT.jar?raw=true
curl -o /tmp/sample.yml https://raw.githubusercontent.com/tommyh/dropwizard-demo/master/sample.yml
java -jar /tmp/dropwizard-demo-0.0.1-SNAPSHOT.jar server /tmp/sample.yml