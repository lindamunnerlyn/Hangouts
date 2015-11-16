// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

final class cik
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cil();
    final int a;
    final Bundle b;
    final int c;

    cik(int i, int j, Bundle bundle)
    {
        c = i;
        a = j;
        b = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(c);
        parcel.writeInt(a);
        parcel.writeBundle(b);
    }

}
