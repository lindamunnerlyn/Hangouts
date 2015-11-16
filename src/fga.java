// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fga extends ezs
{

    public fac d;
    private final ViewGroup e;
    private final Context f;
    private final GoogleMapOptions g;
    private final List h = new ArrayList();

    fga(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        e = viewgroup;
        f = context;
        g = googlemapoptions;
    }

    protected void a(fac fac1)
    {
        d = fac1;
        if (d == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        fgb.a(f);
        fac1 = fjw.a(f).a(fab.a(f), g);
        if (fac1 == null)
        {
            return;
        }
        d.a(new ezr(e, fac1));
        fgc fgc1;
        for (fac1 = h.iterator(); fac1.hasNext(); ((ezr)a()).a(fgc1))
        {
            fgc1 = (fgc)fac1.next();
        }

        try
        {
            h.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fac fac1)
        {
            throw new af(fac1);
        }
        // Misplaced declaration of an exception variable
        catch (fac fac1) { }
    }

    public void a(fgc fgc1)
    {
        if (a() != null)
        {
            ((ezr)a()).a(fgc1);
            return;
        } else
        {
            h.add(fgc1);
            return;
        }
    }
}
