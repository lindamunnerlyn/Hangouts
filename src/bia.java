// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public final class bia extends bhx
    implements Serializable
{

    public final String a;
    public final String b;

    public bia(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
    {
        String s1 = String.valueOf(eey.p(a));
        String s;
        if (TextUtils.isEmpty(b))
        {
            s = "";
        } else
        {
            s = String.valueOf(b);
            if (s.length() != 0)
            {
                s = " ".concat(s);
            } else
            {
                s = new String(" ");
            }
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public String b()
    {
        return b;
    }

    public String toString()
    {
        return a;
    }
}
