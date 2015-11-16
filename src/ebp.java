// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Iterator;
import java.util.List;

final class ebp
    implements Runnable
{

    final ebo a;

    ebp(ebo ebo1)
    {
        a = ebo1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = ebo.a(a).iterator(); iterator.hasNext(); ((ebq)iterator.next()).d()) { }
        ebo.b().postDelayed(ebo.b(a), ebo.a());
    }
}
