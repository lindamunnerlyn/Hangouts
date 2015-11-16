// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.Executor;

public final class agd
{

    final Executor a;

    public agd(Handler handler)
    {
        a = new afo(this, handler);
    }

    public void a(afw afw1, aga aga1)
    {
        a(afw1, aga1, null);
    }

    public void a(afw afw1, aga aga1, Runnable runnable)
    {
        afw1.n();
        afw1.a("post-response");
        a.execute(new afp(this, afw1, aga1, runnable));
    }

    public void a(afw afw1, agh agh)
    {
        afw1.a("post-error");
        agh = aga.a(agh);
        a.execute(new afp(this, afw1, agh, null));
    }
}
