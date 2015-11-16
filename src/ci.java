// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class ci extends cr
{

    ArrayList a;

    public ci()
    {
        a = new ArrayList();
    }

    public ci(cf cf1)
    {
        a = new ArrayList();
        a(cf1);
    }

    public ci a(CharSequence charsequence)
    {
        f = cf.d(charsequence);
        g = true;
        return this;
    }

    public ci b(CharSequence charsequence)
    {
        a.add(cf.d(charsequence));
        return this;
    }
}
