// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

public final class dzs
{

    final String a;
    final BroadcastReceiver b = new dzt(this);
    private final Context c;
    private final String d;

    public dzs(Context context, String s, String s1)
    {
        c = context;
        d = s;
        a = s1;
    }

    public void a()
    {
        eq.a(c).a(b, new IntentFilter(d));
    }

    public void b()
    {
        eq.a(c).a(b);
    }
}
