// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.concurrent.TimeUnit;

class fxt
    implements fxq
{

    private static final long b;
    public final Context a;

    public fxt(Context context)
    {
        a = context;
    }

    public String a(String s, String s1)
    {
        try
        {
            s = eic.a(a, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fxr(s.getMessage(), s.b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fxp(s);
        }
        return s;
    }

    public Account[] a(String s)
    {
        return AccountManager.get(a).getAccountsByType(s);
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(2L);
    }
}
