// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class fqj
{

    private final StringBuilder a = new StringBuilder();
    private boolean b;

    public fqj()
    {
        b = false;
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            a.append(s);
            return;
        }
    }

    public void b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        if (b)
        {
            a.append(" AND ");
        }
        a.append(s);
        b = true;
    }

    public String toString()
    {
        return a.toString();
    }
}
