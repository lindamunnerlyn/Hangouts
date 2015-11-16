// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class elf extends elc
{

    private final Intent a;

    public elf(String s, Intent intent)
    {
        super(s);
        a = intent;
    }

    public Intent b()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return new Intent(a);
        }
    }
}
