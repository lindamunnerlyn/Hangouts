// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

public final class fjy
{

    private final fkr a;

    public fjy(fkr fkr1)
    {
        a = (fkr)h.a(fkr1);
    }

    public void a()
    {
        try
        {
            a.g();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof fjy))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((fjy)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new af(((RemoteException) (obj)));
        }
        return flag;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
        return i;
    }
}
