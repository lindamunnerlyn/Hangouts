// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class cjt
    implements ddy
{

    final boolean a;
    final BabelHomeActivity b;

    public cjt(BabelHomeActivity babelhomeactivity, boolean flag)
    {
        b = babelhomeactivity;
        a = flag;
        super();
    }

    public void a()
    {
        if (BabelHomeActivity.a(b))
        {
            b.m();
            BabelHomeActivity.a(b, a);
        }
    }

    public void b()
    {
    }
}
