// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class bzt
    implements bzi
{

    public bzt()
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
        return g.a(g.nU, "babel_location_static_map_size", 400);
    }

    public Intent a(Context context)
    {
        try
        {
            fip fip1 = new fip();
            fip1.a(((gqu)hlp.a(context, gqu)).c().b("account_name"));
            context = fip1.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eev.e("Babel", "GooglePlayServicesRepairableException", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eev.e("Babel", "GooglePlayServicesNotAvailableException", context);
            return null;
        }
        return context;
    }

    public String a(fik fik1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("https://maps.googleapis.com/maps/api/staticmap");
        fik1 = a(fik1.d());
        stringbuilder.append("?center=").append(fik1);
        stringbuilder.append("&markers=color:red%7C").append(fik1);
        int i = a();
        stringbuilder.append("&size=").append(i).append("x").append(i);
        return stringbuilder.toString();
    }

    public void a(Context context, int i, int j)
    {
        context = (cjg)hlp.a(context, cjg);
        ArrayList arraylist = new ArrayList();
        arraylist.add("android.permission.ACCESS_FINE_LOCATION");
        arraylist.add("android.permission.ACCESS_COARSE_LOCATION");
        context.a(i, arraylist, j, null);
    }

    public void a(Context context, int i, bzj bzj)
    {
        ((cjg)hlp.a(context, cjg)).a(i, new bzu(this, bzj));
    }

    public bzg b(Context context)
    {
        return new bzq(context);
    }

    public String b(fik fik1)
    {
        String s = String.valueOf("https://maps.google.com/maps?q=");
        fik1 = String.valueOf(a(fik1.d()));
        if (fik1.length() != 0)
        {
            return s.concat(fik1);
        } else
        {
            return new String(s);
        }
    }

    public bzf c(Context context)
    {
        return new bzn(context);
    }
}
