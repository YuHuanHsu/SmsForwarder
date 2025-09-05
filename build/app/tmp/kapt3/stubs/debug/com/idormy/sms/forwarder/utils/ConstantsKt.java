package com.idormy.sms.forwarder.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\'\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\b\n\u0003\b\u0080\u0001\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00108\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010@\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010A\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010B\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010C\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010D\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010E\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010F\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010G\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010H\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010I\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010K\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010L\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010M\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010N\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010O\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010P\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010R\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010T\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010V\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010W\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010X\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Y\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010Z\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010[\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\\\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010]\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010^\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010_\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010`\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010g\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010h\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010i\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010j\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010k\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010l\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010m\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010o\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010p\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010q\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010s\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010u\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010v\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010w\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010x\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010y\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010z\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010{\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010|\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010}\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010~\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u007f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0080\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0081\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0082\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0083\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0084\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0085\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0086\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0087\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0088\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0089\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u008a\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u008b\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u008c\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u008d\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u008e\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u008f\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0090\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0091\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0092\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0093\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0094\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0095\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0096\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0097\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0098\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u0099\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u009a\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u009b\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u009c\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u009d\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u009e\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u009f\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a0\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a1\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a2\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a3\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a4\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a5\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a6\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a7\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a8\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00a9\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00aa\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ab\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ac\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ad\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ae\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00af\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00b0\u0001\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00b1\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00b2\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"+\u0010\u00b3\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00b5\u00010\u00b4\u0001\u00a2\u0006\r\n\u0003\u0010\u00b8\u0001\u001a\u0006\b\u00b6\u0001\u0010\u00b7\u0001\"\u000f\u0010\u00b9\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ba\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00bb\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00bc\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00bd\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00be\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00bf\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c0\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c1\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c2\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c3\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c4\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c5\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c6\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c7\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c8\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00c9\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ca\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00cb\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00cc\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00cd\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00ce\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00cf\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d0\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d1\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d2\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d3\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d4\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d5\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d6\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d7\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d8\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00d9\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00da\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00db\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00dc\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00dd\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00de\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000f\u0010\u00df\u0001\u001a\u000203X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e0\u0001"}, d2 = {"ACTION_RESTART", "", "ACTION_START", "ACTION_STOP", "ACTION_STOP_ALARM", "ACTION_UPDATE_NOTIFICATION", "AUTO_CHECK_UPDATE", "CACTUS_DATE", "CACTUS_END_DATE", "CACTUS_LAST_TIMER", "CACTUS_TIMER", "CHECK_CONTAIN", "CHECK_END_WITH", "CHECK_IS", "CHECK_NOT_CONTAIN", "CHECK_NOT_IS", "CHECK_REGEX", "CHECK_SIM_SLOT_1", "CHECK_SIM_SLOT_2", "CHECK_SIM_SLOT_ALL", "CHECK_START_WITH", "DATABASE_NAME", "DELAY_TIME_AFTER_SIM_READY", "", "ENABLE_LOAD_APP_LIST", "ENABLE_LOAD_SYSTEM_APP_LIST", "ENABLE_LOAD_USER_APP_LIST", "EVENT_ALARM_ACTION", "EVENT_FRPC_DELETE_CONFIG", "EVENT_FRPC_RUNNING_ERROR", "EVENT_FRPC_RUNNING_SUCCESS", "EVENT_FRPC_UPDATE_CONFIG", "EVENT_KEY_PHONE_NUMBERS", "EVENT_KEY_SIM_SLOT", "EVENT_LOAD_APP_LIST", "EVENT_TOAST_ERROR", "EVENT_TOAST_INFO", "EVENT_TOAST_SUCCESS", "EVENT_TOAST_WARNING", "EXTRA_UPDATE_NOTIFICATION", "FILED_CALL_TYPE", "FILED_INFORM_CONTENT", "FILED_MSG_CONTENT", "FILED_MULTI_MATCH", "FILED_PACKAGE_NAME", "FILED_PHONE_NUM", "FILED_TRANSPOND_ALL", "FILED_UID", "FRONT_CHANNEL_ID", "FRONT_CHANNEL_NAME", "FRONT_NOTIFY_ID", "", "FRPC_LIB_DOWNLOAD_URL", "FRPC_LIB_VERSION", "HTTP_FAILURE_CODE", "HTTP_SERVER_PORT", "HTTP_SERVER_TIME_OUT", "HTTP_SUCCESS_CODE", "INTENT_FRPC_APPLY_FILE", "INTENT_FRPC_EDIT_FILE", "IS_AGREE_PRIVACY_KEY", "JOIN_PREVIEW_PROGRAM", "KEY_BACK_CODE_ACTION", "KEY_BACK_CODE_CONDITION", "KEY_BACK_DATA_ACTION", "KEY_BACK_DATA_CONDITION", "KEY_BACK_DESCRIPTION_ACTION", "KEY_BACK_DESCRIPTION_CONDITION", "KEY_DEFAULT_SELECTION", "KEY_EVENT_DATA_ACTION", "KEY_EVENT_DATA_CONDITION", "KEY_EVENT_PARAMS_CONDITION", "KEY_PREVIEW_URL", "KEY_RULE_CLONE", "KEY_RULE_ID", "KEY_RULE_TYPE", "KEY_SENDER_CLONE", "KEY_SENDER_ID", "KEY_SENDER_TEST", "KEY_SENDER_TYPE", "KEY_TASK_CLONE", "KEY_TASK_ID", "KEY_TASK_TYPE", "KEY_TEST_CONDITION", "KEY_UPDATE_URL", "MAX_SETTING_NUM", "PACKAGE_NAME", "SENDER_LOGIC_ALL", "SENDER_LOGIC_RETRY", "SENDER_LOGIC_UNTIL_FAIL", "SENDER_LOGIC_UNTIL_SUCCESS", "SP_API_LOCATION_CACHE", "SP_BATTERY_INFO", "SP_BATTERY_LEVEL", "SP_BATTERY_PCT", "SP_BATTERY_PLUGGED", "SP_BATTERY_STATUS", "SP_BLUETOOTH", "SP_BLUETOOTH_IGNORE_ANONYMOUS", "SP_BLUETOOTH_SCAN_INTERVAL", "SP_BLUETOOTH_STATE", "SP_CANCEL_EXTRA_APP_NOTIFY", "SP_CLIENT_SAFETY_MEASURES", "SP_CLIENT_SIGN_KEY", "SP_CONNECTED_DEVICE", "SP_DATA_SIM_SLOT", "SP_DEBUG_MODE", "SP_DISCOVERED_DEVICES", "SP_DUPLICATE_MESSAGES_LIMITS", "SP_ENABLE_API_BATTERY_QUERY", "SP_ENABLE_API_CALL_QUERY", "SP_ENABLE_API_CLONE", "SP_ENABLE_API_CONTACT_ADD", "SP_ENABLE_API_CONTACT_QUERY", "SP_ENABLE_API_LOCATION", "SP_ENABLE_API_SMS_QUERY", "SP_ENABLE_API_SMS_SEND", "SP_ENABLE_API_WOL", "SP_ENABLE_APP_NOTIFY", "SP_ENABLE_CACTUS", "SP_ENABLE_CALL_TYPE_1", "SP_ENABLE_CALL_TYPE_2", "SP_ENABLE_CALL_TYPE_3", "SP_ENABLE_CALL_TYPE_4", "SP_ENABLE_CALL_TYPE_5", "SP_ENABLE_CALL_TYPE_6", "SP_ENABLE_CANCEL_APP_NOTIFY", "SP_ENABLE_EXCLUDE_FROM_RECENTS", "SP_ENABLE_NOT_USER_PRESENT", "SP_ENABLE_ONE_PIXEL_ACTIVITY", "SP_ENABLE_PHONE", "SP_ENABLE_PLAY_SILENCE_MUSIC", "SP_ENABLE_SERVER_AUTORUN", "SP_ENABLE_SILENT_PERIOD_LOGS", "SP_ENABLE_SMS", "SP_ENABLE_SMS_COMMAND", "SP_ENABLE_SMS_TEMPLATE", "SP_EXTRA_DEVICE_MARK", "SP_EXTRA_SIM1", "SP_EXTRA_SIM2", "SP_IPV4", "SP_IPV6", "SP_IP_LIST", "SP_LOCATION", "SP_LOCATION_ACCURACY", "SP_LOCATION_INFO_NEW", "SP_LOCATION_INFO_OLD", "SP_LOCATION_MIN_DISTANCE", "SP_LOCATION_MIN_INTERVAL", "SP_LOCATION_POWER_REQUIREMENT", "SP_LOCK_SCREEN_ACTION", "SP_NETWORK_STATE", "SP_NOTIFY_CONTENT", "SP_PURE_CLIENT_MODE", "SP_PURE_TASK_MODE", "SP_REQUEST_DELAY_TIME", "SP_REQUEST_RETRY_TIMES", "SP_REQUEST_TIMEOUT", "SP_SERVER_ADDRESS", "SP_SERVER_CONFIG", "SP_SERVER_HISTORY", "SP_SERVER_PRIVATE_KEY", "SP_SERVER_PUBLIC_KEY", "SP_SERVER_SAFETY_MEASURES", "SP_SERVER_SIGN_KEY", "SP_SERVER_SM4_KEY", "SP_SERVER_TIME_TOLERANCE", "SP_SERVER_WEB_PATH", "SP_SILENT_PERIOD_END", "SP_SILENT_PERIOD_START", "SP_SIM_STATE", "SP_SMS_COMMAND_SAFE_PHONE", "SP_SMS_TEMPLATE", "SP_SUBID_SIM1", "SP_SUBID_SIM2", "SP_WIFI_SSID", "SP_WOL_HISTORY", "STATUS_OFF", "STATUS_ON", "TAG_LIST", "", "", "getTAG_LIST", "()[Ljava/util/Map;", "[Ljava/util/Map;", "TASK_ACTION_ALARM", "TASK_ACTION_CLEANER", "TASK_ACTION_FRPC", "TASK_ACTION_HTTPSERVER", "TASK_ACTION_NOTIFICATION", "TASK_ACTION_RESEND", "TASK_ACTION_RULE", "TASK_ACTION_SENDER", "TASK_ACTION_SENDSMS", "TASK_ACTION_SETTINGS", "TASK_ACTION_TASK", "TASK_CONDITION_APP", "TASK_CONDITION_BATTERY", "TASK_CONDITION_BLUETOOTH", "TASK_CONDITION_CALL", "TASK_CONDITION_CHARGE", "TASK_CONDITION_CRON", "TASK_CONDITION_LEAVE_ADDRESS", "TASK_CONDITION_LOCK_SCREEN", "TASK_CONDITION_NETWORK", "TASK_CONDITION_SIM", "TASK_CONDITION_SMS", "TASK_CONDITION_TO_ADDRESS", "TYPE_BARK", "TYPE_DINGTALK_GROUP_ROBOT", "TYPE_DINGTALK_INNER_ROBOT", "TYPE_EMAIL", "TYPE_FEISHU", "TYPE_FEISHU_APP", "TYPE_GOTIFY", "TYPE_PUSHPLUS", "TYPE_SERVERCHAN", "TYPE_SMS", "TYPE_SOCKET", "TYPE_TELEGRAM", "TYPE_URL_SCHEME", "TYPE_WEBHOOK", "TYPE_WEWORK_AGENT", "TYPE_WEWORK_ROBOT", "app_debug"})
public final class ConstantsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_START = "START";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_STOP = "STOP";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_RESTART = "RESTART";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_STOP_ALARM = "STOP_ALARM";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ACTION_UPDATE_NOTIFICATION = "UPDATE_NOTIFICATION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_UPDATE_NOTIFICATION = "EXTRA_UPDATE_NOTIFICATION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String AUTO_CHECK_UPDATE = "auto_check_update";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String JOIN_PREVIEW_PROGRAM = "join_preview_program";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_AGREE_PRIVACY_KEY = "is_agree_privacy_key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "sms_forwarder.db";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PACKAGE_NAME = "com.idormy.sms.forwarder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_SMS = "enable_sms";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_PHONE = "enable_phone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CALL_TYPE_1 = "enable_call_type_1";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CALL_TYPE_2 = "enable_call_type_2";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CALL_TYPE_3 = "enable_call_type_3";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CALL_TYPE_4 = "enable_call_type_4";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CALL_TYPE_5 = "enable_call_type_5";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CALL_TYPE_6 = "enable_call_type_6";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_APP_NOTIFY = "enable_app_notify";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CANCEL_APP_NOTIFY = "enable_cancel_app_notify";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_CANCEL_EXTRA_APP_NOTIFY = "cancel_extra_app_notify_list";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_NOT_USER_PRESENT = "enable_not_user_present";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_SMS_COMMAND = "enable_sms_command";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SMS_COMMAND_SAFE_PHONE = "sms_command_safe_phone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENABLE_LOAD_APP_LIST = "enable_load_app_list";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENABLE_LOAD_USER_APP_LIST = "enable_load_user_app_list";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENABLE_LOAD_SYSTEM_APP_LIST = "enable_load_system_app_list";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_DUPLICATE_MESSAGES_LIMITS = "duplicate_messages_limits";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SILENT_PERIOD_START = "silent_period_start";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SILENT_PERIOD_END = "silent_period_end";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_SILENT_PERIOD_LOGS = "enable_silent_period_logs";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_EXCLUDE_FROM_RECENTS = "enable_exclude_from_recents";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_PLAY_SILENCE_MUSIC = "enable_play_silence_music";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_ONE_PIXEL_ACTIVITY = "enable_one_pixel_activity";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_REQUEST_RETRY_TIMES = "request_retry_times";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_REQUEST_DELAY_TIME = "request_delay_time";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_REQUEST_TIMEOUT = "request_timeout";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_NOTIFY_CONTENT = "notify_content";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_EXTRA_DEVICE_MARK = "extra_device_mark";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SUBID_SIM1 = "subid_sim1";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SUBID_SIM2 = "subid_sim2";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_EXTRA_SIM1 = "extra_sim1";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_EXTRA_SIM2 = "extra_sim2";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_SMS_TEMPLATE = "enable_sms_template";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SMS_TEMPLATE = "sms_template";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_PURE_CLIENT_MODE = "enable_pure_client_mode";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_PURE_TASK_MODE = "enable_pure_task_mode";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_DEBUG_MODE = "enable_debug_mode";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION = "enable_location";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION_ACCURACY = "location_accuracy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION_POWER_REQUIREMENT = "location_power_requirement";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION_MIN_INTERVAL = "location_min_interval_time";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION_MIN_DISTANCE = "location_min_distance";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BLUETOOTH = "enable_bluetooth";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BLUETOOTH_SCAN_INTERVAL = "bluetooth_scan_interval";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BLUETOOTH_IGNORE_ANONYMOUS = "bluetooth_ignore_anonymous";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_CACTUS = "enable_cactus";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CACTUS_TIMER = "cactus_timer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CACTUS_LAST_TIMER = "cactus_last_timer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CACTUS_DATE = "cactus_date";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CACTUS_END_DATE = "cactus_end_date";
    public static final int STATUS_ON = 1;
    public static final int STATUS_OFF = 0;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_TRANSPOND_ALL = "transpond_all";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_PHONE_NUM = "phone_num";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_CALL_TYPE = "call_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_PACKAGE_NAME = "package_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_UID = "uid";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_MSG_CONTENT = "msg_content";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_INFORM_CONTENT = "inform_content";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FILED_MULTI_MATCH = "multi_match";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_IS = "is";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_CONTAIN = "contain";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_NOT_CONTAIN = "notcontain";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_START_WITH = "startwith";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_END_WITH = "endwith";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_NOT_IS = "notis";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_REGEX = "regex";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_SIM_SLOT_ALL = "ALL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_SIM_SLOT_1 = "SIM1";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHECK_SIM_SLOT_2 = "SIM2";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SENDER_LOGIC_ALL = "ALL";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SENDER_LOGIC_UNTIL_FAIL = "UntilFail";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SENDER_LOGIC_UNTIL_SUCCESS = "UntilSuccess";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SENDER_LOGIC_RETRY = "Retry";
    public static final int TYPE_DINGTALK_GROUP_ROBOT = 0;
    public static final int TYPE_EMAIL = 1;
    public static final int TYPE_BARK = 2;
    public static final int TYPE_WEBHOOK = 3;
    public static final int TYPE_WEWORK_ROBOT = 4;
    public static final int TYPE_WEWORK_AGENT = 5;
    public static final int TYPE_SERVERCHAN = 6;
    public static final int TYPE_TELEGRAM = 7;
    public static final int TYPE_SMS = 8;
    public static final int TYPE_FEISHU = 9;
    public static final int TYPE_PUSHPLUS = 10;
    public static final int TYPE_GOTIFY = 11;
    public static final int TYPE_DINGTALK_INNER_ROBOT = 12;
    public static final int TYPE_FEISHU_APP = 13;
    public static final int TYPE_URL_SCHEME = 14;
    public static final int TYPE_SOCKET = 15;
    public static final int FRONT_NOTIFY_ID = 4112;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRONT_CHANNEL_ID = "com.idormy.sms.forwarder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRONT_CHANNEL_NAME = "SmsForwarder Foreground Service";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRPC_LIB_DOWNLOAD_URL = "https://xupdate.ppps.cn/uploads/%s/%s/libgojni.so";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String FRPC_LIB_VERSION = "0.57.0";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_FRPC_UPDATE_CONFIG = "EVENT_FRPC_UPDATE_CONFIG";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_FRPC_DELETE_CONFIG = "EVENT_FRPC_DELETE_CONFIG";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_FRPC_RUNNING_ERROR = "EVENT_FRPC_RUNNING_ERROR";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_FRPC_RUNNING_SUCCESS = "EVENT_FRPC_RUNNING_SUCCESS";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_FRPC_EDIT_FILE = "INTENT_FRPC_EDIT_FILE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_FRPC_APPLY_FILE = "INTENT_FRPC_APPLY_FILE";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_ALARM_ACTION = "EVENT_ALARM_ACTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_TOAST_SUCCESS = "key_toast_success";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_TOAST_ERROR = "key_toast_error";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_TOAST_INFO = "key_toast_info";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_TOAST_WARNING = "key_toast_warning";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SENDER_ID = "key_sender_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SENDER_TYPE = "key_sender_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SENDER_CLONE = "key_sender_clone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SENDER_TEST = "key_sender_test";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RULE_ID = "key_rule_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RULE_TYPE = "key_rule_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_RULE_CLONE = "key_rule_clone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_DEFAULT_SELECTION = "key_default_selection";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TASK_ID = "key_task_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TASK_TYPE = "key_task_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TASK_CLONE = "key_task_clone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_LOAD_APP_LIST = "EVENT_LOAD_APP_LIST";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_KEY_SIM_SLOT = "EVENT_KEY_SIM_SLOT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EVENT_KEY_PHONE_NUMBERS = "EVENT_KEY_PHONE_NUMBERS";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_UPDATE_URL = "https://xupdate.ppps.cn/update/checkVersion";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PREVIEW_URL = "https://xupdate.ppps.cn/preview/checkVersion";
    public static final int HTTP_SERVER_PORT = 5000;
    public static final int HTTP_SERVER_TIME_OUT = 10;
    public static final int HTTP_SUCCESS_CODE = 200;
    public static final int HTTP_FAILURE_CODE = 500;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_SERVER_AUTORUN = "enable_server_autorun";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_SAFETY_MEASURES = "server_safety_measures";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_SIGN_KEY = "server_sign_key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_TIME_TOLERANCE = "server_time_tolerance";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_SM4_KEY = "server_sm4_key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_PUBLIC_KEY = "server_public_key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_PRIVATE_KEY = "server_private_key";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_WEB_PATH = "server_web_path";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_CLONE = "enable_api_clone";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_SMS_SEND = "enable_api_sms_send";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_SMS_QUERY = "enable_api_sms_query";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_CALL_QUERY = "enable_api_call_query";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_CONTACT_QUERY = "enable_api_contact_query";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_CONTACT_ADD = "enable_api_contact_add";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_BATTERY_QUERY = "enable_api_battery_query";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_WOL = "enable_api_wol";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_ENABLE_API_LOCATION = "enable_api_location";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_API_LOCATION_CACHE = "api_location_cache";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_WOL_HISTORY = "wol_history";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_ADDRESS = "server_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_HISTORY = "server_history";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SERVER_CONFIG = "server_config";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_CLIENT_SAFETY_MEASURES = "client_safety_measures";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_CLIENT_SIGN_KEY = "client_sign_key";
    public static final int MAX_SETTING_NUM = 5;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TEST_CONDITION = "key_test_condition";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_EVENT_DATA_CONDITION = "event_data_condition";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_EVENT_PARAMS_CONDITION = "event_params_condition";
    public static final int KEY_BACK_CODE_CONDITION = 1000;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BACK_DATA_CONDITION = "back_data_condition";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BACK_DESCRIPTION_CONDITION = "back_description_condition";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_EVENT_DATA_ACTION = "event_data_action";
    public static final int KEY_BACK_CODE_ACTION = 2000;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BACK_DATA_ACTION = "back_data_action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_BACK_DESCRIPTION_ACTION = "back_description_action";
    public static final int TASK_CONDITION_CRON = 1000;
    public static final int TASK_CONDITION_TO_ADDRESS = 1001;
    public static final int TASK_CONDITION_LEAVE_ADDRESS = 1002;
    public static final int TASK_CONDITION_NETWORK = 1003;
    public static final int TASK_CONDITION_SIM = 1004;
    public static final int TASK_CONDITION_BATTERY = 1005;
    public static final int TASK_CONDITION_CHARGE = 1006;
    public static final int TASK_CONDITION_LOCK_SCREEN = 1007;
    public static final int TASK_CONDITION_SMS = 1008;
    public static final int TASK_CONDITION_CALL = 1009;
    public static final int TASK_CONDITION_APP = 1010;
    public static final int TASK_CONDITION_BLUETOOTH = 1011;
    public static final int TASK_ACTION_SENDSMS = 2000;
    public static final int TASK_ACTION_NOTIFICATION = 2001;
    public static final int TASK_ACTION_CLEANER = 2002;
    public static final int TASK_ACTION_SETTINGS = 2003;
    public static final int TASK_ACTION_FRPC = 2004;
    public static final int TASK_ACTION_HTTPSERVER = 2005;
    public static final int TASK_ACTION_RULE = 2006;
    public static final int TASK_ACTION_SENDER = 2007;
    public static final int TASK_ACTION_ALARM = 2008;
    public static final int TASK_ACTION_RESEND = 2009;
    public static final int TASK_ACTION_TASK = 2010;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BATTERY_INFO = "battery_info";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BATTERY_STATUS = "battery_status";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BATTERY_LEVEL = "battery_level";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BATTERY_PCT = "battery_pct";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BATTERY_PLUGGED = "battery_plugged";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_NETWORK_STATE = "network_state";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_DATA_SIM_SLOT = "data_sim_slot";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_WIFI_SSID = "wifi_ssid";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_IPV4 = "ipv4";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_IPV6 = "ipv6";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_IP_LIST = "ip_list";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_SIM_STATE = "sim_state";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION_INFO_OLD = "location_info_old";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCATION_INFO_NEW = "location_info_new";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_LOCK_SCREEN_ACTION = "lock_screen_action";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_CONNECTED_DEVICE = "connected_device";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_DISCOVERED_DEVICES = "discovered_devices";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SP_BLUETOOTH_STATE = "bluetooth_state";
    public static final long DELAY_TIME_AFTER_SIM_READY = 5000L;
    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, java.lang.String>[] TAG_LIST = null;
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Map<java.lang.String, java.lang.String>[] getTAG_LIST() {
        return null;
    }
}