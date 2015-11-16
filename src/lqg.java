// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

class lqg extends lqf
{

    public final int d;

    protected lqg(lnj lnj1, int i, boolean flag, int j)
    {
        super(lnj1, i, flag);
        d = j;
    }

    public int a()
    {
        return b;
    }

    public void a(StringBuffer stringbuffer, long l, lng lng, int i, lnn lnn, Locale locale)
    {
        try
        {
            lqt.a(stringbuffer, a.a(lng).a(l), d);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lng lng)
        {
            lpz.a(stringbuffer, d);
        }
    }
}
