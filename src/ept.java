// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;

public final class ept extends epr
{

    int a;
    private Account b;
    private Context c;

    public static Account a(epq epq1)
    {
        Account account = null;
        if (epq1 != null)
        {
            long l = Binder.clearCallingIdentity();
            try
            {
                account = epq1.a();
            }
            // Misplaced declaration of an exception variable
            catch (epq epq1)
            {
                Binder.restoreCallingIdentity(l);
                return null;
            }
            finally
            {
                Binder.restoreCallingIdentity(l);
            }
            Binder.restoreCallingIdentity(l);
        }
        return account;
        throw epq1;
    }

    public Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return b;
        }
        if (emo.a(c, i))
        {
            a = i;
            return b;
        } else
        {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ept))
        {
            return false;
        } else
        {
            return b.equals(((ept)obj).b);
        }
    }
}
