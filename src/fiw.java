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

public final class fiw extends fcq
{

    public fda d;
    private final ViewGroup e;
    private final Context f;
    private final GoogleMapOptions g;
    private final List h = new ArrayList();

    fiw(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        e = viewgroup;
        f = context;
        g = googlemapoptions;
    }

    protected void a(fda fda1)
    {
        d = fda1;
        if (d == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        fix.a(f);
        fda1 = fms.a(f).a(fcz.a(f), g);
        if (fda1 == null)
        {
            return;
        }
        d.a(new fcp(e, fda1));
        fiy fiy1;
        for (fda1 = h.iterator(); fda1.hasNext(); ((fcp)a()).a(fiy1))
        {
            fiy1 = (fiy)fda1.next();
        }

        try
        {
            h.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fda fda1)
        {
            throw new af(fda1);
        }
        // Misplaced declaration of an exception variable
        catch (fda fda1) { }
    }

    public void a(fiy fiy1)
    {
        if (a() != null)
        {
            ((fcp)a()).a(fiy1);
            return;
        } else
        {
            h.add(fiy1);
            return;
        }
    }
}
