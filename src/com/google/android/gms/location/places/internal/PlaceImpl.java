// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import erf;
import fik;
import fil;
import fin;
import g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalization

public final class PlaceImpl
    implements SafeParcelable, fik
{

    public static final fil CREATOR = new fil();
    final int a;
    final boolean b;
    private final String c;
    private final Bundle d;
    private final PlaceLocalization e;
    private final LatLng f;
    private final float g;
    private final LatLngBounds h;
    private final String i;
    private final Uri j;
    private final boolean k;
    private final float l;
    private final int m;
    private final long n;
    private final List o;
    private final List p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final List u;
    private final Map v = Collections.unmodifiableMap(new HashMap());
    private final TimeZone w = null;
    private Locale x;
    private fin y;

    public PlaceImpl(int i1, String s1, List list, List list1, Bundle bundle, String s2, String s3, 
            String s4, String s5, List list2, LatLng latlng, float f1, LatLngBounds latlngbounds, String s6, 
            Uri uri, boolean flag, float f2, int j1, long l1, boolean flag1, 
            PlaceLocalization placelocalization)
    {
        a = i1;
        c = s1;
        p = Collections.unmodifiableList(list);
        o = list1;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        d = bundle;
        q = s2;
        r = s3;
        s = s4;
        t = s5;
        if (list2 == null)
        {
            list2 = Collections.emptyList();
        }
        u = list2;
        f = latlng;
        g = f1;
        h = latlngbounds;
        if (s6 == null)
        {
            s6 = "UTC";
        }
        i = s6;
        j = uri;
        k = flag;
        l = f2;
        m = j1;
        n = l1;
        x = null;
        b = flag1;
        e = placelocalization;
    }

    private void a(String s1)
    {
        if (b && y != null)
        {
            y.a(c, s1);
        }
    }

    private List g()
    {
        a("getPlaceTypes");
        return p;
    }

    private List h()
    {
        a("getTypesDeprecated");
        return o;
    }

    private String i()
    {
        a("getName");
        return q;
    }

    private String j()
    {
        a("getAddress");
        return r;
    }

    private float k()
    {
        a("getLevelNumber");
        return g;
    }

    private LatLngBounds l()
    {
        a("getViewport");
        return h;
    }

    private Uri m()
    {
        a("getWebsiteUri");
        return j;
    }

    private String n()
    {
        a("getPhoneNumber");
        return s;
    }

    private String o()
    {
        a("getRegularOpenHours");
        return t;
    }

    private List p()
    {
        a("getAttributions");
        return u;
    }

    private boolean q()
    {
        a("isPermanentlyClosed");
        return k;
    }

    private float r()
    {
        a("getRating");
        return l;
    }

    private int s()
    {
        a("getPriceLevel");
        return m;
    }

    private long t()
    {
        return n;
    }

    private Bundle u()
    {
        return d;
    }

    private String v()
    {
        return i;
    }

    private PlaceLocalization w()
    {
        a("getLocalization");
        return e;
    }

    public boolean C_()
    {
        return true;
    }

    public String a()
    {
        a("getId");
        return c;
    }

    public void a(fin fin1)
    {
        y = fin1;
    }

    public CharSequence b()
    {
        return j();
    }

    public CharSequence c()
    {
        return i();
    }

    public LatLng d()
    {
        a("getLatLng");
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceImpl))
            {
                return false;
            }
            obj = (PlaceImpl)obj;
            if (!c.equals(((PlaceImpl) (obj)).c) || !g.a(x, ((PlaceImpl) (obj)).x) || n != ((PlaceImpl) (obj)).n)
            {
                return false;
            }
        }
        return true;
    }

    public Object f()
    {
        return this;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, x, Long.valueOf(n)
        });
    }

    public String toString()
    {
        return g.c(this).a("id", c).a("placeTypes", p).a("locale", x).a("name", q).a("address", r).a("phoneNumber", s).a("latlng", f).a("viewport", h).a("websiteUri", j).a("isPermanentlyClosed", Boolean.valueOf(k)).a("priceLevel", Integer.valueOf(m)).a("timestampSecs", Long.valueOf(n)).toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = g.p(parcel, 20293);
        g.a(parcel, 1, a());
        g.a(parcel, 2, u());
        g.a(parcel, 3, w(), i1);
        g.a(parcel, 4, d(), i1);
        g.a(parcel, 5, k());
        g.a(parcel, 6, l(), i1);
        g.a(parcel, 7, v());
        g.a(parcel, 8, m(), i1);
        g.a(parcel, 9, q());
        g.a(parcel, 10, r());
        g.b(parcel, 11, s());
        g.a(parcel, 12, t());
        g.a(parcel, 13, h());
        g.a(parcel, 14, j());
        g.a(parcel, 15, n());
        g.b(parcel, 17, p());
        g.a(parcel, 16, o());
        g.b(parcel, 1000, a);
        g.a(parcel, 19, i());
        g.a(parcel, 18, b);
        g.a(parcel, 20, g());
        g.q(parcel, j1);
    }

}
