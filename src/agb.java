// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.Executor;

public final class agb
{

    final Executor a;

    public agb(Handler handler)
    {
        a = new afm(this, handler);
    }

    public void a(afu afu1, afy afy1)
    {
        a(afu1, afy1, null);
    }

    public void a(afu afu1, afy afy1, Runnable runnable)
    {
        afu1.n();
        afu1.a("post-response");
        a.execute(new afn(this, afu1, afy1, runnable));
    }

    public void a(afu afu1, agf agf)
    {
        afu1.a("post-error");
        agf = afy.a(agf);
        a.execute(new afn(this, afu1, agf, null));
    }
}
