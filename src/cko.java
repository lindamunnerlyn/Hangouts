// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cko extends gbk
{

    final DebugActivity a;

    public cko(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    protected Object a()
    {
        DebugActivity.a(a, new aoe(a, DebugActivity.b(a).h()));
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        DebugActivity.a(a);
    }
}
