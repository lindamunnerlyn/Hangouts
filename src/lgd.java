// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class lgd extends lfv
{

    protected lgd(lcz lcz1, int i, boolean flag)
    {
        super(lcz1, i, flag);
    }

    public int a()
    {
        return b;
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd, Locale locale)
    {
        try
        {
            lgj.a(stringbuffer, a.a(lcw).a(l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (lcw lcw)
        {
            stringbuffer.append('\uFFFD');
        }
    }
}
