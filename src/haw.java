// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class haw
    implements HttpUrlRequestListener
{

    final hav a;

    haw(hav hav1)
    {
        a = hav1;
        super();
    }

    public void a(HttpUrlRequest httpurlrequest)
    {
        a.a(httpurlrequest);
    }

    public void b(HttpUrlRequest httpurlrequest)
    {
        a.b = httpurlrequest.b();
        a.c = httpurlrequest.a();
        a.d = httpurlrequest.f();
        a.e = httpurlrequest.d();
        a.f = httpurlrequest.j();
        a.a.open();
        return;
        httpurlrequest;
        a.a.open();
        throw httpurlrequest;
    }
}
