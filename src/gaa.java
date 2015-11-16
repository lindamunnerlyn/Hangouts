// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;

final class gaa extends fzy
{

    public gaa(Context context)
    {
        super(context);
    }

    public Account[] a(String s)
    {
        if (android.os.Build.VERSION.SDK_INT <= 22)
        {
            return super.a(s);
        }
        try
        {
            s = eld.c(a, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new gan(s.a(), s.getMessage(), s.b(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new gam(((emm) (s)).a, s);
        }
        return s;
    }
}
