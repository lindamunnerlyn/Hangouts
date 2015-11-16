// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class byq
    implements byf
{

    public byq()
    {
    }

    private static String a(LatLng latlng)
    {
        double d = latlng.a;
        double d1 = latlng.b;
        return (new StringBuilder(49)).append(d).append(",").append(d1).toString();
    }

    public int a()
    {
        return g.a(g.nS, "babel_location_static_map_size", 400);
    }

    public Intent a(Context context)
    {
        try
        {
            fft fft1 = new fft();
            fft1.a(((gmo)hgx.a(context, gmo)).c().b("account_name"));
            context = fft1.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ebw.e("Babel", "GooglePlayServicesRepairableException", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ebw.e("Babel", "GooglePlayServicesNotAvailableException", context);
            return null;
        }
        return context;
    }

    public String a(ffo ffo1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("https://maps.googleapis.com/maps/api/staticmap");
        ffo1 = a(ffo1.d());
        stringbuilder.append("?center=").append(ffo1);
        stringbuilder.append("&markers=color:red%7C").append(ffo1);
        int i = a();
        stringbuilder.append("&size=").append(i).append("x").append(i);
        return stringbuilder.toString();
    }

    public void a(Context context, int i, int j)
    {
        context = (cia)hgx.a(context, cia);
        ArrayList arraylist = new ArrayList();
        arraylist.add("android.permission.ACCESS_FINE_LOCATION");
        arraylist.add("android.permission.ACCESS_COARSE_LOCATION");
        context.a(i, arraylist, j, null);
    }

    public void a(Context context, int i, byg byg)
    {
        ((cia)hgx.a(context, cia)).a(i, new byr(this, byg));
    }

    public byd b(Context context)
    {
        return new byn(context);
    }

    public String b(ffo ffo1)
    {
        String s = String.valueOf("https://maps.google.com/maps?q=");
        ffo1 = String.valueOf(a(ffo1.d()));
        if (ffo1.length() != 0)
        {
            return s.concat(ffo1);
        } else
        {
            return new String(s);
        }
    }

    public byc c(Context context)
    {
        return new byk(context);
    }
}
