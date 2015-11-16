// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import h;
import hof;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpEncoding

public final class HttpEncodingStreamingContent
    implements hof
{

    private final hof content;
    private final HttpEncoding encoding;

    public HttpEncodingStreamingContent(hof hof1, HttpEncoding httpencoding)
    {
        content = (hof)h.b(hof1);
        encoding = (HttpEncoding)h.b(httpencoding);
    }

    public hof getContent()
    {
        return content;
    }

    public HttpEncoding getEncoding()
    {
        return encoding;
    }

    public void writeTo(OutputStream outputstream)
    {
        encoding.encode(content, outputstream);
    }
}
