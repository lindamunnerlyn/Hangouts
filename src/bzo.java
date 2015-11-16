// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

final class bzo
    implements fiy
{

    final double a;
    final double b;
    final String c;
    final String d;
    final ad e;
    final bzn f;

    bzo(bzn bzn1, double d1, double d2, String s, String s1, 
            ad ad)
    {
        f = bzn1;
        a = d1;
        b = d2;
        c = s;
        d = s1;
        e = ad;
        super();
    }

    public void a(fir fir1)
    {
        Object obj = f;
        double d1 = a;
        double d2 = b;
        String s = c;
        String s1 = d;
        Object obj1 = e;
        android.content.Context context = ((bzn) (obj)).getContext();
        if (context != null)
        {
            fix.a(context);
        }
        if (!g.a(g.nU, "babel_use_lite_mode_maps", dlb.f))
        {
            fiz fiz1 = fir1.a();
            fiz1.b();
            fiz1.a();
            obj = new bzp(((bzn) (obj)), d1, d2, s, ((ad) (obj1)));
            try
            {
                fir1.a.a(new fis(fir1, ((fit) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (fir fir1)
            {
                throw new af(fir1);
            }
        }
        obj = new LatLng(d1, d2);
        obj1 = g.a(((LatLng) (obj)));
        try
        {
            fir1.a.a(((fiq) (obj1)).a());
        }
        // Misplaced declaration of an exception variable
        catch (fir fir1)
        {
            throw new af(fir1);
        }
        fir1.a((new MarkerOptions()).a(((LatLng) (obj))).a(s).b(s1)).a();
    }
}
