// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import java.io.InputStream;
import java.util.List;

final class hlw extends HttpTransport
{

    private int a;
    private InputStream b;
    private List c;
    private List d;

    hlw(int i, InputStream inputstream, List list, List list1)
    {
        a = i;
        b = inputstream;
        c = list;
        d = list1;
    }

    protected LowLevelHttpRequest buildRequest(String s, String s1)
    {
        return new hlu(b, a, c, d);
    }
}
