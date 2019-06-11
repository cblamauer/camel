/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The hazelcast-replicatedmap component is used to access Hazelcast replicated
 * map.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastReplicatedmapEndpointBuilder {


    public static class HazelcastReplicatedmapCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        HazelcastReplicatedmapCommonBuilder(String path) {
            super("hazelcast-replicatedmap", path);
        }
        /**
         * The name of the cache. The option is a java.lang.String type.
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided. The option is a
         * org.apache.camel.component.hazelcast.HazelcastOperation type.
         */
        public T defaultOperation(HazelcastOperation defaultOperation) {
            this.properties.put("defaultOperation", defaultOperation);
            return (T) this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint. The option is a com.hazelcast.core.HazelcastInstance type.
         */
        public T hazelcastInstance(Object hazelcastInstance) {
            this.properties.put("hazelcastInstance", hazelcastInstance);
            return (T) this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance. The
         * option is a java.lang.String type.
         */
        public T hazelcastInstanceName(String hazelcastInstanceName) {
            this.properties.put("hazelcastInstanceName", hazelcastInstanceName);
            return (T) this;
        }
        /**
         * Define if the endpoint will use a reliable Topic struct or not. The
         * option is a boolean type.
         */
        public T reliable(boolean reliable) {
            this.properties.put("reliable", reliable);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * To use concurrent consumers polling from the SEDA queue. The option
         * is a int type.
         */
        public T concurrentConsumers(int concurrentConsumers) {
            this.properties.put("concurrentConsumers", concurrentConsumers);
            return (T) this;
        }
        /**
         * Milliseconds before consumer continues polling after an error has
         * occurred. The option is a int type.
         */
        public T onErrorDelay(int onErrorDelay) {
            this.properties.put("onErrorDelay", onErrorDelay);
            return (T) this;
        }
        /**
         * The timeout used when consuming from the SEDA queue. When a timeout
         * occurs, the consumer can check whether it is allowed to continue
         * running. Setting a lower value allows the consumer to react more
         * quickly upon shutdown. The option is a int type.
         */
        public T pollTimeout(int pollTimeout) {
            this.properties.put("pollTimeout", pollTimeout);
            return (T) this;
        }
        /**
         * If set to true then the consumer runs in transaction mode, where the
         * messages in the seda queue will only be removed if the transaction
         * commits, which happens when the processing is complete. The option is
         * a boolean type.
         */
        public T transacted(boolean transacted) {
            this.properties.put("transacted", transacted);
            return (T) this;
        }
        /**
         * If set to true the whole Exchange will be transfered. If header or
         * body contains not serializable objects, they will be skipped. The
         * option is a boolean type.
         */
        public T transferExchange(boolean transferExchange) {
            this.properties.put("transferExchange", transferExchange);
            return (T) this;
        }
    }

    public static class HazelcastReplicatedmapConsumerBuilder
            extends
                HazelcastReplicatedmapCommonBuilder<HazelcastReplicatedmapConsumerBuilder>
            implements
                EndpointConsumerBuilder {
        public HazelcastReplicatedmapConsumerBuilder(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public HazelcastReplicatedmapConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (HazelcastReplicatedmapConsumerBuilder) this;
        }
        /**
         * Define the polling timeout of the Queue consumer in Poll mode. The
         * option is a long type.
         */
        public HazelcastReplicatedmapConsumerBuilder pollingTimeout(
                long pollingTimeout) {
            this.properties.put("pollingTimeout", pollingTimeout);
            return (HazelcastReplicatedmapConsumerBuilder) this;
        }
        /**
         * Define the Pool size for Queue Consumer Executor. The option is a int
         * type.
         */
        public HazelcastReplicatedmapConsumerBuilder poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (HazelcastReplicatedmapConsumerBuilder) this;
        }
        /**
         * Define the Queue Consumer mode: Listen or Poll. The option is a
         * org.apache.camel.component.hazelcast.queue.HazelcastQueueConsumerMode
         * type.
         */
        public HazelcastReplicatedmapConsumerBuilder queueConsumerMode(
                HazelcastQueueConsumerMode queueConsumerMode) {
            this.properties.put("queueConsumerMode", queueConsumerMode);
            return (HazelcastReplicatedmapConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public HazelcastReplicatedmapConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (HazelcastReplicatedmapConsumerBuilder) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public HazelcastReplicatedmapConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (HazelcastReplicatedmapConsumerBuilder) this;
        }
    }

    public static class HazelcastReplicatedmapProducerBuilder
            extends
                HazelcastReplicatedmapCommonBuilder<HazelcastReplicatedmapProducerBuilder>
            implements
                EndpointProducerBuilder {
        public HazelcastReplicatedmapProducerBuilder(String path) {
            super(path);
        }
    }

    public static enum HazelcastOperation {
        PUT, DELETE, GET, UPDATE, QUERY, GET_ALL, CLEAR, PUT_IF_ABSENT, ADD_ALL, REMOVE_ALL, RETAIN_ALL, EVICT, EVICT_ALL, VALUE_COUNT, CONTAINS_KEY, CONTAINS_VALUE, GET_KEYS, REMOVE_VALUE, INCREMENT, DECREMENT, SET_VALUE, DESTROY, COMPARE_AND_SET, GET_AND_ADD, ADD, OFFER, PEEK, POLL, REMAINING_CAPACITY, DRAIN_TO, REMOVE_IF, TAKE, PUBLISH, READ_ONCE_HEAD, READ_ONCE_TAIL, CAPACITY;
    }

    public static enum HazelcastQueueConsumerMode {
        LISTEN, POLL;
    }
    public default HazelcastReplicatedmapConsumerBuilder fromHazelcastReplicatedmap(
            String path) {
        return new HazelcastReplicatedmapConsumerBuilder(path);
    }
    public default HazelcastReplicatedmapProducerBuilder toHazelcastReplicatedmap(
            String path) {
        return new HazelcastReplicatedmapProducerBuilder(path);
    }
}