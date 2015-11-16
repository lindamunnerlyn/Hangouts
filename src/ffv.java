// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;

public final class ffv
{

    public final fgh a;
    private fgd b;

    protected ffv(fgh fgh1)
    {
        a = (fgh)h.a(fgh1);
    }

    public final fgd a()
    {
        fgd fgd1;
        try
        {
            if (b == null)
            {
                b = new fgd(a.k());
            }
            fgd1 = b;
        }
        catch (RemoteException remoteexception)
        {
            throw new af(remoteexception);
        }
        return fgd1;
    }

    public final fjy a(MarkerOptions markeroptions)
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
        markeroptions = new fjy(markeroptions);
        return markeroptions;
        return null;
    }
}
