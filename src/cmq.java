// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmq
    implements Runnable
{

    final String a;
    final DebugActivity b;

    public cmq(DebugActivity debugactivity, String s)
    {
        b = debugactivity;
        a = s;
        super();
    }

    public void run()
    {
        DebugActivity.a(b, a, "conversations");
    }
}
