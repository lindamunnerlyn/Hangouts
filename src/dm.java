// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class dm
{

    private final String a;
    private CharSequence b;
    private CharSequence c[];
    private boolean d;
    private Bundle e;

    public dm(String s)
    {
        d = true;
        e = new Bundle();
        a = s;
    }

    public dm a()
    {
        d = false;
        return this;
    }

    public dm a(CharSequence charsequence)
    {
        b = charsequence;
        return this;
    }

    public dm a(CharSequence acharsequence[])
    {
        c = acharsequence;
        return this;
    }

    public dl b()
    {
        return new dl(a, b, c, d, e);
    }
}
