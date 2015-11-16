// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

final class az
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ba();
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    ad k;

    public az(ad ad1)
    {
        a = ad1.getClass().getName();
        b = ad1.p;
        c = ad1.y;
        d = ad1.G;
        e = ad1.H;
        f = ad1.I;
        g = ad1.L;
        h = ad1.K;
        i = ad1.r;
    }

    public az(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readInt();
        e = parcel.readInt();
        f = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
        i = parcel.readBundle();
        j = parcel.readBundle();
    }

    public ad a(ao ao1, ad ad1)
    {
        if (k != null)
        {
            return k;
        }
        Context context = ao1.i();
        if (i != null)
        {
            i.setClassLoader(context.getClassLoader());
        }
        k = ad.instantiate(context, a, i);
        if (j != null)
        {
            j.setClassLoader(context.getClassLoader());
            k.n = j;
        }
        k.a(b, ad1);
        k.y = c;
        k.A = true;
        k.G = d;
        k.H = e;
        k.I = f;
        k.L = g;
        k.K = h;
        k.C = ao1.d;
        if (aq.a)
        {
            (new StringBuilder("Instantiated fragment ")).append(k);
        }
        return k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeInt(b);
        if (c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeString(f);
        if (g)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        if (h)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeBundle(i);
        parcel.writeBundle(j);
    }

}
