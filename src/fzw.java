// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class fzw extends fzt
{

    private final Intent a;

    public fzw(String s, Intent intent)
    {
        super(s);
        a = intent;
    }

    public fzw(String s, Intent intent, Exception exception)
    {
        super(s, exception);
        a = intent;
    }

    public Intent a()
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
