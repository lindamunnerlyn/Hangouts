// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import org.chromium.net.CronetLibraryLoader;

public final class lmc
    implements Runnable
{

    final Context a;

    public lmc(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        CronetLibraryLoader.a(a);
    }
}
