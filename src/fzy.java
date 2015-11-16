// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.concurrent.TimeUnit;

class fzy
    implements fzu
{

    private static final long b;
    public final Context a;

    public fzy(Context context)
    {
        a = context;
    }

    public String a(String s, String s1)
    {
        try
        {
            s = eld.a(a, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fzv(s.a(), s.getMessage(), s.b(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fzw(s.getMessage(), s.b());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fzt(s);
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
