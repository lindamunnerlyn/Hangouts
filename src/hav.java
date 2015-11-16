// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import java.io.IOException;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

abstract class hav
{

    final ConditionVariable a = new ConditionVariable();
    int b;
    long c;
    byte d[];
    IOException e;
    boolean f;
    public final HttpUrlRequestListener g = new haw(this);
    private final hdt h;

    protected hav(hdt hdt)
    {
        h = hdt;
    }

    public abstract void a();

    protected abstract void a(HttpUrlRequest httpurlrequest);

    protected abstract HttpUrlRequest b();

    public final void d()
    {
        a.close();
        b().h();
        a.block();
    }

    public int e()
    {
        return b;
    }

    public long f()
    {
        return c;
    }

    public byte[] g()
    {
        return d;
    }

    public IOException h()
    {
        return e;
    }

    public boolean i()
    {
        return f;
    }

    public hdt j()
    {
        return h;
    }
}
