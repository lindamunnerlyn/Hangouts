// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.content.Context;

class fzx
    implements fzs
{

    fzx()
    {
    }

    public String a(Context context, String s, String s1)
    {
        try
        {
            context = eld.c(context, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Cannot get Oauth2 token from GMS", context);
        }
        return context;
    }

    public void a(Context context, String s)
    {
        try
        {
            eld.b(context, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Cannot invalidate token", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AuthenticatorException("Cannot invalidate token", context);
        }
    }
}
