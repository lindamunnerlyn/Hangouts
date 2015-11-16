// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;

public final class emt extends emr
{

    int a;
    private Account b;
    private Context c;

    public static Account a(emq emq1)
    {
        Account account = null;
        if (emq1 != null)
        {
            long l = Binder.clearCallingIdentity();
            try
            {
                account = emq1.a();
            }
            // Misplaced declaration of an exception variable
            catch (emq emq1)
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
        throw emq1;
    }

    public Account a()
    {
        int i = Binder.getCallingUid();
        if (i == a)
        {
            return b;
        }
        if (ejn.a(c, i))
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
        if (!(obj instanceof emt))
        {
            return false;
        } else
        {
            return b.equals(((emt)obj).b);
        }
    }
}
