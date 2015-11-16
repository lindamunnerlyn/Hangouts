// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

final class y
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    final int a[];
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList j;
    final ArrayList k;

    public y(Parcel parcel)
    {
        a = parcel.createIntArray();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readInt();
        f = parcel.readInt();
        g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.readInt();
        i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        j = parcel.createStringArrayList();
        k = parcel.createStringArrayList();
    }

    public y(t t1)
    {
        w w1 = t1.c;
        int l;
        int i1;
        for (l = 0; w1 != null; l = i1)
        {
            i1 = l;
            if (w1.i != null)
            {
                i1 = l + w1.i.size();
            }
            w1 = w1.a;
        }

        a = new int[l + t1.e * 7];
        if (!t1.l)
        {
            throw new IllegalStateException("Not on back stack");
        }
        w1 = t1.c;
        l = 0;
        while (w1 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = w1.c;
            ai = a;
            int k1 = j1 + 1;
            if (w1.d != null)
            {
                l = w1.d.p;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = k1 + 1;
            ai[k1] = w1.e;
            ai = a;
            j1 = l + 1;
            ai[l] = w1.f;
            ai = a;
            l = j1 + 1;
            ai[j1] = w1.g;
            ai = a;
            j1 = l + 1;
            ai[l] = w1.h;
            if (w1.i != null)
            {
                int l1 = w1.i.size();
                int ai1[] = a;
                l = j1 + 1;
                ai1[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((ad)w1.i.get(j1)).p;
                    j1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = 0;
            }
            w1 = w1.a;
        }
        b = t1.j;
        c = t1.k;
        d = t1.n;
        e = t1.p;
        f = t1.q;
        g = t1.r;
        h = t1.s;
        i = t1.t;
        j = t1.u;
        k = t1.v;
    }

    public t a(aq aq1)
    {
        t t1 = new t(aq1);
        int j1 = 0;
        for (int l = 0; l < a.length;)
        {
            w w1 = new w();
            int ai[] = a;
            int i1 = l + 1;
            w1.c = ai[l];
            if (aq.a)
            {
                (new StringBuilder("Instantiate ")).append(t1).append(" op #").append(j1).append(" base fragment #").append(a[i1]);
            }
            ai = a;
            l = i1 + 1;
            i1 = ai[i1];
            int l1;
            if (i1 >= 0)
            {
                w1.d = (ad)aq1.f.get(i1);
            } else
            {
                w1.d = null;
            }
            ai = a;
            i1 = l + 1;
            w1.e = ai[l];
            ai = a;
            l = i1 + 1;
            w1.f = ai[i1];
            ai = a;
            i1 = l + 1;
            w1.g = ai[l];
            ai = a;
            l = i1 + 1;
            w1.h = ai[i1];
            ai = a;
            i1 = l + 1;
            l1 = ai[l];
            l = i1;
            if (l1 > 0)
            {
                w1.i = new ArrayList(l1);
                int k1 = 0;
                do
                {
                    l = i1;
                    if (k1 >= l1)
                    {
                        break;
                    }
                    if (aq.a)
                    {
                        (new StringBuilder("Instantiate ")).append(t1).append(" set remove fragment #").append(a[i1]);
                    }
                    ad ad1 = (ad)aq1.f.get(a[i1]);
                    w1.i.add(ad1);
                    k1++;
                    i1++;
                } while (true);
            }
            t1.a(w1);
            j1++;
        }

        t1.j = b;
        t1.k = c;
        t1.n = d;
        t1.p = e;
        t1.l = true;
        t1.q = f;
        t1.r = g;
        t1.s = h;
        t1.t = i;
        t1.u = j;
        t1.v = k;
        t1.a(1);
        return t1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeIntArray(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        TextUtils.writeToParcel(g, parcel, 0);
        parcel.writeInt(h);
        TextUtils.writeToParcel(i, parcel, 0);
        parcel.writeStringList(j);
        parcel.writeStringList(k);
    }

}
