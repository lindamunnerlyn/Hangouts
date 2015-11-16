// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class buf
{

    private final beb a = (new bec()).a("knocking").b("Module that enables responding to knocks").a(true).a();

    public buf()
    {
    }

    public btu a(Context context)
    {
        if (a.a(context))
        {
            return new buq();
        } else
        {
            return null;
        }
    }

    public beb[] a()
    {
        return (new beb[] {
            a
        });
    }

    public bts b(Context context)
    {
        if (a.a(context))
        {
            return new btz(context);
        } else
        {
            return null;
        }
    }

    public bsh[] c(Context context)
    {
        return (bsh[])a.a(context, bsh, new bsh[] {
            new bug(this), new buh(this)
        });
    }
}
