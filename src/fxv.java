// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;

final class fxv extends fxt
{

    public fxv(Context context)
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
            s = eic.c(a, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fxz(s.a(), s.getMessage(), s.b(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new fxy(((ejl) (s)).a, s);
        }
        return s;
    }
}
