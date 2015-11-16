// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class hgt
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hgu();
    public final int a;
    public final String b[];
    public final int c[];

    public hgt(int i, String as[], int ai[])
    {
        a = i;
        b = as;
        c = ai;
    }

    hgt(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.createStringArray();
        c = parcel.createIntArray();
    }

    hgy a()
    {
        return new hgy(b, c);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeStringArray(b);
        parcel.writeIntArray(c);
    }

}
