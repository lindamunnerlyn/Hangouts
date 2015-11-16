// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.util.concurrent.Callable;

public final class fba
    implements Callable
{

    final Activity a;

    public fba(Activity activity)
    {
        a = activity;
        super();
    }

    public Object call()
    {
        return g.c(a);
    }
}
