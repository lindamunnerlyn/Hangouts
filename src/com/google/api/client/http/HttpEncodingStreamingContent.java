// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import h;
import htb;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpEncoding

public final class HttpEncodingStreamingContent
    implements htb
{

    private final htb content;
    private final HttpEncoding encoding;

    public HttpEncodingStreamingContent(htb htb1, HttpEncoding httpencoding)
    {
        content = (htb)h.a(htb1);
        encoding = (HttpEncoding)h.a(httpencoding);
    }

    public htb getContent()
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
