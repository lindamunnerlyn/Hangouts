// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class hlv extends LowLevelHttpResponse
{

    private InputStream a;
    private int b;
    private List c;
    private List d;

    hlv(InputStream inputstream, int i, List list, List list1)
    {
        c = new ArrayList();
        d = new ArrayList();
        a = inputstream;
        b = i;
        c = list;
        d = list1;
    }

    public InputStream getContent()
    {
        return a;
    }

    public String getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        return 0L;
    }

    public String getContentType()
    {
        return null;
    }

    public int getHeaderCount()
    {
        return c.size();
    }

    public String getHeaderName(int i)
    {
        return (String)c.get(i);
    }

    public String getHeaderValue(int i)
    {
        return (String)d.get(i);
    }

    public String getReasonPhrase()
    {
        return null;
    }

    public int getStatusCode()
    {
        return b;
    }

    public String getStatusLine()
    {
        return null;
    }
}
