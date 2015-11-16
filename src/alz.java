// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;

public final class alz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ama();
    public final String a;
    public final Bundle b;
    public final alt c;
    public final long d;
    public final Bundle e;
    public int f;
    final String g;

    protected alz(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readBundle();
        c = (alt)parcel.readParcelable(alt.getClassLoader());
        d = parcel.readLong();
        e = parcel.readBundle();
        f = aly.a()[parcel.readInt()];
        g = parcel.readString();
    }

    public alz(String s, String s1, Bundle bundle, int i)
    {
        g.c(true);
        a = s;
        b = bundle;
        c = new alt(s1);
        d = 0L + SystemClock.elapsedRealtime();
        e = new Bundle();
        f = aly.a;
        g = Log.getStackTraceString(new Throwable());
    }

    public alx a(Class class1)
    {
        b.setClassLoader(class1.getClassLoader());
        class1 = b;
        if (class1 != null)
        {
            class1 = class1.getParcelable("concurrent_bundle_util_key");
        } else
        {
            class1 = null;
        }
        return (alx)class1;
    }

    public String a()
    {
        int j = a.lastIndexOf('.') + 1;
        int i = j;
        if (j >= a.length())
        {
            i = 0;
        }
        String s = String.valueOf(a.substring(i));
        String s1 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeBundle(b);
        parcel.writeParcelable(c, 0);
        parcel.writeLong(d);
        parcel.writeBundle(e);
        parcel.writeInt(f - 1);
        parcel.writeString(g);
    }

}
