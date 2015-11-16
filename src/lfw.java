// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

class lfw extends lfv
{

    public final int d;

    protected lfw(lcz lcz1, int i, boolean flag, int j)
    {
        super(lcz1, i, flag);
        d = j;
    }

    public int a()
    {
        return b;
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd, Locale locale)
    {
        try
        {
            lgj.a(stringbuffer, a.a(lcw).a(l), d);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lcw lcw)
        {
            lfp.a(stringbuffer, d);
        }
    }
}
