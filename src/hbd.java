// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

final class hbd extends hav
{

    private final Context h;
    private final String i;
    private final String j;
    private final long k = 0L;
    private final long l;
    private final InputStream m;
    private final boolean n;
    private final hbg o;
    private HttpUrlRequest p;

    public hbd(Context context, hdt hdt1, String s, String s1, long l1, long l2, InputStream inputstream, boolean flag, hbg hbg)
    {
        super(hdt1);
        h = context;
        i = s;
        j = s1;
        l = l2;
        m = inputstream;
        n = flag;
        o = hbg;
    }

    public void a()
    {
        gz gz1 = new gz();
        gz1.putAll(j().a(i));
        long l1 = k;
        long l2 = l;
        long l3 = l;
        gz1.put("Content-Range", (new StringBuilder(68)).append("bytes ").append(l1).append("-").append(l2 - 1L).append("/").append(l3).toString());
        p = hbl.a(h, i, 3, gz1, g);
        p.a(j, new hbk(Channels.newChannel(m), o, l - k), l - k);
        p.a("PUT");
    }

    protected void a(HttpUrlRequest httpurlrequest)
    {
    }

    protected HttpUrlRequest b()
    {
        return p;
    }

    public void c()
    {
        p.i();
    }
}
