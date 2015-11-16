// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;

public final class fir
{

    public final fjd a;
    private fiz b;

    protected fir(fjd fjd1)
    {
        a = (fjd)g.d(fjd1);
    }

    public final fiz a()
    {
        fiz fiz1;
        try
        {
            if (b == null)
            {
                b = new fiz(a.k());
            }
            fiz1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
        return fiz1;
    }

    public final fmu a(MarkerOptions markeroptions)
    {
        try
        {
            markeroptions = a.a(markeroptions);
        }
        // Misplaced declaration of an exception variable
        catch (MarkerOptions markeroptions)
        {
            throw new af(markeroptions);
        }
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        markeroptions = new fmu(markeroptions);
        return markeroptions;
        return null;
    }
}
