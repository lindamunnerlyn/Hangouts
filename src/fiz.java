// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;

public final class fiz
{

    private final fkb a;

    fiz(fkb fkb1)
    {
        a = fkb1;
    }

    public void a()
    {
        try
        {
            a.a(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
    }

    public void b()
    {
        try
        {
            a.h(false);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
    }
}
