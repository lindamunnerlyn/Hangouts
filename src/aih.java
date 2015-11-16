// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class aih
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new aii();
    public final String a;
    public final int b;
    public final int c;
    public boolean d;
    public boolean e;
    public ang f;
    public String g;
    public long h;
    public String i;
    public String j;
    public int k;
    public List l;
    public boolean m;
    public boolean n;
    public boolean o;

    public aih(String s, int i1)
    {
        k = 0;
        l = new ArrayList();
        a = s;
        b = i1;
        h = -1L;
        c = 0;
    }

    public aih(String s, int i1, int j1)
    {
        k = 0;
        l = new ArrayList();
        a = s;
        b = i1;
        c = j1;
        h = -1L;
    }

    public int a()
    {
        switch (k)
        {
        default:
            return 0;

        case 2148: 
            return 1;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        Locale locale = Locale.US;
        String s3 = a;
        boolean flag = d;
        boolean flag1 = e;
        int i1 = b;
        int j1 = c;
        String s4 = g;
        String s;
        String s1;
        String s2;
        if (f != null)
        {
            s = f.toString();
        } else
        {
            s = "no-drafts";
        }
        if (i != null)
        {
            s1 = i;
        } else
        {
            s1 = "no-chatRingtoneUri";
        }
        if (j != null)
        {
            s2 = j;
        } else
        {
            s2 = "no-hangoutRingtoneUri";
        }
        return String.format(locale, "[%s;%s;%s;%d;%d;%s;%s;%s;%s]", new Object[] {
            s3, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(i1), Integer.valueOf(j1), s4, s, s1, s2
        });
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeBooleanArray(new boolean[] {
            d, e
        });
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeParcelable(f, 0);
        parcel.writeString(g);
        parcel.writeInt(ebr.a(m));
        parcel.writeLong(h);
        parcel.writeString(i);
        parcel.writeInt(k);
        parcel.writeString(j);
        parcel.writeList(l);
        parcel.writeInt(ebr.a(n));
        parcel.writeInt(ebr.a(o));
    }

}
