// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class alk extends cfi
{

    private alk(Context context, int i)
    {
        super(context, i, null);
    }

    static void a(Context context, int i)
    {
        (new alk(context, i)).a(true);
    }

    protected void a(boolean flag)
    {
        CharSequence charsequence = cfo.a(o, aoc.b(o, p).b("display_name"), o.getString(g.je), null, 0);
        t.a(o.getString(l.n)).b(charsequence);
        super.a(flag);
    }

    protected boolean a()
    {
        return false;
    }

    protected Intent b()
    {
        return null;
    }

    protected boolean c()
    {
        return true;
    }

    protected int d()
    {
        return com.google.android.apps.hangouts.R.drawable.cb;
    }

    protected int e()
    {
        return 15;
    }

    protected int f()
    {
        return -1;
    }

    protected Intent g()
    {
        return g.d(dcn.e(p));
    }
}
