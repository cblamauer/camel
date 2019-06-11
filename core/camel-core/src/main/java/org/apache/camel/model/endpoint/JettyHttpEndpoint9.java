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

import java.net.URI;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The jetty component provides HTTP-based endpoints for consuming and producing
 * HTTP requests.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JettyHttpEndpoint9 {


    public static class JettyHttpCommon9<T extends AbstractEndpointBuilder>
            extends
            AbstractEndpointBuilder<T> {
        JettyHttpCommon9(String path) {
            super("jetty", path);
        }
        /**
         * If this option is false the Servlet will disable the HTTP streaming
         * and set the content-length header on the response. The option is a
         * boolean type.
         */
        public T chunked(boolean chunked) {
            this.properties.put("chunked", chunked);
            return (T) this;
        }
        /**
         * Determines whether or not the raw input stream from Servlet is cached
         * or not (Camel will read the stream into a in memory/overflow to file,
         * Stream caching) cache. By default Camel will cache the Servlet input
         * stream to support reading it multiple times to ensure it Camel can
         * retrieve all data from the stream. However you can set this option to
         * true when you for example need to access the raw stream, such as
         * streaming it directly to a file or other persistent store.
         * DefaultHttpBinding will copy the request input stream into a stream
         * cache and put it into message body if this option is false to support
         * reading the stream multiple times. If you use Servlet to bridge/proxy
         * an endpoint then consider enabling this option to improve
         * performance, in case you do not need to read the message payload
         * multiple times. The http/http4 producer will by default cache the
         * response body stream. If setting this option to true, then the
         * producers will not cache the response body stream but use the
         * response stream as-is as the message body. The option is a boolean
         * type.
         */
        public T disableStreamCache(boolean disableStreamCache) {
            this.properties.put("disableStreamCache", disableStreamCache);
            return (T) this;
        }
        /**
         * Whether Jetty org.eclipse.jetty.servlets.MultiPartFilter is enabled
         * or not. You should set this value to false when bridging endpoints,
         * to ensure multipart requests is proxied/bridged as well. The option
         * is a boolean type.
         */
        public T enableMultipartFilter(boolean enableMultipartFilter) {
            this.properties.put("enableMultipartFilter", enableMultipartFilter);
            return (T) this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message. The option is a
         * org.apache.camel.spi.HeaderFilterStrategy type.
         */
        public T headerFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
            this.properties.put("headerFilterStrategy", headerFilterStrategy);
            return (T) this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. On the
         * producer side the exception will be deserialized and thrown as is,
         * instead of the HttpOperationFailedException. The caused exception is
         * required to be serialized. This is by default turned off. If you
         * enable this then be aware that Java will deserialize the incoming
         * data from the request to Java and that can be a potential security
         * risk. The option is a boolean type.
         */
        public T transferException(boolean transferException) {
            this.properties.put("transferException", transferException);
            return (T) this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient. The option is a
         * org.apache.camel.http.common.HttpBinding type.
         */
        public T httpBinding(Object httpBinding) {
            this.properties.put("httpBinding", httpBinding);
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
         * If this option is true then IN exchange Body of the exchange will be
         * mapped to HTTP body. Setting this to false will avoid the HTTP
         * mapping. The option is a boolean type.
         */
        public T mapHttpMessageBody(boolean mapHttpMessageBody) {
            this.properties.put("mapHttpMessageBody", mapHttpMessageBody);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Form Encoded body of the
         * exchange will be mapped to HTTP. Setting this to false will avoid the
         * HTTP Form Encoded body mapping. The option is a boolean type.
         */
        public T mapHttpMessageFormUrlEncodedBody(
                boolean mapHttpMessageFormUrlEncodedBody) {
            this.properties.put("mapHttpMessageFormUrlEncodedBody", mapHttpMessageFormUrlEncodedBody);
            return (T) this;
        }
        /**
         * If this option is true then IN exchange Headers of the exchange will
         * be mapped to HTTP headers. Setting this to false will avoid the HTTP
         * Headers mapping. The option is a boolean type.
         */
        public T mapHttpMessageHeaders(boolean mapHttpMessageHeaders) {
            this.properties.put("mapHttpMessageHeaders", mapHttpMessageHeaders);
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
         * To configure security using SSLContextParameters. The option is a
         * org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslContextParameters(Object sslContextParameters) {
            this.properties.put("sslContextParameters", sslContextParameters);
            return (T) this;
        }
    }

    public static class JettyHttpConsumer9
            extends
                JettyHttpCommon9<JettyHttpConsumer9>
            implements
            EndpointConsumerBuilder {
        public JettyHttpConsumer9(String path) {
            super(path);
        }
        /**
         * Configure the consumer to work in async mode. The option is a boolean
         * type.
         */
        public JettyHttpConsumer9 async(boolean async) {
            this.properties.put("async", async);
            return (JettyHttpConsumer9) this;
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
        public JettyHttpConsumer9 bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Allows to set a timeout in millis when using Jetty as consumer
         * (server). By default Jetty uses 30000. You can use a value of = 0 to
         * never expire. If a timeout occurs then the request will be expired
         * and Jetty will return back a http error 503 to the client. This
         * option is only in use when using Jetty with the Asynchronous Routing
         * Engine. The option is a java.lang.Long type.
         */
        public JettyHttpConsumer9 continuationTimeout(Long continuationTimeout) {
            this.properties.put("continuationTimeout", continuationTimeout);
            return (JettyHttpConsumer9) this;
        }
        /**
         * If the option is true, Jetty server will setup the CrossOriginFilter
         * which supports the CORS out of box. The option is a boolean type.
         */
        public JettyHttpConsumer9 enableCORS(boolean enableCORS) {
            this.properties.put("enableCORS", enableCORS);
            return (JettyHttpConsumer9) this;
        }
        /**
         * If this option is true, Jetty JMX support will be enabled for this
         * endpoint. See Jetty JMX support for more details. The option is a
         * boolean type.
         */
        public JettyHttpConsumer9 enableJmx(boolean enableJmx) {
            this.properties.put("enableJmx", enableJmx);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Used to only allow consuming if the HttpMethod matches, such as
         * GET/POST/PUT etc. Multiple methods can be specified separated by
         * comma. The option is a java.lang.String type.
         */
        public JettyHttpConsumer9 httpMethodRestrict(String httpMethodRestrict) {
            this.properties.put("httpMethodRestrict", httpMethodRestrict);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found. The option is a
         * boolean type.
         */
        public JettyHttpConsumer9 matchOnUriPrefix(boolean matchOnUriPrefix) {
            this.properties.put("matchOnUriPrefix", matchOnUriPrefix);
            return (JettyHttpConsumer9) this;
        }
        /**
         * To use a custom buffer size on the javax.servlet.ServletResponse. The
         * option is a java.lang.Integer type.
         */
        public JettyHttpConsumer9 responseBufferSize(Integer responseBufferSize) {
            this.properties.put("responseBufferSize", responseBufferSize);
            return (JettyHttpConsumer9) this;
        }
        /**
         * If the option is true, jetty server will send the date header to the
         * client which sends the request. NOTE please make sure there is no any
         * other camel-jetty endpoint is share the same port, otherwise this
         * option may not work as expected. The option is a boolean type.
         */
        public JettyHttpConsumer9 sendDateHeader(boolean sendDateHeader) {
            this.properties.put("sendDateHeader", sendDateHeader);
            return (JettyHttpConsumer9) this;
        }
        /**
         * If the option is true, jetty will send the server header with the
         * jetty version information to the client which sends the request. NOTE
         * please make sure there is no any other camel-jetty endpoint is share
         * the same port, otherwise this option may not work as expected. The
         * option is a boolean type.
         */
        public JettyHttpConsumer9 sendServerVersion(boolean sendServerVersion) {
            this.properties.put("sendServerVersion", sendServerVersion);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Specifies whether to enable the session manager on the server side of
         * Jetty. The option is a boolean type.
         */
        public JettyHttpConsumer9 sessionSupport(boolean sessionSupport) {
            this.properties.put("sessionSupport", sessionSupport);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Whether or not to use Jetty continuations for the Jetty Server. The
         * option is a java.lang.Boolean type.
         */
        public JettyHttpConsumer9 useContinuation(boolean useContinuation) {
            this.properties.put("useContinuation", useContinuation);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Whether to eager check whether the HTTP requests has content if the
         * content-length header is 0 or not present. This can be turned on in
         * case HTTP clients do not send streamed data. The option is a boolean
         * type.
         */
        public JettyHttpConsumer9 eagerCheckContentAvailable(
                boolean eagerCheckContentAvailable) {
            this.properties.put("eagerCheckContentAvailable", eagerCheckContentAvailable);
            return (JettyHttpConsumer9) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public JettyHttpConsumer9 exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public JettyHttpConsumer9 exchangePattern(
                ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Configuration of the filter init parameters. These parameters will be
         * applied to the filter list before starting the jetty server. The
         * option is a java.util.Map<java.lang.String,java.lang.String> type.
         */
        public JettyHttpConsumer9 filterInitParameters(
                Map<String, String> filterInitParameters) {
            this.properties.put("filterInitParameters", filterInitParameters);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Allows using a custom filters which is putted into a list and can be
         * find in the Registry. Multiple values can be separated by comma. The
         * option is a java.lang.String type.
         */
        public JettyHttpConsumer9 filtersRef(List<Object> filtersRef) {
            this.properties.put("filtersRef", filtersRef);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Specifies a comma-delimited set of Handler instances to lookup in
         * your Registry. These handlers are added to the Jetty servlet context
         * (for example, to add security). Important: You can not use different
         * handlers with different Jetty endpoints using the same port number.
         * The handlers is associated to the port number. If you need different
         * handlers, then use different port numbers. The option is a
         * java.lang.String type.
         */
        public JettyHttpConsumer9 handlers(List<Object> handlers) {
            this.properties.put("handlers", handlers);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Option to disable throwing the HttpOperationFailedException in case
         * of failed responses from the remote server. This allows you to get
         * all responses regardless of the HTTP status code. The option is a
         * java.lang.String type.
         */
        @Deprecated
        public JettyHttpConsumer9 httpBindingRef(String httpBindingRef) {
            this.properties.put("httpBindingRef", httpBindingRef);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Allows using a custom multipart filter. Note: setting
         * multipartFilterRef forces the value of enableMultipartFilter to true.
         * The option is a javax.servlet.Filter type.
         */
        public JettyHttpConsumer9 multipartFilter(Object multipartFilter) {
            this.properties.put("multipartFilter", multipartFilter);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Allows using a custom multipart filter. Note: setting
         * multipartFilterRef forces the value of enableMultipartFilter to true.
         * The option is a java.lang.String type.
         */
        @Deprecated
        public JettyHttpConsumer9 multipartFilterRef(String multipartFilterRef) {
            this.properties.put("multipartFilterRef", multipartFilterRef);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Specifies whether to enable HTTP OPTIONS for this Servlet consumer.
         * By default OPTIONS is turned off. The option is a boolean type.
         */
        public JettyHttpConsumer9 optionsEnabled(boolean optionsEnabled) {
            this.properties.put("optionsEnabled", optionsEnabled);
            return (JettyHttpConsumer9) this;
        }
        /**
         * Specifies whether to enable HTTP TRACE for this Servlet consumer. By
         * default TRACE is turned off. The option is a boolean type.
         */
        public JettyHttpConsumer9 traceEnabled(boolean traceEnabled) {
            this.properties.put("traceEnabled", traceEnabled);
            return (JettyHttpConsumer9) this;
        }
    }

    public static class JettyHttpProducer9
            extends
                JettyHttpCommon9<JettyHttpProducer9>
            implements
            EndpointProducerBuilder {
        public JettyHttpProducer9(String path) {
            super(path);
        }
        /**
         * The url of the HTTP endpoint to call. The option is a java.net.URI
         * type.
         */
        public JettyHttpProducer9 httpUri(URI httpUri) {
            this.properties.put("httpUri", httpUri);
            return (JettyHttpProducer9) this;
        }
        /**
         * If the option is true, HttpProducer will ignore the Exchange.HTTP_URI
         * header, and use the endpoint's URI for request. You may also set the
         * option throwExceptionOnFailure to be false to let the HttpProducer
         * send all the fault response back. The option is a boolean type.
         */
        public JettyHttpProducer9 bridgeEndpoint(boolean bridgeEndpoint) {
            this.properties.put("bridgeEndpoint", bridgeEndpoint);
            return (JettyHttpProducer9) this;
        }
        /**
         * Specifies whether a Connection Close header must be added to HTTP
         * Request. By default connectionClose is false. The option is a boolean
         * type.
         */
        public JettyHttpProducer9 connectionClose(boolean connectionClose) {
            this.properties.put("connectionClose", connectionClose);
            return (JettyHttpProducer9) this;
        }
        /**
         * Configure a cookie handler to maintain a HTTP session. The option is
         * a org.apache.camel.http.common.cookie.CookieHandler type.
         */
        public JettyHttpProducer9 cookieHandler(Object cookieHandler) {
            this.properties.put("cookieHandler", cookieHandler);
            return (JettyHttpProducer9) this;
        }
        /**
         * If this option is true then IN exchange headers will be copied to OUT
         * exchange headers according to copy strategy. Setting this to false,
         * allows to only include the headers from the HTTP response (not
         * propagating IN headers). The option is a boolean type.
         */
        public JettyHttpProducer9 copyHeaders(boolean copyHeaders) {
            this.properties.put("copyHeaders", copyHeaders);
            return (JettyHttpProducer9) this;
        }
        /**
         * To set a value for maximum number of threads in HttpClient thread
         * pool. This setting override any setting configured on component
         * level. Notice that both a min and max size must be configured. If not
         * set it default to max 254 threads used in Jettys thread pool. The
         * option is a java.lang.Integer type.
         */
        public JettyHttpProducer9 httpClientMaxThreads(
                Integer httpClientMaxThreads) {
            this.properties.put("httpClientMaxThreads", httpClientMaxThreads);
            return (JettyHttpProducer9) this;
        }
        /**
         * To set a value for minimum number of threads in HttpClient thread
         * pool. This setting override any setting configured on component
         * level. Notice that both a min and max size must be configured. If not
         * set it default to min 8 threads used in Jettys thread pool. The
         * option is a java.lang.Integer type.
         */
        public JettyHttpProducer9 httpClientMinThreads(
                Integer httpClientMinThreads) {
            this.properties.put("httpClientMinThreads", httpClientMinThreads);
            return (JettyHttpProducer9) this;
        }
        /**
         * Configure the HTTP method to use. The HttpMethod header cannot
         * override this option if set. The option is a
         * org.apache.camel.http.common.HttpMethods type.
         */
        public JettyHttpProducer9 httpMethod(HttpMethods httpMethod) {
            this.properties.put("httpMethod", httpMethod);
            return (JettyHttpProducer9) this;
        }
        /**
         * If this option is true, The http producer won't read response body
         * and cache the input stream. The option is a boolean type.
         */
        public JettyHttpProducer9 ignoreResponseBody(boolean ignoreResponseBody) {
            this.properties.put("ignoreResponseBody", ignoreResponseBody);
            return (JettyHttpProducer9) this;
        }
        /**
         * If the option is true, HttpProducer will set the Host header to the
         * value contained in the current exchange Host header, useful in
         * reverse proxy applications where you want the Host header received by
         * the downstream server to reflect the URL called by the upstream
         * client, this allows applications which use the Host header to
         * generate accurate URL's for a proxied service. The option is a
         * boolean type.
         */
        public JettyHttpProducer9 preserveHostHeader(boolean preserveHostHeader) {
            this.properties.put("preserveHostHeader", preserveHostHeader);
            return (JettyHttpProducer9) this;
        }
        /**
         * Option to disable throwing the HttpOperationFailedException in case
         * of failed responses from the remote server. This allows you to get
         * all responses regardless of the HTTP status code. The option is a
         * boolean type.
         */
        public JettyHttpProducer9 throwExceptionOnFailure(
                boolean throwExceptionOnFailure) {
            this.properties.put("throwExceptionOnFailure", throwExceptionOnFailure);
            return (JettyHttpProducer9) this;
        }
        /**
         * Sets a shared HttpClient to use for all producers created by this
         * endpoint. By default each producer will use a new http client, and
         * not share. Important: Make sure to handle the lifecycle of the shared
         * client, such as stopping the client, when it is no longer in use.
         * Camel will call the start method on the client to ensure its started
         * when this endpoint creates a producer. This options should only be
         * used in special circumstances. The option is a
         * org.eclipse.jetty.client.HttpClient type.
         */
        public JettyHttpProducer9 httpClient(Object httpClient) {
            this.properties.put("httpClient", httpClient);
            return (JettyHttpProducer9) this;
        }
        /**
         * Configuration of Jetty's HttpClient. For example, setting
         * httpClient.idleTimeout=30000 sets the idle timeout to 30 seconds. And
         * httpClient.timeout=30000 sets the request timeout to 30 seconds, in
         * case you want to timeout sooner if you have long running
         * request/response calls. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public JettyHttpProducer9 httpClientParameters(
                Map<String, Object> httpClientParameters) {
            this.properties.put("httpClientParameters", httpClientParameters);
            return (JettyHttpProducer9) this;
        }
        /**
         * To use a custom JettyHttpBinding which be used to customize how a
         * response should be written for the producer. The option is a
         * org.apache.camel.component.jetty.JettyHttpBinding type.
         */
        public JettyHttpProducer9 jettyBinding(Object jettyBinding) {
            this.properties.put("jettyBinding", jettyBinding);
            return (JettyHttpProducer9) this;
        }
        /**
         * To use a custom JettyHttpBinding which be used to customize how a
         * response should be written for the producer. The option is a
         * java.lang.String type.
         */
        @Deprecated
        public JettyHttpProducer9 jettyBindingRef(String jettyBindingRef) {
            this.properties.put("jettyBindingRef", jettyBindingRef);
            return (JettyHttpProducer9) this;
        }
        /**
         * The status codes which are considered a success response. The values
         * are inclusive. Multiple ranges can be defined, separated by comma,
         * e.g. 200-204,209,301-304. Each range must be a single number or
         * from-to with the dash included. The option is a java.lang.String
         * type.
         */
        public JettyHttpProducer9 okStatusCodeRange(String okStatusCodeRange) {
            this.properties.put("okStatusCodeRange", okStatusCodeRange);
            return (JettyHttpProducer9) this;
        }
        /**
         * Refers to a custom org.apache.camel.component.http.UrlRewrite which
         * allows you to rewrite urls when you bridge/proxy endpoints. See more
         * details at http://camel.apache.org/urlrewrite.html. The option is a
         * org.apache.camel.http.common.UrlRewrite type.
         */
        @Deprecated
        public JettyHttpProducer9 urlRewrite(Object urlRewrite) {
            this.properties.put("urlRewrite", urlRewrite);
            return (JettyHttpProducer9) this;
        }
        /**
         * Proxy authentication scheme to use. The option is a java.lang.String
         * type.
         */
        public JettyHttpProducer9 proxyAuthScheme(String proxyAuthScheme) {
            this.properties.put("proxyAuthScheme", proxyAuthScheme);
            return (JettyHttpProducer9) this;
        }
        /**
         * Proxy hostname to use. The option is a java.lang.String type.
         */
        public JettyHttpProducer9 proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (JettyHttpProducer9) this;
        }
        /**
         * Proxy port to use. The option is a int type.
         */
        public JettyHttpProducer9 proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (JettyHttpProducer9) this;
        }
        /**
         * Authentication host to use with NTML. The option is a
         * java.lang.String type.
         */
        public JettyHttpProducer9 authHost(String authHost) {
            this.properties.put("authHost", authHost);
            return (JettyHttpProducer9) this;
        }
    }

    public static enum HttpMethods {
        GET, POST, PUT, DELETE, HEAD, OPTIONS, TRACE, PATCH;
    }
    public default JettyHttpConsumer9 fromJettyHttp9(String path) {
        return new JettyHttpConsumer9(path);
    }
    public default JettyHttpProducer9 toJettyHttp9(String path) {
        return new JettyHttpProducer9(path);
    }
}