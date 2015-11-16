// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import hrx;
import java.nio.charset.Charset;

// Referenced classes of package com.google.api.client.http:
//            HttpContent, HttpMediaType

public abstract class AbstractHttpContent
    implements HttpContent
{

    private long computedLength;
    private HttpMediaType mediaType;

    protected AbstractHttpContent(HttpMediaType httpmediatype)
    {
        computedLength = -1L;
        mediaType = httpmediatype;
    }

    public AbstractHttpContent(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = new HttpMediaType(s);
        }
        this(((HttpMediaType) (s)));
    }

    public static long computeLength(HttpContent httpcontent)
    {
        if (!httpcontent.retrySupported())
        {
            return -1L;
        } else
        {
            return g.a(httpcontent);
        }
    }

    protected long computeLength()
    {
        return computeLength(((HttpContent) (this)));
    }

    public final Charset getCharset()
    {
        if (mediaType == null || mediaType.getCharsetParameter() == null)
        {
            return hrx.a;
        } else
        {
            return mediaType.getCharsetParameter();
        }
    }

    public long getLength()
    {
        if (computedLength == -1L)
        {
            computedLength = computeLength();
        }
        return computedLength;
    }

    public final HttpMediaType getMediaType()
    {
        return mediaType;
    }

    public String getType()
    {
        if (mediaType == null)
        {
            return null;
        } else
        {
            return mediaType.build();
        }
    }

    public boolean retrySupported()
    {
        return true;
    }

    public AbstractHttpContent setMediaType(HttpMediaType httpmediatype)
    {
        mediaType = httpmediatype;
        return this;
    }
}
