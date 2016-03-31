/*
 * Copyright (c) 2015. Rick Hightower, Geoff Chandler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * QBit - The Microservice lib for Java : JSON, WebSocket, REST. Be The Web!
 */

package io.advantageous.qbit.network;

import java.util.function.Consumer;

/**
 * WebSocket like thing that receives messages.
 * Could be mapped to non-websocket implementations.
 * created by rhightower on 2/14/15.
 */
public interface NetSocket {

    String remoteAddress();

    String uri();

    void onTextMessage(String message);

    void onBinaryMessage(byte[] bytes);

    void onClose();

    void onOpen();

    void onError(Exception exception);

    void sendText(String string);

    void sendBinary(byte[] bytes);

    boolean isClosed();

    boolean isOpen();

    boolean isBinary();

    void setTextMessageConsumer(Consumer<String> textMessageConsumer);

    void setBinaryMessageConsumer(Consumer<byte[]> binaryMessageConsumer);

    void setCloseConsumer(Consumer<Void> closeConsumer);

    void setOpenConsumer(Consumer<Void> openConsumer);

    void setErrorConsumer(Consumer<Exception> exceptionConsumer);

    void close();

    void open();

    void openAndWait();


}
