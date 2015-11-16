// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import java.util.List;

final class hqp extends LowLevelHttpRequest
{

    private InputStream a;
    private int b;
    private List c;
    private List d;

    hqp(InputStream inputstream, int i, List list, List list1)
    {
        a = inputstream;
        b = i;
        c = list;
        d = list1;
    }

    public void addHeader(String s, String s1)
    {
    }

    public LowLevelHttpResponse execute()
    {
        return new hqq(a, b, c, d);
    }
}
