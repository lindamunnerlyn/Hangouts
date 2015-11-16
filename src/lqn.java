// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lqn extends lqf
{

    protected lqn(lnj lnj1, int i, boolean flag)
    {
        super(lnj1, i, flag);
    }

    public int a()
    {
        return b;
    }

    public void a(StringBuffer stringbuffer, long l, lng lng, int i, lnn lnn, Locale locale)
    {
        try
        {
            lqt.a(stringbuffer, a.a(lng).a(l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lng lng)
        {
            stringbuffer.append('\uFFFD');
        }
    }
}
